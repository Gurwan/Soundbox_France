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

public class ThemeActivity extends SuperActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_univers);
        int pleinEcran = WindowManager.LayoutParams.FLAG_FULLSCREEN;
        getWindow().setFlags(pleinEcran, pleinEcran);
        first(getSupportFragmentManager(),getLifecycle());
        adapter.addFragment(new HymnesFragment(this));
        adapter.addFragment(new BruitageFragment(this));
        adapter.addFragment(new DisneyFragment(this));
        adapter.addFragment(new NoelFragment(this));
        nameTab = new ArrayList<>();
        nameTab.add("Hymnes");
        nameTab.add("Bruitage");
        nameTab.add("Disney");
        nameTab.add("Noel");
        second();
    }

}