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

public class DisneyFragment extends SuperFragment {

    public DisneyFragment(ThemeActivity mainActivity) {
        super(mainActivity);
    }

    public DisneyFragment(){}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.before(inflater,container);
        super.nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesDisney));
        super.soundID = new Integer[]{R.raw.alafileindienne,R.raw.chansondelapluie,R.raw.ilenfautpeupouretreheureux,R.raw.jemenvais,R.raw.laviedartiste,R.raw.liberedelivre,R.raw.sossociete,R.raw.souslocean,R.raw.toutlemondeveutdeveniruncat,R.raw.supercalifragilisticexpialidocious,R.raw.trahisondisgrace};
        super.soundImage = new Integer[]{R.drawable.alafileindienne,R.drawable.chansondelapluie,R.drawable.ilenfautpeupouretreheureux,R.drawable.jemenvais,R.drawable.laviedartiste,R.drawable.libereedelivre, R.drawable.sossociete,R.drawable.souslocean,R.drawable.toutlemondeveutdeveniruncat,R.drawable.supercalifra,R.drawable.trahisondisgrace};
        super.after();
        return view;
    }
}

