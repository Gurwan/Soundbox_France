/*
 * *******************************************************
 * Copyright (c) 2021. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import automation.test.soundboxfrance.DatabaseHandler;
import automation.test.soundboxfrance.EventHandlerClass;
import automation.test.soundboxfrance.R;
import automation.test.soundboxfrance.SoundboxRecyclerAdapter;
import automation.test.soundboxfrance.model.Playlist;
import automation.test.soundboxfrance.model.SoundObject;

public class IntoPlaylistActivity extends AppCompatActivity {

    DatabaseHandler databaseHandler;
    ArrayList<SoundObject> soundListPlaylist = new ArrayList<>();
    RecyclerView soundView;
    SoundboxRecyclerAdapter soundAdapter = new SoundboxRecyclerAdapter(soundListPlaylist);
    RecyclerView.LayoutManager soundLayoutManager;
    private List<String> nameList = new ArrayList<>();
    int az = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_into_playlist);
        int pleinEcran = WindowManager.LayoutParams.FLAG_FULLSCREEN;
        getWindow().setFlags(pleinEcran, pleinEcran);

        databaseHandler = new DatabaseHandler(this);

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

        Button buttonHome = findViewById(R.id.button_home);
        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(1);
            }
        });

        Button buttonYourSoundbox = findViewById(R.id.button_yoursoundbox);
        buttonYourSoundbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(4);
            }
        });

        Button buttonSettings = findViewById(R.id.button_setting);
        buttonSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(5);
            }
        });

        Button playlistButton = findViewById(R.id.button_playlist);
        playlistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(6);
            }
        });

        Button buttonSort = findViewById(R.id.button_sort);
        buttonSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSort(soundAdapter, soundListPlaylist, getAz());
            }
        });

        Bundle bundle = getIntent().getExtras();
        if(bundle.containsKey("playlistID")){
            int playlistId = bundle.getInt("playlistID");
            Cursor cursor = databaseHandler.getPlaylistCollectionSounds(playlistId);
            while(cursor.moveToNext()){
                String nameImageSound = cursor.getString(cursor.getColumnIndex("playlist_sound_sound_id"));
                Cursor cursor1 = databaseHandler.getSpecificSound(nameImageSound);
                while (cursor1.moveToNext()){
                    String name = cursor1.getString(cursor1.getColumnIndex("mainName"));
                    Integer sound = cursor1.getInt(cursor1.getColumnIndex("mainSound"));
                    String img = cursor1.getString(cursor1.getColumnIndex("mainImage"));
                    int imageR = getResources().getIdentifier(img,"drawable", getPackageName());
                    SoundObject soundObject = new SoundObject(name,sound,imageR);
                    soundObject.setNameImage(img);
                    nameList.add(name);
                    this.soundListPlaylist.add(soundObject);
                }
            }
            this.soundAdapter.notifyDataSetChanged();
            cursor.close();
            soundView = findViewById(R.id.soundboxRecyclerView);
            soundLayoutManager = new GridLayoutManager(this, 3);
            soundView.setLayoutManager(soundLayoutManager);
            soundView.setAdapter(soundAdapter);
        }
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        EventHandlerClass.releaseMediaPlayer();
    }

    public void openSort(SoundboxRecyclerAdapter adapter, ArrayList<SoundObject> soundList,int az) {
        if(az!=0){
            Collections.sort(soundList, new Comparator<SoundObject>() {
                @Override
                public int compare(SoundObject soundObject, SoundObject t1) {
                    return soundObject.getItemName().compareTo(t1.getItemName());
                }
            });
        } else {
            Collections.sort(soundList, Collections.reverseOrder(new Comparator<SoundObject>() {
                @Override
                public int compare(SoundObject soundObject, SoundObject t1) {
                    return soundObject.getItemName().compareTo(t1.getItemName());
                }
            }));
        }
        adapter.notifyDataSetChanged();
    }


    public void openA(int a){
        Intent intent = null;
        switch(a){
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
            case 6:
                intent = new Intent(this, ActivityPlaylist.class);
                break;
        }

        if(intent != null){
            startActivity(intent);
        }
    }


    public int getAz() {
        int ret = -1;
        if(az!=0){
            ret = az;
            az = 0;
        } else {
            ret = az;
            az = 1;
        }
        return ret;
    }
}