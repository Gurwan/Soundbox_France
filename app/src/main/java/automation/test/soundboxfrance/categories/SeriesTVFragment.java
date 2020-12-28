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

public class SeriesTVFragment extends SuperFragment {

    public SeriesTVFragment(TVActivity mainActivity) {
        super(mainActivity);
    }

    public SeriesTVFragment(){}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.before(inflater,container);
        super.nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesSeries));
        super.soundID = new Integer[]{R.raw.killiantplm,R.raw.saymyname,R.raw.ttlemondesenbranle,R.raw.bazinga,R.raw.jouerguerresalsifi,R.raw.calmezvous,R.raw.fantasticdocteurwho,R.raw.allonsyalonso,R.raw.noooo,R.raw.exterminerdocteurwho,R.raw.ouaiscestpasfaux,R.raw.easypeasynegan,R.raw.surprisemotherfucker,R.raw.avecesarprout,R.raw.ohnonono,R.raw.onenagroskaamelot,R.raw.lasalope,R.raw.deweypoupipoupi,R.raw.whowantstobeking,R.raw.salutcesthannah,R.raw.toituviestoituvies,R.raw.insultedonselfprisonbreak,R.raw.sortezvouslesdoigtsducul,R.raw.euhnon,R.raw.yugonpleisteodon,R.raw.mameremaditunjour,R.raw.enfinbref,R.raw.challengeaccepted,R.raw.fautpasrespirerlacompote};
        super.soundImage = new Integer[]{R.drawable.riredemoniaque,R.drawable.saymyname,R.drawable.toutlemondesenbranle,R.drawable.bazinga,R.drawable.jouerguerresalsifi,R.drawable.calmezvouscalmezvous,R.drawable.fantastic,R.drawable.allonsyalonso,R.drawable.nopleaseno,R.drawable.extermine,R.drawable.ouaiscestpasfaux,R.drawable.easypeasylemonsqueezy,R.drawable.surprisemotherfucker,R.drawable.avecesar,R.drawable.ohnonono,R.drawable.onenagros,R.drawable.lasalope,R.drawable.poupipoupi,R.drawable.whowantstobeking,R.drawable.salutcesthannah,R.drawable.toituvistoituvistoitucreves,R.drawable.insultededonself,R.drawable.sortezvouslesdoigtsducul,R.drawable.euhnon,R.drawable.yogonpleisteodon,R.drawable.mameremaditunjour,R.drawable.enfinbref,R.drawable.challengeaccepted,R.drawable.fautpasrespirerlacompote};
        super.after();
        return view;
    }
}