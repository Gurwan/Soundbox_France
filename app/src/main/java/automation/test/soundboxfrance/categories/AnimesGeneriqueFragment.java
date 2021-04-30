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

public class AnimesGeneriqueFragment extends SuperFragment {

    public AnimesGeneriqueFragment(GeneriquesActivity mainActivity) {
        super(mainActivity);
    }

    public AnimesGeneriqueFragment(){}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.before(inflater,container);
        super.nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesGeneriquesAnime));
        super.soundID = new Integer[]{R.raw.pokemongenerique,R.raw.inazumaeleven,R.raw.generiquedbz,R.raw.generiquedbs,R.raw.generiqueattaquesdestitans,R.raw.beybladegenerique,R.raw.dbsopdeux,R.raw.nanatsunotaizaiopening,R.raw.openingonepiece,R.raw.kurokonobasket,R.raw.fairytail,R.raw.onepunchman,R.raw.dragonballopening,R.raw.tokyoghoulopening,R.raw.myheroacademiaop,R.raw.souleaterop,R.raw.hunterxhunterop,R.raw.assassinationclassroom,R.raw.monvoisintotoro,R.raw.oliveettom,R.raw.saintseiya,R.raw.thepromisedneverland,R.raw.evangelion,R.raw.fullmetalalchimistintro,R.raw.bluebirdnaruto,R.raw.demonslayer,R.raw.foodwars,R.raw.swordartonline,R.raw.sasageyo,R.raw.deathnote,R.raw.jujutsukaisenending};
        super.soundImage = new Integer[]{R.drawable.pokemon,R.drawable.inazumaeleven,R.drawable.dragonballz,R.drawable.dragonballsuper,R.drawable.attaquedestitans,R.drawable.beyblade,R.drawable.dragonballsuperdeux,R.drawable.sevendeadlysins, R.drawable.sharetheworld,R.drawable.kurokonobasket,R.drawable.fairytail,R.drawable.onepunchman,R.drawable.dragonball,R.drawable.tokyoghoul,R.drawable.myheroacademia, R.drawable.souleater,R.drawable.hunterxhunter,R.drawable.assassinationclassroom,R.drawable.totoro,R.drawable.oliveetom,R.drawable.saintseiya,R.drawable.thepromisedneverland,R.drawable.evangelion,R.drawable.fullmetalalchimistintro,R.drawable.bluebirdnaruto,R.drawable.demonslayer,R.drawable.foodwars,R.drawable.swordartonline,R.drawable.sasageyo,R.drawable.deathnote,R.drawable.jujutsukaisenending};
        super.after();
        return view;
    }
}

