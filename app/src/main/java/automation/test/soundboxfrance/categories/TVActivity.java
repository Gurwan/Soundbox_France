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

public class TVActivity extends SuperActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_univers);
        int pleinEcran = WindowManager.LayoutParams.FLAG_FULLSCREEN;
        getWindow().setFlags(pleinEcran, pleinEcran);
        first(getSupportFragmentManager(),getLifecycle());
        adapter.addFragment(new SeriesTVFragment(this));
        adapter.addFragment(new TVFragment(this));
        adapter.addFragment(new PublicitesFragment(this));
        adapter.addFragment(new AnimesFragment(this));
        nameTab = new ArrayList<>();
        nameTab.add("Séries TV");
        nameTab.add("TV");
        nameTab.add("Publicites");
        nameTab.add("Animes");
        second();
    }
}
