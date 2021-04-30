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

public class GeneriquesActivity extends SuperActivity {

    public GeneriquesActivity(){}


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_univers);
        int pleinEcran = WindowManager.LayoutParams.FLAG_FULLSCREEN;
        getWindow().setFlags(pleinEcran, pleinEcran);
        first(getSupportFragmentManager(),getLifecycle());
        final DessinAnimeFragment dessinAnimeFragment = new DessinAnimeFragment(this);
        final SeriesTVGeneriqueFragment seriesTVGeneriqueFragment = new SeriesTVGeneriqueFragment(this);
        final AnimesGeneriqueFragment animesGeneriqueFragment = new AnimesGeneriqueFragment(this);
        final GenericAutresFragment genericAutresFragment = new GenericAutresFragment(this);
        adapter.addFragment(dessinAnimeFragment);
        adapter.addFragment(seriesTVGeneriqueFragment);
        adapter.addFragment(animesGeneriqueFragment);
        adapter.addFragment(genericAutresFragment);
        nameTab = new ArrayList<>();
        nameTab.add("Dessins animés");
        nameTab.add("Séries TV");
        nameTab.add("Animes");
        nameTab.add("Autres");
        second();
        Button buttonSort = findViewById(R.id.button_sort);
        buttonSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dessinAnimeFragment.isResumed()){
                    openSort(dessinAnimeFragment.SoundAdapter,dessinAnimeFragment.soundList,dessinAnimeFragment.getAz());
                } else if(seriesTVGeneriqueFragment.isResumed()) {
                    openSort(seriesTVGeneriqueFragment.SoundAdapter,seriesTVGeneriqueFragment.soundList,seriesTVGeneriqueFragment.getAz());
                } else if(animesGeneriqueFragment.isResumed()){
                    openSort(animesGeneriqueFragment.SoundAdapter,animesGeneriqueFragment.soundList,animesGeneriqueFragment.getAz());
                } else {
                    openSort(genericAutresFragment.SoundAdapter,genericAutresFragment.soundList,genericAutresFragment.getAz());
                }
            }
        });
    }
}