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

public class BruitageFragment extends SuperFragment {

    public BruitageFragment(ThemeActivity mainActivity) {
        super(mainActivity);
    }

    public BruitageFragment(){}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.before(inflater,container);
        super.nameList = Arrays.asList(getResources().getStringArray(R.array.soundNameBruitage));
        super.soundID = new Integer[]{R.raw.proutson,R.raw.brouillagebbc,R.raw.suspense,R.raw.sirenepompier,R.raw.sirenepolice,R.raw.sirenenucleaire,R.raw.bruitagetoc, R.raw.chien,R.raw.clicsouris,R.raw.dauphin,R.raw.denied,R.raw.baseviral,R.raw.windowsxpdemarre,R.raw.windowsxparret,R.raw.menacedetectee,R.raw.klaxon,R.raw.asmr, R.raw.badumtss,R.raw.lawandordersoundeffect,R.raw.crichevre,R.raw.windowsxpsounderror,R.raw.intronetflix,R.raw.canard,R.raw.chat,R.raw.cochon,R.raw.bruitrat, R.raw.bruitzombie,R.raw.portequigrince,R.raw.rot,R.raw.otarie};
        super.soundImage = new Integer[]{R.drawable.prout,R.drawable.brouillage,R.drawable.suspens,R.drawable.sirenepompiers,R.drawable.sirenepolice,R.drawable.sirenenucleaire, R.drawable.toctoc,R.drawable.chien,R.drawable.souris,R.drawable.dauphin,R.drawable.denied,R.drawable.labaseviralevp,R.drawable.demarragewindowsxp, R.drawable.quitterwindowsxp,R.drawable.menacedetectee,R.drawable.klaxon,R.drawable.asmr,R.drawable.badumtss,R.drawable.lawandorder,R.drawable.goatscream, R.drawable.erreurwindowsxp,R.drawable.netflix,R.drawable.canard,R.drawable.chat,R.drawable.cochon,R.drawable.bruitrat,R.drawable.bruitzombie,R.drawable.portegrince,R.drawable.rot,R.drawable.otarie};
        super.after();
        return view;
    }
}