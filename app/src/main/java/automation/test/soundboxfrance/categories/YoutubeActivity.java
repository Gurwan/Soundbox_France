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

public class YoutubeActivity extends SuperActivity {

    public YoutubeActivity(){}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_univers);
        int pleinEcran = WindowManager.LayoutParams.FLAG_FULLSCREEN;
        getWindow().setFlags(pleinEcran, pleinEcran);
        first(getSupportFragmentManager(),getLifecycle());
        final YoutubeFragment youtubeFragment = new YoutubeFragment(this);
        final TwitchFragment twitchFragment = new TwitchFragment(this);
        adapter.addFragment(youtubeFragment);
        adapter.addFragment(twitchFragment);
        nameTab = new ArrayList<>();
        nameTab.add("Youtube");
        nameTab.add("Twitch");
        second();
        Button buttonSort = findViewById(R.id.button_sort);
        buttonSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(youtubeFragment.isResumed()) {
                    openSort(youtubeFragment.SoundAdapter, youtubeFragment.soundList, youtubeFragment.getAz());
                } else {
                    openSort(twitchFragment.SoundAdapter, twitchFragment.soundList, twitchFragment.getAz());
                }
            }
        });
    }

}
