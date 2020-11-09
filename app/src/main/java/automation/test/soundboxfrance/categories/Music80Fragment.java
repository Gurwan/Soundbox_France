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

public class Music80Fragment extends SuperFragment {

    public Music80Fragment(MusicFragment mainActivity) {
        super(mainActivity);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.before(inflater,container);
        super.nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesMusique80));
        super.soundID = new Integer[]{R.raw.hellolionelrichie,R.raw.takeonme,R.raw.lesdemonsdeminuit,R.raw.nuitdefolie,R.raw.partenaireparticulier,R.raw.souslesoleildestropiques,R.raw.humannatur,R.raw.laventurierindochine,R.raw.monfilsmabataille,R.raw.justcantgetenough,R.raw.sweetdreams,R.raw.totaleclipseoftheheart,R.raw.babybemine,R.raw.billiejean};
        super.soundImage = new Integer[]{R.drawable.hellolionelrichie,R.drawable.takeonme,R.drawable.demondeminuit,R.drawable.nuitdefolie,R.drawable.partenaireparticulier,R.drawable.souslesoleildestropiques,R.drawable.humannature,R.drawable.laventurier,R.drawable.monfilsmabataille,R.drawable.justcantgetenough,R.drawable.sweetdreams,R.drawable.totaleclipse,R.drawable.babybemine,R.drawable.billiejean};
        super.after();
        return view;
    }
}


