/*
 * *******************************************************
 * Copyright (c) 2021. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance.categories;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import java.util.ArrayList;

import automation.test.soundboxfrance.R;

public class FilmsTVActivity extends SuperActivity {

    public FilmsTVActivity(){}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_univers);
        int pleinEcran = WindowManager.LayoutParams.FLAG_FULLSCREEN;
        getWindow().setFlags(pleinEcran, pleinEcran);
        first(getSupportFragmentManager(),getLifecycle());
        final FilmsFragment filmsFragment = new FilmsFragment(this);
        final MusicFilmsFragment musicFilmsFragment = new MusicFilmsFragment(this);
        this.adapter.addFragment(filmsFragment);
        this.adapter.addFragment(musicFilmsFragment);
        nameTab = new ArrayList<>();
        nameTab.add("Films");
        nameTab.add("Films Musique");
        second();
        Button buttonSort = findViewById(R.id.button_sort);
        buttonSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(filmsFragment.isResumed()){
                    openSort(filmsFragment.SoundAdapter,filmsFragment.soundList,filmsFragment.getAz());
                } else {
                    openSort(musicFilmsFragment.SoundAdapter, musicFilmsFragment.soundList, musicFilmsFragment.getAz());
                }
            }
        });
    }
}
