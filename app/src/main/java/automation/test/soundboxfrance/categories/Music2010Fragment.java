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

public class Music2010Fragment extends SuperFragment {

    public Music2010Fragment(MusiqueRapAutres mainActivity) {
        super(mainActivity);
    }

    public Music2010Fragment(){}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.before(inflater,container);
        super.nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesMusique2010));
        super.soundID = new Integer[]{R.raw.despacito,R.raw.surlesmurs,R.raw.colorgitano,R.raw.bazardee,R.raw.natacha,R.raw.andalouse,R.raw.seeyouagain,R.raw.helloistme,R.raw.iltrousonslip,R.raw.gillesdorblanc,R.raw.commentnepastelouer,R.raw.cartouchesebastienpatoche,R.raw.vladimircauchemaraulos,R.raw.harlemshake,R.raw.gangnamstyle,R.raw.coupsetblessures,R.raw.celuicolonelreyel,R.raw.mademoisellevalerie,R.raw.magicintheair,R.raw.wakawaka,R.raw.tumatantdonne,R.raw.auxarbrescitoyens,R.raw.pumpupkicks,R.raw.babyimyours,R.raw.ridetwentyonepilots,R.raw.mescopines,R.raw.doucement,R.raw.crabrave,R.raw.dismoiouimarina,R.raw.byebye,R.raw.mirador,R.raw.herecomesthehotstepper,R.raw.jsuisdanslaboite,R.raw.allezlesgros,R.raw.anissa,R.raw.astronomiacoffindance,R.raw.heatenstwentyonepilot,R.raw.sourisvertenaza,R.raw.deconnectedjhamida,R.raw.midnightcity,R.raw.onseconnaityouss,R.raw.wrongneighborhood,R.raw.ayo,R.raw.cocowejdene,R.raw.galettesaucissejetaime,R.raw.goodbyetoaworld,R.raw.onsfaitdumal,R.raw.wiggle,R.raw.buttercup,R.raw.chipolata,R.raw.mood,R.raw.salt};
        super.soundImage = new Integer[]{R.drawable.despacito,R.drawable.onecritsurlesmurs,R.drawable.gitano,R.drawable.bazardee,R.drawable.natacha,R.drawable.andalouse,R.drawable.seeyouagain,R.drawable.hello,R.drawable.quandilpete,R.drawable.blancsanslen,R.drawable.commentnepastelouer,R.drawable.cartouche,R.drawable.aulos,R.drawable.harlemshake,R.drawable.gangnamstyle,R.drawable.coupsetblessures,R.drawable.celui,R.drawable.jaimeraistrop,R.drawable.magicintheair,R.drawable.wakawaka,R.drawable.tumastantdonne,R.drawable.auxarbres,R.drawable.pumpupkicks,R.drawable.babyimyours,R.drawable.ride,R.drawable.mescopines,R.drawable.doucement,R.drawable.crabrave,R.drawable.dismoiouimarina,R.drawable.byebye,R.drawable.mirador,R.drawable.herecomes,R.drawable.jsuisdanslaboite,R.drawable.allezlesgros,R.drawable.anissa,R.drawable.coffindance,R.drawable.heatenstwentyonepilots,R.drawable.sourisvertenaza,R.drawable.deconnecte,R.drawable.midnightcity,R.drawable.onseconnaityouss,R.drawable.wrongneighborhood,R.drawable.ayo,R.drawable.cocowejdene,R.drawable.galettesaucissejetaime,R.drawable.goodbyetoaworld,R.drawable.onsfaitdumal,R.drawable.wiggle,R.drawable.buttercup,R.drawable.chipolata,R.drawable.mood,R.drawable.salt};
        super.after();
        return view;
    }
}
