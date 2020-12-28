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



public class MusicFragment extends SuperActivity {

    public MusicFragment(){}

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_univers);
        int pleinEcran = WindowManager.LayoutParams.FLAG_FULLSCREEN;
        getWindow().setFlags(pleinEcran, pleinEcran);
        first(getSupportFragmentManager(),getLifecycle());
        adapter.addFragment(new Music3070Fragment(this));
        adapter.addFragment(new Music80Fragment(this));
        adapter.addFragment(new Music90Fragment(this));
        adapter.addFragment(new Music2000Fragment(this));
        nameTab = new ArrayList<>();
        nameTab.add("30-70");
        nameTab.add("80");
        nameTab.add("90");
        nameTab.add("2000");
        second();
    }
}