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

public class JVActivity extends SuperActivity {

    public JVActivity(){}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_univers);
        int pleinEcran = WindowManager.LayoutParams.FLAG_FULLSCREEN;
        getWindow().setFlags(pleinEcran, pleinEcran);
        first(getSupportFragmentManager(),getLifecycle());
        final JeuxVideosFragment jeuxVideosFragment = new JeuxVideosFragment(this);
        final MusicGamingFragment musicGamingFragment = new MusicGamingFragment(this);
        adapter.addFragment(jeuxVideosFragment);
        adapter.addFragment(musicGamingFragment);
        nameTab = new ArrayList<>();
        nameTab.add("Jeux Vidéos");
        nameTab.add("Musique");
        second();
        Button buttonSort = findViewById(R.id.button_sort);
        buttonSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(jeuxVideosFragment.isResumed()){
                    openSort(jeuxVideosFragment.SoundAdapter,jeuxVideosFragment.soundList,jeuxVideosFragment.getAz());
                } else {
                    openSort(musicGamingFragment.SoundAdapter,musicGamingFragment.soundList,musicGamingFragment.getAz());
                }
            }
        });
    }
}
