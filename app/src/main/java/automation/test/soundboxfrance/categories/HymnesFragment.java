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

public class HymnesFragment extends SuperFragment {

    public HymnesFragment(ThemeActivity themeActivity) {
        super(themeActivity);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        super.before(inflater,container);
        super.nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesHymnes));
        super.soundID = new Integer[]{R.raw.hymnearmenie,R.raw.hymneallemand,R.raw.hymneunionsovietique,R.raw.marseillaise,R.raw.uksong,R.raw.hymneitalien,R.raw.hymneusa,R.raw.hymneturc,R.raw.hymneportugais,R.raw.hymnechampionsleague,R.raw.hymnemaroc,R.raw.hymnealgerie,R.raw.hymnesenegal,R.raw.hymnebelge,R.raw.hymneespagne,R.raw.ohbreizh,R.raw.irlandtheme,R.raw.hymnetunisie};
        super.soundImage = new Integer[]{R.drawable.armenie,R.drawable.allemagne,R.drawable.urss,R.drawable.france,R.drawable.royaumeuni,R.drawable.italie,R.drawable.usa,R.drawable.turquie,R.drawable.portugal,R.drawable.championsleague,R.drawable.maroc,R.drawable.algerie,R.drawable.senegal,R.drawable.belgique,R.drawable.espagne,R.drawable.brogozhmazadou,R.drawable.irlande,R.drawable.tunisie};
        super.after();
        return view;
    }
}
