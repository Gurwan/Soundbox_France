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

public class GenericAutresFragment extends SuperFragment {

    public GenericAutresFragment(GeneriquesActivity mainActivity) {
        super(mainActivity);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.before(inflater,container);
        super.nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesGeneriquesAutres));
        super.soundID = new Integer[]{R.raw.tplm,R.raw.kohlanta,R.raw.thevoicegenerique,R.raw.cestpassorcier,R.raw.generiqueinterville,R.raw.quiveutgagnerdesmillions};
        super.soundImage = new Integer[]{R.drawable.toutpourlemuscle,R.drawable.kohlanta,R.drawable.thevoice,R.drawable.cestpassorcier,R.drawable.interville,R.drawable.quiveutgagnerdesmillions};
        super.after();
        return view;
    }
}