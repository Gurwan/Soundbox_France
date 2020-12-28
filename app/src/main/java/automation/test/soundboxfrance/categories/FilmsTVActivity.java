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

public class FilmsTVActivity extends SuperActivity {

    public FilmsTVActivity(){}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_univers);
        int pleinEcran = WindowManager.LayoutParams.FLAG_FULLSCREEN;
        getWindow().setFlags(pleinEcran, pleinEcran);
        first(getSupportFragmentManager(),getLifecycle());
        this.adapter.addFragment(new FilmsFragment(this));
        this.adapter.addFragment(new MusicFilmsFragment(this));
        nameTab = new ArrayList<>();
        nameTab.add("Films");
        nameTab.add("Films Musique");
        second();
    }
}
