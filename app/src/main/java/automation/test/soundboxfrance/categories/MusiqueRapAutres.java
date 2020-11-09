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

public class MusiqueRapAutres extends SuperActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_univers);
        int pleinEcran = WindowManager.LayoutParams.FLAG_FULLSCREEN;
        getWindow().setFlags(pleinEcran, pleinEcran);
        first(getSupportFragmentManager(),getLifecycle());
        adapter.addFragment(new Music2010Fragment(this));
        adapter.addFragment(new RapFragment(this));
        adapter.addFragment(new AmateursFragment(this));
        adapter.addFragment(new MusicAutreFragment(this));
        nameTab = new ArrayList<>();
        nameTab.add("2010");
        nameTab.add("Rap");
        nameTab.add("Amateurs");
        nameTab.add("Autres");
        second();
    }

}