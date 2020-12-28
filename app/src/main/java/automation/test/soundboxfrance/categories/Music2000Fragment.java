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

public class Music2000Fragment extends SuperFragment {

    public Music2000Fragment(MusicFragment mainActivity) {
        super(mainActivity);
    }

    public Music2000Fragment(){}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.before(inflater,container);
        super.nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesMusique2000));
        super.soundID = new Integer[]{R.raw.serviettes,R.raw.whocansay,R.raw.dingdongsong,R.raw.mayahi,R.raw.alexf,R.raw.tuveuxmonzizifrankievincent,R.raw.chacaronmacaron,R.raw.fuckyoufuckyou,R.raw.garcon,R.raw.benoittournetoi,R.raw.hungup,R.raw.rockthisparty};
        super.soundImage = new Integer[]{R.drawable.tournerlesserviettes,R.drawable.whocansay,R.drawable.dingdong,R.drawable.mayahi,R.drawable.alexf,R.drawable.tuveuxmonzizi,R.drawable.chacaronmacarron,R.drawable.fuckyou,R.drawable.garcon,R.drawable.benoittournetoi,R.drawable.hungup,R.drawable.rockthisparty};
        super.after();
        return view;
    }
}
