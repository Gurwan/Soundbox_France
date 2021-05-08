/*
 * *******************************************************
 * Copyright (c) 2020. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.provider.Settings;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.core.content.FileProvider;

import automation.test.soundboxfrance.activity.FavoriteActivity;
import automation.test.soundboxfrance.activity.IntoPlaylistActivity;
import automation.test.soundboxfrance.model.Playlist;
import automation.test.soundboxfrance.model.SoundObject;


public class EventHandlerClass {

    private static final String LOG_TAG = "EVENTHANDLER";
    private static MediaPlayer mp;
    private static DatabaseHandler databaseHandler;

    public static void startMediaPlayer(View view, Integer soundID) {
        try {
            if (soundID != null) {
                if (mp != null) {
                    mp.reset();
                }
                mp = MediaPlayer.create(view.getContext(), soundID);
                mp.start();
            }
        } catch (Exception e) {
            Log.e(LOG_TAG, "Impossible d'initialiser MediaPlayer: " + e.getMessage());
        }
    }


    public static void releaseMediaPlayer() {
        if (mp != null) {
            mp.release();
            mp = null;
        }
    }

    public static void popupManager(final View view, final SoundObject soundObject) {
        databaseHandler = new DatabaseHandler(view.getContext());
        PopupMenu popup = new PopupMenu(view.getContext(), view);

        if (view.getContext() instanceof FavoriteActivity){
            popup.getMenuInflater().inflate(R.menu.favo_longclick, popup.getMenu());
        } else if (view.getContext() instanceof IntoPlaylistActivity){
            popup.getMenuInflater().inflate(R.menu.longclick_playlist, popup.getMenu());
        } else {
            popup.getMenuInflater().inflate(R.menu.longclick, popup.getMenu());
        }

        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.action_send || menuItem.getItemId() == R.id.action_ringtone) {
                    final String fileName = soundObject.getItemName().replaceAll("\\s","_") + ".mp3";
                    File storageDir = new File(Environment.getExternalStorageDirectory().toString(),"/soundbox_france/");
                    storageDir.mkdirs();
                    final File file = new File(storageDir, fileName);
                    InputStream in = view.getContext().getResources().openRawResource(soundObject.getItemID());
                    try {
                        OutputStream out = new FileOutputStream(file);
                        byte[] buffer = new byte[1024];
                        int len;
                        while ((len = in.read(buffer, 0, buffer.length)) != -1) {
                            out.write(buffer, 0, len);
                        }
                        in.close();
                        out.close();
                    } catch (IOException e) {
                        Log.e(LOG_TAG, "Impossible de sauvegarder le fichier: " + e.getMessage());
                    }

                    if (menuItem.getItemId() == R.id.action_send) {
                        final String AUTHORITY = view.getContext().getPackageName() + ".fileprovider";
                        Uri contentUri = FileProvider.getUriForFile(view.getContext(), AUTHORITY, file);
                        Intent sendIntent = new Intent(Intent.ACTION_SEND);
                        sendIntent.putExtra(Intent.EXTRA_STREAM, contentUri);
                        sendIntent.setType("audio/mp3");
                        Intent shareIntent = Intent.createChooser(sendIntent,"Partage le son via ...");
                        view.getContext().startActivity(shareIntent);
                    }

                    if (menuItem.getItemId() == R.id.action_ringtone) {
                        if(!Settings.System.canWrite(view.getContext().getApplicationContext())){
                            Intent intent = new Intent(Settings.ACTION_MANAGE_WRITE_SETTINGS, Uri.parse("package:" + view.getContext().getPackageName()));
                            view.getContext().startActivity(intent);
                        }
                        AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext(), R.style.Theme_MaterialComponents_Light_Dialog_Alert);
                        builder.setTitle("Sauvegarder comme...");
                        builder.setItems(new CharSequence[]{"Sonnerie", "Notification", "Alarme"}, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                switch (which) {
                                    case 0:
                                        changeSystemAudio(view, fileName, file, 1);
                                        break;
                                    case 1:
                                        changeSystemAudio(view, fileName, file, 2);
                                        break;
                                    case 2:
                                        changeSystemAudio(view, fileName, file, 3);
                                        break;
                                }
                            }
                        });
                        builder.create();
                        builder.show();
                    }
                } else if (menuItem.getItemId() == R.id.action_favorite) {
                    if (view.getContext() instanceof FavoriteActivity)
                        databaseHandler.removeFavorite(view.getContext(), soundObject);
                    else
                        databaseHandler.addFavorite(soundObject);
                } else if (menuItem.getItemId() == R.id.action_playlist){
                    if (view.getContext() instanceof IntoPlaylistActivity){
                        databaseHandler.deleteOfPlaylist(soundObject,view.getContext());
                    } else {
                        AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext(), R.style.Theme_MaterialComponents_Light_Dialog_Alert);
                        builder.setTitle("Ajouter à...");
                        ArrayList<String> playlistsArrayList = new ArrayList<>();
                        ArrayList<Playlist> playlistsList = new ArrayList<>();
                        Cursor cursor = databaseHandler.getPlaylistCollection();
                        while(cursor.moveToNext()){
                            int id = cursor.getInt(cursor.getColumnIndex("_id"));
                            String name = cursor.getString(cursor.getColumnIndex("playlistName"));
                            Playlist p = new Playlist(name,id);
                            playlistsList.add(p);
                            playlistsArrayList.add(name);
                        }

                        CharSequence[] playlists = playlistsArrayList.toArray(new CharSequence[playlistsArrayList.size()]);

                        builder.setItems(playlists, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                databaseHandler.addToPlaylist(soundObject,playlistsList.get(which).getId());
                            }
                        });
                        builder.create();
                        builder.show();
                    }

                }
                return true;
            }
        });
        popup.show();
    }

    public static void popupManagerFav(final View view, final SoundObject soundObject) {
        databaseHandler = new DatabaseHandler(view.getContext());
        PopupMenu popup = new PopupMenu(view.getContext(), view);

        popup.getMenuInflater().inflate(R.menu.favo_longclick, popup.getMenu());
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {

                if (menuItem.getItemId() == R.id.action_send || menuItem.getItemId() == R.id.action_ringtone) {

                    final String fileName = soundObject.getItemName().replaceAll("\\s","_") + ".mp3";
                    File storageDir = new File(Environment.getExternalStorageDirectory().toString(),"/soundbox_france/");
                    storageDir.mkdirs();
                    final File file = new File(storageDir, fileName);

                    InputStream in = view.getContext().getResources().openRawResource(soundObject.getItemID());

                    try {
                        OutputStream out = new FileOutputStream(file);
                        byte[] buffer = new byte[1024];

                        int len;
                        while ((len = in.read(buffer, 0, buffer.length)) != -1) {
                            out.write(buffer, 0, len);
                        }

                        in.close();
                        out.close();
                    } catch (IOException e) {
                        Log.e(LOG_TAG, "Impossible de sauvegarder le fichier: " + e.getMessage());
                    }

                    if (menuItem.getItemId() == R.id.action_send) {
                            final String AUTHORITY = view.getContext().getPackageName() + ".fileprovider";
                            Uri contentUri = FileProvider.getUriForFile(view.getContext(), AUTHORITY, file);
                            final Intent shareIntent = new Intent(Intent.ACTION_SEND);
                            shareIntent.putExtra(Intent.EXTRA_STREAM, contentUri);
                            shareIntent.setType("audio/mp3");
                            view.getContext().startActivity(Intent.createChooser(shareIntent, "Partage le son via ..."));
                    }

                    if (menuItem.getItemId() == R.id.action_ringtone) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext(), R.style.Theme_MaterialComponents_Light_Dialog_Alert);
                        builder.setTitle("Sauvegarder comme...");
                        builder.setItems(new CharSequence[]{"Sonnerie", "Notification", "Alarme"}, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                switch (which) {
                                    case 0:
                                        changeSystemAudio(view, fileName, file, 1);
                                        break;
                                    case 1:
                                        changeSystemAudio(view, fileName, file, 2);
                                        break;
                                    case 2:
                                        changeSystemAudio(view, fileName, file, 3);
                                        break;
                                }
                            }
                        });
                        builder.create();
                        builder.show();
                    }
                }

                if (menuItem.getItemId() == R.id.action_favorite) {
                    databaseHandler.removeFavorite(view.getContext(), soundObject);
                }
                return true;
            }
        });
        popup.show();
    }

    public static void customManager(final View view, final SoundObject soundObject) {

        databaseHandler = new DatabaseHandler(view.getContext());
        PopupMenu popup = new PopupMenu(view.getContext(), view);
        popup.getMenuInflater().inflate(R.menu.delete_custom, popup.getMenu());
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.action_delete) {
                    databaseHandler.removeCustom(view.getContext(),soundObject);
                }
                return true;
            }
        });
        popup.show();
    }


    @SuppressLint("ShowToast")
    private static void changeSystemAudio(View view, String fileName, File file, int action) {
        try {
            ContentValues values = new ContentValues();
            values.put(MediaStore.MediaColumns.DATA, file.getAbsolutePath());
            values.put(MediaStore.MediaColumns.TITLE, fileName);
            values.put(MediaStore.MediaColumns.MIME_TYPE, "audio/*");

            switch (action) {
                case 1:
                    values.put(MediaStore.Audio.Media.IS_RINGTONE, true);
                    values.put(MediaStore.Audio.Media.IS_NOTIFICATION, false);
                    values.put(MediaStore.Audio.Media.IS_ALARM, false);
                    break;
                case 2:
                    values.put(MediaStore.Audio.Media.IS_RINGTONE, false);
                    values.put(MediaStore.Audio.Media.IS_NOTIFICATION, true);
                    values.put(MediaStore.Audio.Media.IS_ALARM, false);
                    break;
                case 3:
                    values.put(MediaStore.Audio.Media.IS_RINGTONE, false);
                    values.put(MediaStore.Audio.Media.IS_NOTIFICATION, false);
                    values.put(MediaStore.Audio.Media.IS_ALARM, true);
                    break;
            }

            values.put(MediaStore.Audio.Media.IS_MUSIC, false);
            Uri uri = MediaStore.Audio.Media.getContentUriForPath(file.getAbsolutePath());
            assert uri != null;
            view.getContext().getContentResolver().delete(uri, MediaStore.MediaColumns.DATA + "=\"" + file.getAbsolutePath() + "\"", null);
            Uri finalUri = view.getContext().getContentResolver().insert(uri, values);

            switch (action) {
                case 1:
                    RingtoneManager.setActualDefaultRingtoneUri(view.getContext(), RingtoneManager.TYPE_RINGTONE, finalUri);
                    break;
                case 2:
                    RingtoneManager.setActualDefaultRingtoneUri(view.getContext(), RingtoneManager.TYPE_NOTIFICATION, finalUri);
                    break;
                case 3:
                    RingtoneManager.setActualDefaultRingtoneUri(view.getContext(), RingtoneManager.TYPE_ALARM, finalUri);
                    break;
            }


        } catch (Exception e) {
            Log.e(LOG_TAG, "Impossible de sauvegarder ce son comme:" + e.getMessage());
        }
    }
}