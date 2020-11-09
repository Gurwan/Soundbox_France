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

public class SportPoliHumActivity extends SuperActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_univers);
        int pleinEcran = WindowManager.LayoutParams.FLAG_FULLSCREEN;
        getWindow().setFlags(pleinEcran, pleinEcran);
        first(getSupportFragmentManager(),getLifecycle());
        adapter.addFragment(new SportFragment(this));
        adapter.addFragment(new PolitiqueFragment(this));
        adapter.addFragment(new HumourFragment(this));
        nameTab = new ArrayList<>();
        nameTab.add("Sport");
        nameTab.add("Politique");
        nameTab.add("Humour");
        second();
    }
}
