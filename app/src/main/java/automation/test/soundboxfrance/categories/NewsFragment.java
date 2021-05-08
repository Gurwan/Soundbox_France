/*
 * *******************************************************
 * Copyright (c) 2021. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance.categories;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import automation.test.soundboxfrance.activity.ActivityToutRecherche;
import automation.test.soundboxfrance.DatabaseHandler;
import automation.test.soundboxfrance.EventHandlerClass;
import automation.test.soundboxfrance.activity.FavoriteActivity;
import automation.test.soundboxfrance.activity.MainActivity;
import automation.test.soundboxfrance.R;
import automation.test.soundboxfrance.model.SoundObject;
import automation.test.soundboxfrance.SoundboxRecyclerAdapter;
import automation.test.soundboxfrance.activity.YourSoundboxActivity;

public class NewsFragment extends AppCompatActivity {

    ArrayList<SoundObject> soundListNouveautes = new ArrayList<>();

    RecyclerView SoundView;
    SoundboxRecyclerAdapter SoundAdapter = new SoundboxRecyclerAdapter(soundListNouveautes);
    RecyclerView.LayoutManager SoundLayoutManager;
    private List<String> nameList = new ArrayList<>();
    int az = -1;

    public NewsFragment(){}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        int pleinEcran = WindowManager.LayoutParams.FLAG_FULLSCREEN ; getWindow().setFlags(pleinEcran,pleinEcran);

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

        Button buttonHelp = findViewById(R.id.button_help);
        buttonHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(6);
            }
        });

        Button buttonSort = findViewById(R.id.button_sort);
        buttonSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSort(SoundAdapter,soundListNouveautes);
            }
        });

        DatabaseHandler databaseHandler = new DatabaseHandler(this);
        Cursor cursor = databaseHandler.getNewsCollection();
        while(cursor.moveToNext()){
            String name = cursor.getString(cursor.getColumnIndex("mainName"));
            Integer sound = cursor.getInt(cursor.getColumnIndex("mainSound"));
            String img = cursor.getString(cursor.getColumnIndex("mainImage"));
            int imageR = getResources().getIdentifier(img,"drawable", getPackageName());
            SoundObject soundObject = new SoundObject(name,sound,imageR);
            soundObject.setNameImage(img);
            this.soundListNouveautes.add(soundObject);
        }
        this.SoundAdapter.notifyDataSetChanged();
        cursor.close();
        SoundView = findViewById(R.id.soundboxRecyclerView);
        SoundLayoutManager = new GridLayoutManager(this, 3);
        SoundView.setLayoutManager(SoundLayoutManager);
        SoundView.setAdapter(SoundAdapter);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        EventHandlerClass.releaseMediaPlayer();
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
                int c = 1+1;
                break;
            case 6:
                Toast.makeText(this, "Tous les sons ajoutés lors d'une mise à jour se trouvent ici ! Aucune chance de rater les nouveautés.", Toast.LENGTH_LONG).show();
                break;
        }

        if(intent != null){
            startActivity(intent);
        }
    }

    public void openSort(SoundboxRecyclerAdapter adapter, ArrayList<SoundObject> soundList) {
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