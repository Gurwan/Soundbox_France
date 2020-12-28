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

public class SeriesTVGeneriqueFragment extends SuperFragment {

    public SeriesTVGeneriqueFragment(GeneriquesActivity mainActivity) {
        super(mainActivity);
    }

    public SeriesTVGeneriqueFragment(){}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.before(inflater,container);
        super.nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesGeneriquesSeriesTV));
        super.soundID = new Integer[]{R.raw.generiquegot,R.raw.generiquetbbt,R.raw.generiquetwd,R.raw.generiquevikings,R.raw.zorro,R.raw.lapetitemaisondanslaprairie,R.raw.narcos,R.raw.xfiles,R.raw.docteurwhogenerique,R.raw.agencetoutrisques,R.raw.generiqueprisonbreak,R.raw.powersrangersgenerique,R.raw.generiquelestetesbrulees,R.raw.codequantumgenerique,R.raw.chaletgenerique,R.raw.macgyvergenerique,R.raw.malcolmgenerique,R.raw.breakingbadgenerique,R.raw.strangerthingsgenerique,R.raw.generiquelacasadepapel,R.raw.dallasgenerique,R.raw.walkertexasrangerop,R.raw.mrbeangenerique,R.raw.thehundredop,R.raw.smallvillegenerique,R.raw.broklynnineninegenerique,R.raw.teenwolfgenerique,R.raw.generiquefriends,R.raw.generiquelarmefatale,R.raw.campingparadis,R.raw.josephineangegardien,R.raw.theofficetheme,R.raw.howimetyourmother,R.raw.lucifer,R.raw.peakyblinders};
        super.soundImage = new Integer[]{R.drawable.gameofthrones,R.drawable.thebigbangtheory,R.drawable.thewalkingdead,R.drawable.vikings,R.drawable.zorro,R.drawable.laptitemaisondanslaprairie,R.drawable.narcos,R.drawable.xfiles,R.drawable.docteurwho,R.drawable.agencetoutrisques,R.drawable.prisonbreak,R.drawable.powerrangers,R.drawable.lestetesbrulees,R.drawable.codequantum,R.drawable.lechalet,R.drawable.macgyver,R.drawable.malcolminthemiddle,R.drawable.breakingbad,R.drawable.strangersthings,R.drawable.casadelpapel,R.drawable.dallas,R.drawable.waltertexasranger,R.drawable.mrbean,R.drawable.thecent,R.drawable.smallville,R.drawable.brooklynninenine,R.drawable.teenwolf,R.drawable.friends,R.drawable.larmefatale,R.drawable.campingparadis,R.drawable.josephineangegardien,R.drawable.theoffice,R.drawable.howimetyourmother,R.drawable.lucifer,R.drawable.peakyblinders};
        super.after();
        return view;
    }
}
