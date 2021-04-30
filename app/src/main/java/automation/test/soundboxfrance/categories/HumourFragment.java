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

public class HumourFragment extends SuperFragment {

    public HumourFragment(SportPoliHumActivity mainActivity) {
        super(mainActivity);
    }

    public HumourFragment(){}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        super.before(inflater,container);
        super.nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesHumour));
        super.soundID = new Integer[]{R.raw.moulebite,R.raw.fernandel,R.raw.remisusc,R.raw.faux_norman,R.raw.calmedenis,R.raw.papabigar,R.raw.tuveuxdupain,R.raw.itaitao,R.raw.dorian,R.raw.loosers,R.raw.guillaumelethug,R.raw.champagne,R.raw.william,R.raw.francoisdamien,R.raw.karambeu,R.raw.bitemisterv,R.raw.coucoujeanjean,R.raw.quentinfdp,R.raw.jorislecon,R.raw.patricekemar,R.raw.lewoopblackops,R.raw.ehntm,R.raw.sitapasdamisvasurtwitter,R.raw.pourfetercapizza,R.raw.estquetubaises,R.raw.unebiteallez,R.raw.palmashowtchintchin,R.raw.ilestdurcommeunfessier,R.raw.ilafaitsablaguedemerde,R.raw.wallahcestpasmoi,R.raw.fatalbazookasavane,R.raw.bonbahazidane,R.raw.jveuxpasdunverre,R.raw.lesproduitslaitiers,R.raw.ohbosetti,R.raw.ouarzazate,R.raw.wakandamisterv,R.raw.etcafaitcliclic,R.raw.maiscommentvsmaveztrouver,R.raw.encorecafaitbcplanon,R.raw.ouilesinconnus,R.raw.tuesqui,R.raw.tuveuxpasmilleballes,R.raw.undecapourdonat,R.raw.enpleindanslesanglier,R.raw.jvaisledemarrerct,R.raw.maplay,R.raw.moijaimelepimentdespelette,R.raw.pendantlesvacancesjenefaisrien};
        super.soundImage = new Integer[]{R.drawable.toutlemondeenmoulebite,R.drawable.fernandfernandel,R.drawable.remisusceptible,R.drawable.normanfaux,R.drawable.tutecalmesdenis,R.drawable.jesuispapa,R.drawable.tuveuxdupain,R.drawable.itaitao,R.drawable.quicestquiatoucheadorian,R.drawable.salutlesloosers,R.drawable.guillaumelethug,R.drawable.champagne,R.drawable.williamcoachenseduction,R.drawable.francoislembrouille,R.drawable.monsieuretmadamekarambeu,R.drawable.mabitemisterv,R.drawable.coucoujeanjean,R.drawable.quentinfilsdeup,R.drawable.jorislecon,R.drawable.patrice,R.drawable.undeuxtroissix,R.drawable.ehntm,R.drawable.sitapasdamisvasurtwitter,R.drawable.pourfetercapizza,R.drawable.estcequetubaises,R.drawable.unebiteallez,R.drawable.etsijecollemescouilles,R.drawable.ilestdurcommeunfessier,R.drawable.ilafaitsablaguedemerde,R.drawable.wallahcestpasmoi,R.drawable.ilestsibonlesavane,R.drawable.bonbahazidane,R.drawable.jveuxpasdunverre,R.drawable.lesproduitslaitiers,R.drawable.ohbosetti,R.drawable.ouarzazate,R.drawable.wakanda,R.drawable.etcafaitcliclic,R.drawable.maiscommentvousmaveztrouve,R.drawable.encorecafaitbeaucouplanon,R.drawable.ouilesinconnus,R.drawable.tuesqui,R.drawable.tuveuxpasmilleballes,R.drawable.undecapourdonat,R.drawable.enpleindanslesanglier,R.drawable.jevaisledemarrer,R.drawable.maplay,R.drawable.moijaimelepimentdespelette,R.drawable.pendantlesvacancesjenefaisrien};
        super.after();
        return view;
    }
}