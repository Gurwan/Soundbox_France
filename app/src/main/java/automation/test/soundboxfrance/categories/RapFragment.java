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

public class RapFragment extends SuperFragment {

    public RapFragment(MusiqueRapAutres mainActivity) {
        super(mainActivity);
    }

    public RapFragment(){}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.before(inflater,container);
        super.nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesMusiqueRap));
        super.soundID = new Integer[]{R.raw.abonne,R.raw.vainqueurs,R.raw.siboy,R.raw.ichich,R.raw.bernardtapi,R.raw.weshalors,R.raw.whiskycoca,R.raw.sauvagerie,R.raw.puteuh,R.raw.bigshaq,R.raw.ridin,R.raw.kekedouloveme,R.raw.smokeweed,R.raw.olaladems,R.raw.olalapnl,R.raw.guccigang,R.raw.pouloulou,R.raw.sucerpastromper,R.raw.deviensgenial,R.raw.ovni,R.raw.inshallahinshallahinshallah,R.raw.septfoisdisquedediamant,R.raw.boobaweshmorray,R.raw.noirlord,R.raw.jeplanecommelaviondepablo,R.raw.esskeetit,R.raw.ohlord,R.raw.ducjeconfirme,R.raw.simplebasique,R.raw.jesensquecematin,R.raw.maskoff,R.raw.drose,R.raw.mytime,R.raw.jsuisqunthug,R.raw.rouleunboze,R.raw.boobaoklm,R.raw.bonjourvald,R.raw.cartonrougelorenzo,R.raw.pupupute,R.raw.bumbumtamtam,R.raw.kingsdeadearrape,R.raw.bizarrelorenzo,R.raw.loupgaroumonptitloup,R.raw.bandorelo,R.raw.tchoinkaaris,R.raw.longuevie,R.raw.saladetomate,R.raw.ahouaisouais,R.raw.sadxxx,R.raw.mamiejetaime,R.raw.ultimatedenzelcurry,R.raw.toucheunmembredemaclique,R.raw.kobaladtraindevie,R.raw.aulosreloaded,R.raw.ramenezlacoupealamaison,R.raw.laputaindtamadre,R.raw.maisfermetagueuletoi,R.raw.shayjolie,R.raw.giletjaune,R.raw.milledegreslomepal,R.raw.khapta,R.raw.audd,R.raw.aroufgangstapalalala,R.raw.ivana,R.raw.juillet,R.raw.oldtownroad,R.raw.batimentniska,R.raw.lagrossemoula,R.raw.medicamentniska,R.raw.unpeudehaineplk,R.raw.blanchemaes,R.raw.jcvdjul,R.raw.mariekoba,R.raw.md,R.raw.moulaga,R.raw.nerevienspas,R.raw.putainzebi,R.raw.camderangepasmoijaimebien,R.raw.regardemoibien,R.raw.pimpfiftycent,R.raw.djomb,R.raw.zumbacafe,R.raw.commegotaga};
        super.soundImage = new Integer[]{R.drawable.abonne,R.drawable.lesvainqueurs,R.drawable.aurevoirmerci,R.drawable.ishish,R.drawable.gims,R.drawable.weshalors,R.drawable.whiskycoca,R.drawable.arretducoeur,R.drawable.puteuh,R.drawable.bigshaq,R.drawable.ridin,R.drawable.kekedouloveme,R.drawable.smokeweedeveryday,R.drawable.olaladamso,R.drawable.olalapnl,R.drawable.guccigang,R.drawable.pouloulou,R.drawable.sefairesucercestpastromper,R.drawable.deviensgenial,R.drawable.onmappellelovni,R.drawable.inshallahinshallah,R.drawable.septfoisdisquedediamant,R.drawable.weshmorray,R.drawable.toutestnoir,R.drawable.jeplanecommelaviondepablo,R.drawable.esskeetit,R.drawable.ohlord,R.drawable.ducjeconfirme,R.drawable.simplebasique,R.drawable.jesensquecematin,R.drawable.maskoff,R.drawable.drose,R.drawable.mytime,R.drawable.jsuisquunthug,R.drawable.rouleunboze,R.drawable.oklmbooba,R.drawable.ilapasditbonjour,R.drawable.cartonrouge,R.drawable.pupupupute,R.drawable.bumbumtamtam,R.drawable.kingsdead,R.drawable.bizarre,R.drawable.loupgarou,R.drawable.bandolero,R.drawable.tchoin,R.drawable.longuevie,R.drawable.saladetomateetsansoignon,R.drawable.ahouaisouaisouais,R.drawable.sad,R.drawable.mamiejetaime,R.drawable.ultimate,R.drawable.toucheunmembredema,R.drawable.traindevie,R.drawable.aulosreloaded,R.drawable.ramenezlacoupealamaison,R.drawable.laputaindetamadre,R.drawable.maisfermetagueuletoi,R.drawable.jolie,R.drawable.giletsjaunes,R.drawable.milledegres,R.drawable.khapta,R.drawable.audd,R.drawable.palalala,R.drawable.ivanadeuxpointzero,R.drawable.juillet,R.drawable.oldtownroad,R.drawable.batimentniska,R.drawable.lagrossemoula,R.drawable.medicament,R.drawable.unpeudehaine,R.drawable.blanche,R.drawable.jcvd,R.drawable.mariekobalad,R.drawable.md,R.drawable.moulaga,R.drawable.nerevienspas,R.drawable.putainzebi,R.drawable.camderangepasmoijaimebien,R.drawable.regardemoibien,R.drawable.pimpfiftycent,R.drawable.djomb,R.drawable.zumbacafe,R.drawable.commegotaga};
        super.after();
        return view;
    }
}
