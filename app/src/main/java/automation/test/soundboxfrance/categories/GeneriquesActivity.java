/*
 * *******************************************************
 * Copyright (c) 2020. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance.categories;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;

import automation.test.soundboxfrance.R;

public class GeneriquesActivity extends SuperActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_univers);
        int pleinEcran = WindowManager.LayoutParams.FLAG_FULLSCREEN;
        getWindow().setFlags(pleinEcran, pleinEcran);
        first(getSupportFragmentManager(),getLifecycle());
        adapter.addFragment(new DessinAnimeFragment(this));
        adapter.addFragment(new SeriesTVGeneriqueFragment(this));
        adapter.addFragment(new AnimesGeneriqueFragment(this));
        adapter.addFragment(new GenericAutresFragment(this));
        nameTab = new ArrayList<>();
        nameTab.add("Dessins animés");
        nameTab.add("Séries TV");
        nameTab.add("Animes");
        nameTab.add("Autres");
        second();
    }
}