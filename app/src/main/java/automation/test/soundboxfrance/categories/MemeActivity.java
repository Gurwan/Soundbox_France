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

public class MemeActivity extends SuperActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_univers);
        int pleinEcran = WindowManager.LayoutParams.FLAG_FULLSCREEN;
        getWindow().setFlags(pleinEcran, pleinEcran);
        first(getSupportFragmentManager(),getLifecycle());
        adapter.addFragment(new InternetFRFragment(this));
        adapter.addFragment(new YoutubeFragment(this));
        adapter.addFragment(new InternetEtrangersFragment(this));
        nameTab = new ArrayList<>();
        nameTab.add("Internet Français");
        nameTab.add("Youtube");
        nameTab.add("Internet Etrangers");
        second();
    }

}
