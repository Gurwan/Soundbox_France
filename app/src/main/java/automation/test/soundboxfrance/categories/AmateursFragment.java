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

public class AmateursFragment extends SuperFragment {

    public AmateursFragment(MusiqueRapAutres mainActivity) {
        super(mainActivity);
    }

    public AmateursFragment(){}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.before(inflater,container);
        super.nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesMusiqueAmateurs));
        super.soundID = new Integer[]{R.raw.tkpokemon,R.raw.fleurjojo,R.raw.chouxmisterv,R.raw.playpokemongo,R.raw.tripalosky,R.raw.cestbeaulapetanque,R.raw.musiquetriste, R.raw.cuirmoustache,R.raw.issounightclub,R.raw.jesuisens,R.raw.jarrivecorobizar,R.raw.jevoulaisjustebriller,R.raw.onmappellelovnicover,R.raw.onvalapecho,R.raw.jaimelemondededisney,R.raw.maya,R.raw.pokemonfarod, R.raw.pokemonsimondu33,R.raw.pourtoutceuxquiontlacrotteaucul,R.raw.soireeraclette,R.raw.batcouille,R.raw.passepartout,R.raw.couscoussaucisse,R.raw.jailaquequette, R.raw.pyrobarbare,R.raw.chansondelajoie,R.raw.marseillaisetk,R.raw.placementdeproduits,R.raw.freestyledelautoderision,R.raw.bonanniversairelesptitsindiens,R.raw.luigiclashmario,R.raw.wiggleremix};
        super.soundImage = new Integer[]{R.drawable.nousvivonsdansunmondedepokemon,R.drawable.petitesfleurs,R.drawable.savezvousplanterleschoux,R.drawable.playpokemongo,R.drawable.tripalosky,R.drawable.petanque,R.drawable.musiquetriste,R.drawable.cuirmoustache,R.drawable.issounightclub,R.drawable.jesuisens,R.drawable.jarrivejarrive, R.drawable.jevoulaisjustebriller,R.drawable.ovnicover,R.drawable.onvalapecho,R.drawable.jaimelemondededisney,R.drawable.cettepetiteabeille,R.drawable.attrapezlestousfarod, R.drawable.attrapezsimon,R.drawable.crotteaucul,R.drawable.soireeraclette,R.drawable.onsenbatlescouilles,R.drawable.jesuispassepartout,R.drawable.couscoussaucisse, R.drawable.jailaquequettequicolle,R.drawable.chansonpyrobarbare,R.drawable.chansondelajoie,R.drawable.marseillaisetk,R.drawable.placementdeproduit,R.drawable.freestyledelautoderision,R.drawable.bonanniversairelesptitsindiens,R.drawable.luigiclashmario,R.drawable.wiggleremix};
        super.after();
        return view;
    }
}
