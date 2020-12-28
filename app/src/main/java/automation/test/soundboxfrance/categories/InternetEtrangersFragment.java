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

public class  InternetEtrangersFragment extends SuperFragment {

    public InternetEtrangersFragment(MemeActivity mainActivity) {
        super(mainActivity);
    }

    public InternetEtrangersFragment(){}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.before(inflater,container);
        super.nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesInternetEtrangers));
        super.soundID = new Integer[]{R.raw.issou,R.raw.damndaniel,R.raw.hamburger,R.raw.wow,R.raw.ouiiii,R.raw.bitchtourette,R.raw.touchesensibilite,R.raw.grosfront,R.raw.yeah,R.raw.ohsupahotfire,R.raw.clicnice,R.raw.ougaaga,R.raw.hefuckedup,R.raw.fuckinggenius,R.raw.lookatthisdude,R.raw.hiokay,R.raw.ohyeahmrcrab,R.raw.aa,R.raw.heheboy,R.raw.ahhh,R.raw.lachancla,R.raw.whatmeme,R.raw.yatangaki,R.raw.coolguy,R.raw.skadooskadae,R.raw.ohmygodmeme,R.raw.onagagne,R.raw.whyareyourunning,R.raw.andiholyshit,R.raw.ohfuckicantbelieveyouvedonethis,R.raw.bruh,R.raw.justdoit,R.raw.run,R.raw.youvegotmail,R.raw.wtfboom,R.raw.bitconnect,R.raw.fbiopenup,R.raw.stonks,R.raw.poutinewalking,R.raw.thatalotofdamage,R.raw.voilabonokbyebye,R.raw.whoisthatpokemon,R.raw.yeet};
        super.soundImage = new Integer[]{R.drawable.issou,R.drawable.damndaniel,R.drawable.hamburger,R.drawable.wow,R.drawable.ouiiiiiiiescargo,R.drawable.bitchiloveyou,R.drawable.tutouchesamasensibilite,R.drawable.tunespasqualifieepour,R.drawable.yeah,R.drawable.ohsupahotfire,R.drawable.nice,R.drawable.ougaagapipicaca,R.drawable.anditsatthismoment,R.drawable.fuckinggenius,R.drawable.lookatthisdude,R.drawable.hiokay,R.drawable.ohyeahmrcrab,R.drawable.aa,R.drawable.heheboy,R.drawable.ahhhh,R.drawable.lachancla,R.drawable.what,R.drawable.yatangaki,R.drawable.coolguy,R.drawable.skadooskadae,R.drawable.ohmygod,R.drawable.onagagne,R.drawable.whyareyourunning,R.drawable.andiholy,R.drawable.ohfuckicantbelieve,R.drawable.bruh,R.drawable.justdoit,R.drawable.run,R.drawable.youvegotamail,R.drawable.wtfboom,R.drawable.bitconnect,R.drawable.fbiopenup,R.drawable.stonks,R.drawable.poutinewalking,R.drawable.thatalotofdamage,R.drawable.voilabonokbyebye,R.drawable.whoisthatpokemon,R.drawable.yeet};
        super.after();
        return view;

    }
}
