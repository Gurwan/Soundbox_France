/*
 * *******************************************************
 * Copyright (c) 2020. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance;

import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentActivity;


public class EventHandlerClass {


    private static final String LOG_TAG = "EVENTHANDLER";

    private static MediaPlayer mp;

    private static DatabaseHandler databaseHandler;

    public static void startMediaPlayer(View view, Integer soundID) {

        try {

            if (soundID != null) {
                if (mp != null)
                    mp.reset();
                mp = MediaPlayer.create(view.getContext(), soundID);
                mp.start();
            }

        } catch (Exception e) {

            Log.e(LOG_TAG, "Failed to initialize MediaPlayer: " + e.getMessage());
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

        if (view.getContext() instanceof FavoriteActivity)
            popup.getMenuInflater().inflate(R.menu.favo_longclick, popup.getMenu());
        else
            popup.getMenuInflater().inflate(R.menu.longclick, popup.getMenu());

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
                    if (view.getContext() instanceof FavoriteActivity)
                        databaseHandler.removeFavorite(view.getContext(), soundObject);
                    else
                        databaseHandler.addFavorite(soundObject);
                }
                return true;
            }
        });
        popup.show();
    }

    public static void popupManager(final View view, final SoundObject soundObject,final FragmentActivity activity) {

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

                        Log.e(LOG_TAG, "Impossibe de sauvegarder le fichier: " + e.getMessage());

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

                // Ringtone
                case 1:
                    RingtoneManager.setActualDefaultRingtoneUri(view.getContext(), RingtoneManager.TYPE_RINGTONE, finalUri);
                    break;
                // Notification
                case 2:
                    RingtoneManager.setActualDefaultRingtoneUri(view.getContext(), RingtoneManager.TYPE_NOTIFICATION, finalUri);
                    break;
                // Alarm
                case 3:
                    RingtoneManager.setActualDefaultRingtoneUri(view.getContext(), RingtoneManager.TYPE_ALARM, finalUri);
                    break;

            }

        } catch (Exception e) {

            Log.e(LOG_TAG, "Impossible de sauvegarder ce son comme:" + e.getMessage());
        }
    }



}