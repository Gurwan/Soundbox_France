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

public class MusicAutreFragment extends SuperFragment {

    public MusicAutreFragment(MusiqueRapAutres mainActivity) {
        super(mainActivity);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.before(inflater,container);
        super.nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesMusiqueAutres));
        super.soundID = new Integer[]{R.raw.dominiquenique,R.raw.grosnichons,R.raw.jackyta4l,R.raw.epicsaxguy,R.raw.evilmortysong,R.raw.mamadouavaitmal,R.raw.initialddejavu,R.raw.hallelujah,R.raw.dominodominette,R.raw.froliccurbyourenthousiasm,R.raw.howardthealien,R.raw.keyboardcat,R.raw.chantdeloignon,R.raw.chantdeloignonsuite,R.raw.brainpower,R.raw.sovietdancehardbass,R.raw.letsgo,R.raw.odetojoy,R.raw.pedobearsong,R.raw.nyancat,R.raw.tostestas};
        super.soundImage = new Integer[]{R.drawable.dominiquenique,R.drawable.vivelesgrosnichons,R.drawable.jacky,R.drawable.epicsaxguy,R.drawable.evilmorty,R.drawable.mamadou,R.drawable.dejavu,R.drawable.hallelujah,R.drawable.freredomino,R.drawable.frolic,R.drawable.howardthealien,R.drawable.keyboardcat,R.drawable.chantoignon,R.drawable.refrainchantoignon,R.drawable.brainpower,R.drawable.sovietdance,R.drawable.letsgo,R.drawable.odetojoy,R.drawable.pedobearsong,R.drawable.nyancat,R.drawable.musiquesatanique};
        super.after();
        return view;
    }
}
