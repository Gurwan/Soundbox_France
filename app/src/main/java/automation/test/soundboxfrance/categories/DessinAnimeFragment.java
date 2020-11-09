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

public class DessinAnimeFragment extends SuperFragment {

    public DessinAnimeFragment(GeneriquesActivity mainActivity) {
        super(mainActivity);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.before(inflater,container);
        super.nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesGeneriquesDessinsAnimes));
        super.soundID = new Integer[]{R.raw.generiquetintin,R.raw.quoideneufscoobydoo,R.raw.voicivenue,R.raw.generiqueouioui,R.raw.generiquetrotro,R.raw.generiquetchoupi,R.raw.generiqueteletubbies,R.raw.generiquepantheresroses,R.raw.simpsons,R.raw.inspecteurgadgetgenerique,R.raw.lescitesdrogenerique,R.raw.denverledernierdinosaure,R.raw.lesratzgenerique,R.raw.ricketmortyopening,R.raw.yakarigenerique,R.raw.southparkgenerique,R.raw.oggyetlescafards,R.raw.codelyokogenerique,R.raw.boblepongegenerique,R.raw.iletaitunefoislaviegenerique,R.raw.footdeuxruegenerique,R.raw.adventuretimegenerique,R.raw.bienvenuechezlesloud,R.raw.corneiletbernie,R.raw.miraculous,R.raw.bojackhorsemangenerique,R.raw.labandeapicsou,R.raw.martinmatingenerique,R.raw.petitoursbrungenerique,R.raw.iletaitunefoislhomme,R.raw.generiquethomastrain,R.raw.barbapapa,R.raw.benten,R.raw.casper,R.raw.eckhart,R.raw.garfield,R.raw.hamtaro,R.raw.marsupilami,R.raw.perecastor,R.raw.sharkyetgeorges,R.raw.shurikenschool,R.raw.gravityfalls,R.raw.monstersincearrape};
        super.soundImage = new Integer[]{R.drawable.tintin,R.drawable.scoobydoo,R.drawable.ilesauxenfants,R.drawable.ouioui,R.drawable.anetrotro,R.drawable.tchoupi,R.drawable.teletubbies,R.drawable.panthererose,R.drawable.simpsons, R.drawable.inspecteurgadget,R.drawable.citedor,R.drawable.denver,R.drawable.ratz,R.drawable.ricketmorty,R.drawable.yakari,R.drawable.southpark,R.drawable.oggy, R.drawable.codelyoko,R.drawable.bobleponge,R.drawable.iletaitunefoislavie,R.drawable.foot2rue,R.drawable.adventuretime,R.drawable.bienvenuechezlesloud,R.drawable.corneiletbernie, R.drawable.miraculous,R.drawable.bojackhorseman,R.drawable.picsou,R.drawable.martinmatin,R.drawable.petitoursbrun,R.drawable.iletaitunefoislhomme,R.drawable.thomasletrain, R.drawable.barbapapa,R.drawable.benten,R.drawable.casper,R.drawable.eckhart,R.drawable.garfield,R.drawable.hamtaro,R.drawable.marsupilami,R.drawable.perecastor, R.drawable.sharkygeorge,R.drawable.shurikenschool,R.drawable.gravityfalls,R.drawable.monsterinc};
        super.after();
        return view;
    }
}
