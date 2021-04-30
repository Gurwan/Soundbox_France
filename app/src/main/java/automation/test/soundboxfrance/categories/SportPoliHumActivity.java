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

public class SportPoliHumActivity extends SuperActivity {

    public SportPoliHumActivity(){}

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_univers);
        final int pleinEcran = WindowManager.LayoutParams.FLAG_FULLSCREEN;
        getWindow().setFlags(pleinEcran, pleinEcran);
        first(getSupportFragmentManager(),getLifecycle());
        final SportFragment sportFragment = new SportFragment(this);
        final PolitiqueFragment politiqueFragment = new PolitiqueFragment(this);
        final HumourFragment humourFragment = new HumourFragment(this);
        adapter.addFragment(sportFragment);
        adapter.addFragment(politiqueFragment);
        adapter.addFragment(humourFragment);
        nameTab = new ArrayList<>();
        nameTab.add("Sport");
        nameTab.add("Politique");
        nameTab.add("Humour");
        second();
        Button buttonSort = findViewById(R.id.button_sort);
        buttonSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sportFragment.isResumed()){
                    openSort(sportFragment.SoundAdapter,sportFragment.soundList,sportFragment.getAz());
                } else if(politiqueFragment.isResumed()){
                    openSort(politiqueFragment.SoundAdapter,politiqueFragment.soundList,politiqueFragment.getAz());
                } else {
                    openSort(humourFragment.SoundAdapter,humourFragment.soundList,humourFragment.getAz());
                }
            }
        });
    }
}
