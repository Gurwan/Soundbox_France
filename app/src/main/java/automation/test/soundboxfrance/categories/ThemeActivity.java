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

public class ThemeActivity extends SuperActivity {

    public ThemeActivity(){}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_univers);
        int pleinEcran = WindowManager.LayoutParams.FLAG_FULLSCREEN;
        getWindow().setFlags(pleinEcran, pleinEcran);
        first(getSupportFragmentManager(),getLifecycle());
        final HymnesFragment hymnesFragment = new HymnesFragment(this);
        final BruitageFragment bruitageFragment = new BruitageFragment(this);
        final DisneyFragment disneyFragment = new DisneyFragment(this);
        final NoelFragment noelFragment = new NoelFragment(this);
        adapter.addFragment(hymnesFragment);
        adapter.addFragment(bruitageFragment);
        adapter.addFragment(disneyFragment);
        adapter.addFragment(noelFragment);
        nameTab = new ArrayList<>();
        nameTab.add("Hymnes");
        nameTab.add("Bruitage");
        nameTab.add("Disney");
        nameTab.add("Noel");
        second();
        Button buttonSort = findViewById(R.id.button_sort);
        buttonSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hymnesFragment.isResumed()){
                    openSort(hymnesFragment.SoundAdapter,hymnesFragment.soundList,hymnesFragment.getAz());
                } else if(bruitageFragment.isResumed()){
                    openSort(bruitageFragment.SoundAdapter,bruitageFragment.soundList,bruitageFragment.getAz());
                } else if(disneyFragment.isResumed()){
                    openSort(disneyFragment.SoundAdapter,disneyFragment.soundList,disneyFragment.getAz());
                } else {
                    openSort(noelFragment.SoundAdapter,noelFragment.soundList,noelFragment.getAz());
                }
            }
        });
    }

}