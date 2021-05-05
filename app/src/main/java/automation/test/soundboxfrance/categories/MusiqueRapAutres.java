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

public class MusiqueRapAutres extends SuperActivity {

    public MusiqueRapAutres(){}

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_univers);
        int pleinEcran = WindowManager.LayoutParams.FLAG_FULLSCREEN;
        getWindow().setFlags(pleinEcran, pleinEcran);
        first(getSupportFragmentManager(),getLifecycle());
        final RapFragment rapFragment = new RapFragment(this);
        final MusicAutreFragment musicAutreFragment = new MusicAutreFragment(this);
        adapter.addFragment(rapFragment);
        adapter.addFragment(musicAutreFragment);
        nameTab = new ArrayList<>();
        nameTab.add("2010");
        nameTab.add("Rap");
        nameTab.add("Amateurs");
        nameTab.add("Autres");
        second();
        Button buttonSort = findViewById(R.id.button_sort);
        buttonSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rapFragment.isResumed()){
                    openSort(rapFragment.SoundAdapter,rapFragment.soundList,rapFragment.getAz());
                } else {
                    openSort(musicAutreFragment.SoundAdapter,musicAutreFragment.soundList,musicAutreFragment.getAz());
                }
            }
        });
    }

}