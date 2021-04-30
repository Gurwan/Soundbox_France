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

public class MusicFilmsFragment extends SuperFragment {

    public MusicFilmsFragment(FilmsTVActivity mainActivity) {
        super(mainActivity);
    }

    public MusicFilmsFragment(){}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.before(inflater,container);
        super.nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesFilmsMusic));
        super.soundID = new Integer[]{R.raw.generiqueavengers,R.raw.deadpoolsong,R.raw.flutetitanic,R.raw.musiqueseptiemecompagnie,R.raw.hpthemeearrape,R.raw.retourverslefutur,R.raw.jurassicpark,R.raw.titanicmusiqu,R.raw.starwarsgenerique,R.raw.ghostbuster,R.raw.legendarme,R.raw.spidermanhomecoming,R.raw.lexorsistetheme,R.raw.missionimpossible,R.raw.shiningmusique,R.raw.musiquepulpfiction,R.raw.mickeymousesong,R.raw.rocky,R.raw.rockytrois,R.raw.halloweentheme,R.raw.listeschindler,R.raw.piratesdescaraibesmusique,R.raw.avengersinfinitywars,R.raw.fantomas,R.raw.lesbronzesfontduski,R.raw.taxi,R.raw.harrypottersong,R.raw.readyplayerone};
        super.soundImage = new Integer[]{R.drawable.avengers,R.drawable.deadpool,R.drawable.titanicflute,R.drawable.laseptiemecompagnie,R.drawable.harrypotter,R.drawable.retourverslefutur,R.drawable.jurrasicpark,R.drawable.titanic,R.drawable.starwars,R.drawable.ghostbuster,R.drawable.lesgendarmes,R.drawable.spiderman,R.drawable.exorciste,R.drawable.missionimpossible,R.drawable.shining,R.drawable.pulpfiction,R.drawable.fullmetaljacket,R.drawable.rocky,R.drawable.rockytrois,R.drawable.halloween,R.drawable.listeschindler,R.drawable.piratesdescaraibesmusique,R.drawable.avengersinfinitywars,R.drawable.fantomas,R.drawable.lesbronzesfontduski,R.drawable.taxi,R.drawable.harrypottersong,R.drawable.readyplayerone};
        super.after();
        return view;
    }
}
