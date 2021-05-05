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
        final Music20Fragment music20Fragment = new Music20Fragment(this);
        final Music21Fragment music21Fragment = new Music21Fragment(this);
        adapter.addFragment(music20Fragment);
        adapter.addFragment(music21Fragment);
        nameTab = new ArrayList<>();
        nameTab.add("20ème siècle");
        nameTab.add("21ème siècle");
        second();
        Button buttonSort = findViewById(R.id.button_sort);
        buttonSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(music20Fragment.isResumed()){
                    openSort(music20Fragment.SoundAdapter,music20Fragment.soundList,music20Fragment.getAz());
                } else {
                    openSort(music21Fragment.SoundAdapter,music21Fragment.soundList,music21Fragment.getAz());
                }
            }
        });
    }
}