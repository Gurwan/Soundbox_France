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

public class MemeActivity extends SuperActivity {

    public MemeActivity(){}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_univers);
        int pleinEcran = WindowManager.LayoutParams.FLAG_FULLSCREEN;
        getWindow().setFlags(pleinEcran, pleinEcran);
        first(getSupportFragmentManager(),getLifecycle());
        final InternetFRFragment internetFRFragment = new InternetFRFragment(this);
        final InternetEtrangersFragment internetEtrangersFragment = new InternetEtrangersFragment(this);
        adapter.addFragment(internetFRFragment);
        adapter.addFragment(internetEtrangersFragment);
        nameTab = new ArrayList<>();
        nameTab.add("Internet Français");
        nameTab.add("Internet Etrangers");
        second();
        Button buttonSort = findViewById(R.id.button_sort);
        buttonSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(internetEtrangersFragment.isResumed()){
                    openSort(internetEtrangersFragment.SoundAdapter,internetEtrangersFragment.soundList,internetEtrangersFragment.getAz());
                } else if(internetFRFragment.isResumed()){
                    openSort(internetFRFragment.SoundAdapter,internetFRFragment.soundList,internetFRFragment.getAz());
                }
            }
        });
    }

}
