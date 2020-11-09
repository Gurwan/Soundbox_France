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

import java.util.Arrays;

import androidx.annotation.NonNull;
import automation.test.soundboxfrance.R;

public class NoelFragment extends SuperFragment {

    public NoelFragment(ThemeActivity mainActivity) {
        super(mainActivity);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.before(inflater, container);
        super.nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesNoel));
        super.soundID = new Integer[]{R.raw.alliwantforchristmas, R.raw.doucenuit, R.raw.jinglebellrock, R.raw.letitsnow, R.raw.noelcestcommeunrythmedejazz, R.raw.noeljoyeuxnoel, R.raw.petitpapanoel, R.raw.vivelevent, R.raw.wewish};
        super.soundImage = new Integer[]{R.drawable.alliwantforchrismas, R.drawable.doucenuit, R.drawable.jinglebells, R.drawable.letitsnow, R.drawable.noelcestcommeunrythmedejazz, R.drawable.noeljoyeuxnoel, R.drawable.petitpapanoel, R.drawable.vivelevent, R.drawable.wewishyouamerrychrismas};
        super.after();
        return view;
    }
}
