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

public class PublicitesFragment extends SuperFragment {

    public PublicitesFragment(TVActivity mainActivity) {
        super(mainActivity);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.before(inflater,container);
        super.nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesEvent));
        super.soundID = new Integer[]{R.raw.bmw,R.raw.carglass,R.raw.cic,R.raw.commejaime,R.raw.decathlon,R.raw.generaleoptique,R.raw.groupama,R.raw.journaltf1,R.raw.lapeyreyenapasdeux,R.raw.maaf,R.raw.maif,R.raw.mcdo,R.raw.peugeot,R.raw.points,R.raw.ps3,R.raw.rtl,R.raw.sfr,R.raw.sncf,R.raw.tf1,R.raw.tf1meteo,R.raw.xboxone,R.raw.carte_kiwi,R.raw.troploinmaurice,R.raw.micosesvaginale,R.raw.fuite_urinaire,R.raw.oliviercarglass,R.raw.playmobilenavantleshistoires,R.raw.cacachezpaul,R.raw.trivago,R.raw.jadorerire,R.raw.charal};
        super.soundImage = new Integer[]{R.drawable.bmw,R.drawable.carglas,R.drawable.cic,R.drawable.commejaime,R.drawable.decathlon,R.drawable.generaleoptiqu,R.drawable.groupama,R.drawable.journaltf1,R.drawable.lapeyr,R.drawable.maaf,R.drawable.maif,R.drawable.macdo,R.drawable.peugoet,R.drawable.points,R.drawable.ps3,R.drawable.rtl,R.drawable.sfr,R.drawable.sncf,R.drawable.tf1,R.drawable.meteotf1,R.drawable.xboxone,R.drawable.cartekiwi,R.drawable.tupousseslebouchon,R.drawable.cesontdesmicoses,R.drawable.fuiteurinaire,R.drawable.oliviercarglass,R.drawable.playmobil,R.drawable.jevaisfairecacachezpaul,R.drawable.trivago,R.drawable.jadorerire,R.drawable.charal};
        super.after();
        return view;

    }
}