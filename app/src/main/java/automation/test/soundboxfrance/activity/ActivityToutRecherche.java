/*
 * *******************************************************
 * Copyright (c) 2021. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance.activity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import automation.test.soundboxfrance.DatabaseHandler;
import automation.test.soundboxfrance.EventHandlerClass;
import automation.test.soundboxfrance.R;
import automation.test.soundboxfrance.SoundboxRecyclerAdapter;
import automation.test.soundboxfrance.model.SoundObject;

public class ActivityToutRecherche extends AppCompatActivity implements SearchView.OnQueryTextListener {

    ArrayList<SoundObject> soundListToutRecherche = new ArrayList<>();

    RecyclerView soundView;
    SoundboxRecyclerAdapter soundAdapter = new SoundboxRecyclerAdapter(soundListToutRecherche);
    RecyclerView.LayoutManager soundLayoutManager;
    private List<String> nameList = new ArrayList<>();
    int az = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tout_recherche);
        int pleinEcran = WindowManager.LayoutParams.FLAG_FULLSCREEN ; getWindow().setFlags(pleinEcran,pleinEcran);

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

        Button buttonYourSoundbox = findViewById(R.id.button_yoursoundbox);
        buttonYourSoundbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(3);
            }
        });

        Button buttonSettings = findViewById(R.id.button_setting);
       buttonSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(4);
            }
        });

        Button playlistButton = findViewById(R.id.button_playlist);
        playlistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(5);
            }
        });

        DatabaseHandler databaseHandler = new DatabaseHandler(this);
        Cursor cursor = databaseHandler.getSoundCollection();
        while(cursor.moveToNext()){
            String name = cursor.getString(cursor.getColumnIndex("mainName"));
            Integer sound = cursor.getInt(cursor.getColumnIndex("mainSound"));
            String img = cursor.getString(cursor.getColumnIndex("mainImage"));
            int imageR = getResources().getIdentifier(img,"drawable", getPackageName());
            SoundObject soundObject = new SoundObject(name,sound,imageR);
            soundObject.setNameImage(img);
            this.nameList.add(name);
            this.soundListToutRecherche.add(soundObject);
        }
        this.soundAdapter.notifyDataSetChanged();
        cursor.close();

        soundView = findViewById(R.id.soundboxRecyclerView);
        soundLayoutManager = new GridLayoutManager(this, 3);
        soundView.setLayoutManager(soundLayoutManager);
        soundView.setAdapter(soundAdapter);
    }

    private void openA(int i) {
        Intent intent = null;
        switch(i){
            case 1:
                intent = new Intent(this, MainActivity.class);
                break;
            case 2:
                intent = new Intent(this, FavoriteActivity.class);
                break;
            case 3:
                intent = new Intent(this, YourSoundboxActivity.class);
                break;
            case 4:
                intent = new Intent(this,SettingsActivity.class);
                break;
            case 5:
                intent = new Intent(this,ActivityPlaylist.class);
                break;
        }
        startActivity(intent);
        if(i<=2){
            overridePendingTransition(R.anim.slide_left, R.anim.slide_right_2);
        } else {
            overridePendingTransition(R.anim.slide_right, R.anim.slide_left_2);
        }

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        EventHandlerClass.releaseMediaPlayer();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem){
        if (menuItem.getItemId() == R.id.action_search) {
            SearchView searchView = (SearchView) menuItem.getActionView();
            searchView.setOnQueryTextListener(this);
            return true;
        } else if(menuItem.getItemId() == R.id.action_help){
            Toast.makeText(this, "Tous les sons sont ici ! Vous pouvez vous balader librement ou rechercher un son en appuyant sur la loupe en haut à droite.", Toast.LENGTH_LONG).show();
            return true;
        } else if(menuItem.getItemId() == R.id.action_sort){
            if(az!=0){
                Collections.sort(soundListToutRecherche, new Comparator<SoundObject>() {
                    @Override
                    public int compare(SoundObject soundObject, SoundObject t1) {
                        return soundObject.getItemName().compareTo(t1.getItemName());
                    }
                });
                az = 0;
            } else {
                Collections.sort(soundListToutRecherche, Collections.reverseOrder(new Comparator<SoundObject>() {
                    @Override
                    public int compare(SoundObject soundObject, SoundObject t1) {
                        return soundObject.getItemName().compareTo(t1.getItemName());
                    }
                }));
                az = 1;
            }
            soundAdapter.notifyDataSetChanged();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override
    public boolean onQueryTextSubmit(String s) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        int ind = 0;
        String userInput = s.toLowerCase();
        ArrayList<SoundObject> newList = new ArrayList<>();
        for(String name : nameList){
            if(name.toLowerCase().contains(userInput)){
                newList.add(soundListToutRecherche.get(ind));
            }
            ind++;
        }
        soundAdapter.updateList(newList);
        return true;
    }

}
