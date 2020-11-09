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

public class Music90Fragment extends SuperFragment {

    public Music90Fragment(MusicFragment mainActivity) {
        super(mainActivity);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.before(inflater,container);
        super.nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesMusique90));
        super.soundID = new Integer[]{R.raw.ameno,R.raw.dametucosita,R.raw.runninginthe90s,R.raw.ibelieveicanfly,R.raw.bluedabedee,R.raw.allstarsmashmouth,R.raw.latribudedana,R.raw.badboys,R.raw.canttouchthis,R.raw.babygotback,R.raw.lamacarena,R.raw.jedanselemia};
        super.soundImage = new Integer[]{R.drawable.ameno,R.drawable.dametucosita,R.drawable.runningintheneufzero,R.drawable.ibelieveicanfly,R.drawable.imblue,R.drawable.allstar,R.drawable.tribudedana,R.drawable.badboyz,R.drawable.canttouchthis,R.drawable.babygotback,R.drawable.macarena,R.drawable.jedanselemia};
        super.after();
        return view;
    }
}
