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

public class SportFragment extends SuperFragment {

    public SportFragment(SportPoliHumActivity mainActivity) {
        super(mainActivity);
    }

    public SportFragment(){}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.before(inflater,container);
        super.nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesSport));
        super.soundID = new Integer[]{R.raw.si,R.raw.ouidrogba,R.raw.makelele,R.raw.assassin,R.raw.autantdefdp,R.raw.cestpaspossible,R.raw.ohouigreg,R.raw.jaipastouche,R.raw.pascazinedine,R.raw.thauvinfdp,R.raw.johncena,R.raw.amoursansprelis,R.raw.crucifiecrucifie,R.raw.championmonfrere,R.raw.jeleurpisseaucul,R.raw.polomatvstolisso,R.raw.jeanmichelaulas,R.raw.jaiquecaadire,R.raw.jmenbaslescouilleskevin,R.raw.monsieurblaisematuidi,R.raw.samuelumtiti,R.raw.benjaminpavard,R.raw.diraispasquelequipeenface,R.raw.ngolokantesong,R.raw.notinmyhouse,R.raw.pourlabelgique,R.raw.ehgiroudntm,R.raw.ohmessiciao,R.raw.secondpoteaupavar,R.raw.attentionalamousse,R.raw.cestfait,R.raw.interviewfekir,R.raw.rirekawhileonard,R.raw.ligueun,R.raw.ilovethisgame,R.raw.starfoulahgrigri,R.raw.cestlesemotionsenfait,R.raw.nkunkucestaudessus,R.raw.tuvaourestela,R.raw.attentionphilippeleparapet,R.raw.tourdefrancetheme,R.raw.vaymonpetit,R.raw.watchoutwatchout,R.raw.ahouaisilssontbizarreeux,R.raw.heattrapezle,R.raw.itstimetogo,R.raw.theyhadusinthefirsthalf,R.raw.camefaitbander,R.raw.gaucherdroitierdembele,R.raw.lachattebenoitpaire,R.raw.onaenviedallerpleurer,R.raw.multiplexcanalplus,R.raw.nbasoundeffect,R.raw.accelereaccelere,R.raw.messimessimessi};
        super.soundImage = new Integer[]{R.drawable.ronaldosiii,R.drawable.drogba,R.drawable.makelele,R.drawable.ohlassassin,R.drawable.autantdefilsdepute,R.drawable.noncestpaspossible,R.drawable.ohouigreg,R.drawable.jaipastouche,R.drawable.pascazinedine,R.drawable.thauvinfilsdepute,R.drawable.johncena,R.drawable.ilvaluifairelamoursans,R.drawable.crucifie,R.drawable.championmonfrere,R.drawable.jeleurpisseaucul,R.drawable.polomattolisso,R.drawable.jeanmichelaulas,R.drawable.jaiquecaadire,R.drawable.jmenbaslescouilles,R.drawable.monsieurblaisematuidi,R.drawable.samuelumtiti,R.drawable.benjaminpavard,R.drawable.jenediraispasquelequipeenface,R.drawable.ngolokante,R.drawable.notinmyhouse,R.drawable.pourlabelgique,R.drawable.giroudntm,R.drawable.ohmessiciao,R.drawable.secondpoteaupavard,R.drawable.attentionalamousse,R.drawable.cestfait,R.drawable.interviewnabilfekir,R.drawable.riredekawhileonard,R.drawable.ligueunconforama,R.drawable.ilovethisgame,R.drawable.starfoulah,R.drawable.clesemotionsenfait,R.drawable.nkunkucestaudessus,R.drawable.restela,R.drawable.attentionphilippeleparapet,R.drawable.tourdefrance,R.drawable.vaymonpetit,R.drawable.watchoutwatchout,R.drawable.ahouaisilssontbizarre,R.drawable.heattrapezle,R.drawable.itstimetogo,R.drawable.theyhadusinthefirsthalf,R.drawable.camfaitbander,R.drawable.gaucherdroitierdembele,R.drawable.lachattebenoitpaire,R.drawable.onaenviedallerpleurer,R.drawable.multiplexcanalplus,R.drawable.nbasoundeffect,R.drawable.accelereaccelere,R.drawable.messimessimessi};
        super.after();
        return view;
    }
}