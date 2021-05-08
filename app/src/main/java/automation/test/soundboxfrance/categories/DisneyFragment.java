/*
 * *******************************************************
 * Copyright (c) 2020. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance.categories;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

public class DisneyFragment extends SuperFragment {

    public DisneyFragment(ThemeActivity mainActivity) {
        super(mainActivity);
    }

    public DisneyFragment(){}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.all(inflater,container,"DISNEY");
        return view;
    }
}

