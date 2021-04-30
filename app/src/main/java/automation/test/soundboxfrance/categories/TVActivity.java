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

public class TVActivity extends SuperActivity {

    public TVActivity(){}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_univers);
        int pleinEcran = WindowManager.LayoutParams.FLAG_FULLSCREEN;
        getWindow().setFlags(pleinEcran, pleinEcran);
        first(getSupportFragmentManager(),getLifecycle());
        final SeriesTVFragment seriesTVFragment = new SeriesTVFragment(this);
        final TVFragment tvFragment = new TVFragment(this);
        final PublicitesFragment publicitesFragment = new PublicitesFragment(this);
        final AnimesFragment animesFragment = new AnimesFragment(this);
        adapter.addFragment(seriesTVFragment);
        adapter.addFragment(tvFragment);
        adapter.addFragment(publicitesFragment);
        adapter.addFragment(animesFragment);
        nameTab = new ArrayList<>();
        nameTab.add("Séries TV");
        nameTab.add("TV");
        nameTab.add("Publicites");
        nameTab.add("Animes");
        second();
        Button buttonSort = findViewById(R.id.button_sort);
        buttonSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(seriesTVFragment.isResumed()){
                    openSort(seriesTVFragment.SoundAdapter,seriesTVFragment.soundList,seriesTVFragment.getAz());
                } else if(tvFragment.isResumed()){
                    openSort(tvFragment.SoundAdapter,tvFragment.soundList, tvFragment.getAz());
                } else if(publicitesFragment.isResumed()){
                    openSort(publicitesFragment.SoundAdapter,publicitesFragment.soundList,publicitesFragment.getAz());
                } else {
                    openSort(animesFragment.SoundAdapter,animesFragment.soundList,animesFragment.getAz());
                }
            }
        });
    }
}
