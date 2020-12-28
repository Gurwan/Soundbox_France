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

    public HymnesFragment(){}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        super.before(inflater,container);
        super.nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesHymnes));
        super.soundID = new Integer[]{R.raw.hymnealgerie,R.raw.hymneallemand,R.raw.argentine,R.raw.hymnearmenie,R.raw.australie,R.raw.hymnebelge,R.raw.bresil,R.raw.ohbreizh,R.raw.canada,R.raw.hymnechampionsleague,R.raw.colombie,R.raw.ecosse,R.raw.egypte,R.raw.hymneespagne,R.raw.europaleague,R.raw.finlande,R.raw.marseillaise,R.raw.hongrie,R.raw.irlandtheme,R.raw.hymneitalien,R.raw.japon,R.raw.hymnemaroc,R.raw.mexique,R.raw.norvege,R.raw.paysdegalle,R.raw.hymneportugais,R.raw.republiquedemocratiqueducongo,R.raw.hymnesenegal,R.raw.slovenie,R.raw.suede,R.raw.hymnetunisie,R.raw.hymneturc,R.raw.uksong,R.raw.hymneunionsovietique,R.raw.hymneusa};
        super.soundImage = new Integer[]{R.drawable.algerie,R.drawable.allemagne,R.drawable.argentine,R.drawable.armenie,R.drawable.australie,R.drawable.belgique,R.drawable.bresil,R.drawable.brogozhmazadou,R.drawable.canada,R.drawable.championsleague,R.drawable.colombie,R.drawable.ecosse,R.drawable.egypte,R.drawable.espagne,R.drawable.europaleague,R.drawable.finlande,R.drawable.france,R.drawable.hongrie,R.drawable.irlande,R.drawable.italie,R.drawable.japon,R.drawable.maroc,R.drawable.mexique,R.drawable.norvege,R.drawable.paysdegalle,R.drawable.portugal,R.drawable.congordc,R.drawable.senegal,R.drawable.slovenie,R.drawable.suede,R.drawable.tunisie,R.drawable.turquie,R.drawable.royaumeuni,R.drawable.urss,R.drawable.usa};
        super.after();
        return view;
    }
}
