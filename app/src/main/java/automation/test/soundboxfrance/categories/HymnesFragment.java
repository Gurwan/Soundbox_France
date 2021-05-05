/*
 * *******************************************************
 * Copyright (c) 2021. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance.categories;

import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;

import androidx.annotation.NonNull;

import automation.test.soundboxfrance.Category;
import automation.test.soundboxfrance.DatabaseHandler;
import automation.test.soundboxfrance.R;
import automation.test.soundboxfrance.SoundObject;

public class HymnesFragment extends SuperFragment {

    public HymnesFragment(ThemeActivity themeActivity) {
        super(themeActivity);
    }

    public HymnesFragment(){}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.all(inflater,container,"HYMNES");
        return view;
    }
}
