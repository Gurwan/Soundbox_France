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

public class Music3070Fragment extends SuperFragment {

    public Music3070Fragment(MusicFragment mainActivity) {
        super(mainActivity);
    }

    public Music3070Fragment(){}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.before(inflater,container);
        super.nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesMusique3070));
        super.soundID = new Integer[]{R.raw.bellaciao,R.raw.hellodarkness,R.raw.trololosong,R.raw.comeandgetyoulove,R.raw.jemepresentejemappellehenri,R.raw.lalallalallalala,R.raw.wearethechampions,R.raw.auxchampselysees,R.raw.emmenezmoi,R.raw.oniratousauparadis,R.raw.poupeedecirepoupeedeson,R.raw.boogiewonderland,R.raw.bourvillatactiquedugendarme};
        super.soundImage = new Integer[]{R.drawable.bellaciao,R.drawable.hellodarknessmyoldfriend,R.drawable.trolololo,R.drawable.comeandgetyourlove,R.drawable.jemepresente,R.drawable.lalalalala,R.drawable.wearethechampions,R.drawable.champselysees,R.drawable.emmenezmoi,R.drawable.oniratousauparadis,R.drawable.poupeedecire,R.drawable.boogiewonderland,R.drawable.bourvillatactiquedugendarme};
        super.after();
        return view;
    }
}
