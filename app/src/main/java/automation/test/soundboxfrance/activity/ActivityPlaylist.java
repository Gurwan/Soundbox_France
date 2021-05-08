/*
 * *******************************************************
 * Copyright (c) 2021. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance.activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import automation.test.soundboxfrance.DatabaseHandler;
import automation.test.soundboxfrance.R;
import automation.test.soundboxfrance.adapters.PlaylistAdapter;
import automation.test.soundboxfrance.categories.MemeActivity;
import automation.test.soundboxfrance.categories.SportPoliHumActivity;
import automation.test.soundboxfrance.categories.YoutubeActivity;
import automation.test.soundboxfrance.model.Playlist;

public class ActivityPlaylist extends AppCompatActivity {

    private ArrayList<Playlist> playlistArrayList = new ArrayList<Playlist>();
    private PlaylistAdapter adapter;
    private FloatingActionButton floatingActionButton;
    private DatabaseHandler databaseHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);
        int pleinEcran = WindowManager.LayoutParams.FLAG_FULLSCREEN ; getWindow().setFlags(pleinEcran,pleinEcran);

        adapter = new PlaylistAdapter(this,playlistArrayList);
        ListView listView = findViewById(R.id.playlistList);
        listView.setAdapter(adapter);

        databaseHandler = new DatabaseHandler(this);
        Cursor cursor = databaseHandler.getPlaylistCollection();
        while(cursor.moveToNext()){
            int id = cursor.getInt(cursor.getColumnIndex("_id"));
            String name = cursor.getString(cursor.getColumnIndex("playlistName"));
            this.playlistArrayList.add(new Playlist(name,id));
        }
        adapter.notifyDataSetChanged();
        cursor.close();

        floatingActionButton = findViewById(R.id.floatingActionButton);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createPlaylist();
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Playlist playlist = (Playlist) adapter.getItem(position);
                openPlaylist(playlist);
            }
        });

        //add a listener to the listView (long click)
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Playlist playlist = (Playlist) adapter.getItem(position);
                removePlaylist(playlist);
                return true;
            }
        });

        Button buttonHome = findViewById(R.id.button_home);
        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(1);
            }
        });

        Button buttonFav = findViewById(R.id.button_fav);
        buttonFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(2);
            }
        });

        Button buttonRecherche = findViewById(R.id.button_search);
        buttonRecherche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(3);
            }
        });

        Button yourSoundboxButton = findViewById(R.id.button_yoursoundbox);
        yourSoundboxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(4);
            }
        });

        Button settingsButton = findViewById(R.id.button_setting);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(5);
            }
        });

    }

    private void openA(int i) {
        Intent intent = null;
        switch(i) {
            case 1:
                intent = new Intent(this, MainActivity.class);
                break;
            case 2:
                intent = new Intent(this, FavoriteActivity.class);
                break;
            case 3:
                intent = new Intent(this, ActivityToutRecherche.class);
                break;
            case 4:
                intent = new Intent(this, YourSoundboxActivity.class);
                break;
            case 5:
                intent = new Intent(this,SettingsActivity.class);
                break;
        }
        startActivity(intent);
        if(i<5){
            overridePendingTransition(R.anim.slide_left, R.anim.slide_right_2);
        } else {
            overridePendingTransition(R.anim.slide_right, R.anim.slide_left_2);

        }
    }

    private void openPlaylist(Playlist playlist) {
        Intent intent = new Intent(this, IntoPlaylistActivity.class);
        intent.putExtra("playlistID", playlist.getId());
        startActivityForResult(intent, 1);
    }

    private void createPlaylist() {
        Intent i = new Intent(this, PlaylistCreateActivity.class);
        startActivityForResult(i,2);
    }

    private void removePlaylist(Playlist playlist) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setMessage("Voulez vous supprimer cette playlist ?")
                .setPositiveButton("Oui", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        removePlaylistDatabase(playlist);
                    }
                })
                .setNegativeButton("Non", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        AlertDialog d = alertDialog.create();
        d.show();
    }

    private void removePlaylistDatabase(Playlist playlist){
        databaseHandler.removePlaylist(this,playlist);
    }


}