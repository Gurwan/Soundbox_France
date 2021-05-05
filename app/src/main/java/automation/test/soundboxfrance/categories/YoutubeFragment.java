/*
 * *******************************************************
 * Copyright (c) 2021. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance.categories;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;

import androidx.annotation.NonNull;
import automation.test.soundboxfrance.R;

public class YoutubeFragment extends SuperFragment {

    public YoutubeFragment(YoutubeActivity mainActivity) {
        super(mainActivity);
    }

    public YoutubeFragment(){}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.all(inflater,container,"YOUTUBE");
        return view;
    }
}
