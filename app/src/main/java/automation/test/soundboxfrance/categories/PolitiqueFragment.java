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

public class PolitiqueFragment extends SuperFragment {

    public PolitiqueFragment(SportPoliHumActivity mainActivity) {
        super(mainActivity);
    }

    public PolitiqueFragment(){}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.before(inflater,container);
        super.nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesPolitique));
        super.soundID = new Integer[]{R.raw.ntmmlp,R.raw.bing_bing_trump,R.raw.jeanne,R.raw.perlimpinpin,R.raw.melenchonmaisquielle,R.raw.pensez_printemps_deux,R.raw.filsdeberger,R.raw.chercompatriote,R.raw.dansnosvilles,R.raw.ouimacron,R.raw.chefmacron,R.raw.notreprojetmacron,R.raw.fillon,R.raw.cahuzac,R.raw.marinelepenmenti,R.raw.rouquainjmlp,R.raw.fricmelenchon,R.raw.phillipot,R.raw.macronprintemps,R.raw.maisvousfumezmonsieur,R.raw.cassetoipauvrecon,R.raw.yeswecan,R.raw.carglassconnasse,R.raw.carabistouille,R.raw.ilsvontvousbaiser,R.raw.jevousaicompris,R.raw.bamboula,R.raw.cavamanu,R.raw.jevaisluiretirersoncalecon,R.raw.situcroisquecesteninsultant,R.raw.ouaismelenchon,R.raw.larepubliquecestmoi,R.raw.jaidesamisarabes,R.raw.noussommesenguerre,R.raw.quelleindignite,R.raw.menteurpharisien,R.raw.nonjaipasdamis,R.raw.aurevoir};
        super.soundImage = new Integer[]{R.drawable.niquetamere,R.drawable.bingbingbang,R.drawable.jeanneausecours,R.drawable.poudredeperlimpinpin,R.drawable.maisquielleestcellela,R.drawable.pensezprintemps,R.drawable.jesuisfilsdeberger,R.drawable.mescherscompatriotes,R.drawable.danslescampagnes,R.drawable.ouiouimacron,R.drawable.jesuisvotrechef,R.drawable.notreprojet,R.drawable.misenexamen,R.drawable.cahuzac,R.drawable.marinelepenamenti,R.drawable.rouquinva,R.drawable.ilfautbienundebataups,R.drawable.tamerelaputevoila,R.drawable.pensezprintempsmacron,R.drawable.maisvousfumezmonsieur,R.drawable.cassetoipauvrecon,R.drawable.yeswecan,R.drawable.carglassconnasse,R.drawable.carabistouilles,R.drawable.ilsvontvousbaiser,R.drawable.jevousaicompris,R.drawable.bamboula,R.drawable.cavamanu,R.drawable.jevaisluiretirersoncalecon,R.drawable.situcroisquecesteninsultant,R.drawable.ouaismelenchon,R.drawable.larepubliquecestmoi,R.drawable.jaidesamisarabes,R.drawable.noussommesenguerre,R.drawable.quelleindignite,R.drawable.menteurpharisien,R.drawable.nonjaipasdamis,R.drawable.aurevoir};
        super.after();
        return view;
    }
}