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



public class MusicFragment extends SuperActivity {

    public MusicFragment(){}

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_univers);
        int pleinEcran = WindowManager.LayoutParams.FLAG_FULLSCREEN;
        getWindow().setFlags(pleinEcran, pleinEcran);
        first(getSupportFragmentManager(),getLifecycle());
        final Music3070Fragment music3070Fragment = new Music3070Fragment(this);
        final Music80Fragment music80Fragment = new Music80Fragment(this);
        final Music90Fragment music90Fragment = new Music90Fragment(this);
        final Music2000Fragment music2000Fragment = new Music2000Fragment(this);
        adapter.addFragment(music3070Fragment);
        adapter.addFragment(music80Fragment);
        adapter.addFragment(music90Fragment);
        adapter.addFragment(music2000Fragment);
        nameTab = new ArrayList<>();
        nameTab.add("30-70");
        nameTab.add("80");
        nameTab.add("90");
        nameTab.add("2000");
        second();
        Button buttonSort = findViewById(R.id.button_sort);
        buttonSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(music3070Fragment.isResumed()){
                    openSort(music3070Fragment.SoundAdapter,music3070Fragment.soundList,music3070Fragment.getAz());
                } else if(music80Fragment.isResumed()){
                    openSort(music80Fragment.SoundAdapter,music80Fragment.soundList,music80Fragment.getAz());
                } else if(music90Fragment.isResumed()){
                    openSort(music90Fragment.SoundAdapter,music90Fragment.soundList,music90Fragment.getAz());
                } else {
                    openSort(music2000Fragment.SoundAdapter,music2000Fragment.soundList,music2000Fragment.getAz());
                }
            }
        });
    }
}