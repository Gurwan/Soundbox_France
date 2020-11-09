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

public class MusicGamingFragment extends SuperFragment {

    public MusicGamingFragment(JVActivity mainActivity) {
        super(mainActivity);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.before(inflater,container);
        super.nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesMusiqueGaming));
        super.soundID = new Integer[]{R.raw.musiquemario,R.raw.minecraft,R.raw.fortnite,R.raw.rust,R.raw.dokkanbattle,R.raw.introgta,R.raw.pubg,R.raw.coc,R.raw.tetris,R.raw.wiitheme,R.raw.wiisporttheme,R.raw.themeangrybirds,R.raw.themegtaiv,R.raw.overwatchtheme,R.raw.zeldatheme,R.raw.themegtasanadreas,R.raw.guilethemestreetfighterdeux,R.raw.themehalo,R.raw.clashroyalethelastsecond,R.raw.gtavicecitytheme,R.raw.fromnowhere,R.raw.bigdreamsfifadixneuf,R.raw.diredockssupermario,R.raw.thewitchermaintheme,R.raw.animalcrossingnltheme,R.raw.animalcrossingnwtheme,R.raw.fallguystheme};
        super.soundImage = new Integer[]{R.drawable.mario,R.drawable.minecraft,R.drawable.fortnite,R.drawable.rust,R.drawable.dokkanbattle,R.drawable.gtacinq,R.drawable.pubg,R.drawable.clashofclans,R.drawable.tetris,R.drawable.wii,R.drawable.wiisport,R.drawable.angrybirds,R.drawable.gtaquatre,R.drawable.overwatch,R.drawable.zelda,R.drawable.gtasanandreas,R.drawable.sfguiletheme,R.drawable.halo,R.drawable.clashofclansdeux,R.drawable.vicecity,R.drawable.fifaquatorze,R.drawable.fifadixneuf,R.drawable.supermariosoixantequatre,R.drawable.thewitchertrois,R.drawable.animalcrossingnl,R.drawable.animalcrossingnw,R.drawable.fallguystheme};
        super.after();
        return view;
    }
}