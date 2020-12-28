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

public class TVFragment extends SuperFragment {

    public TVFragment(TVActivity mainActivity) {
        super(mainActivity);
    }

    public TVFragment(){}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        super.before(inflater,container);
        super.nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesTV));
        super.soundID = new Integer[]{R.raw.ah,R.raw.dessert,R.raw.taisezvous,R.raw.guillaume,R.raw.clamernoire,R.raw.lepers,R.raw.jailedroit,R.raw.cafard,R.raw.jcvd,R.raw.souffrir,R.raw.alainsoral,R.raw.liederprice,R.raw.contrenature,R.raw.prout,R.raw.eddymalou,R.raw.drame,R.raw.menuwhopper,R.raw.decadence,R.raw.maisilestmusulman,R.raw.jawad,R.raw.livreardisson,R.raw.rirehanouna,R.raw.congolexicomatisation,R.raw.momomotus,R.raw.monsac,R.raw.soralcalme,R.raw.tesunmaladebernard,R.raw.jeveuxfairelamour,R.raw.boomboommalabar,R.raw.tressale,R.raw.bonjournagui,R.raw.chonteux,R.raw.macherie,R.raw.heyouijamy,R.raw.couillesfrere,R.raw.cetaitvrmtinteressant,R.raw.freddyfreddo,R.raw.boulemagique,R.raw.guillonbaisefemme,R.raw.tuesgrossemelissandre,R.raw.vousetesvrmtdegueulassepaul,R.raw.jvaistetrangler,R.raw.spermjamy,R.raw.ilsontfaitpipidansvotretete,R.raw.ilsontuntoutpetitpenis,R.raw.jaijamaistoucheamesfilles,R.raw.mercimrleprofesseur,R.raw.meteoguili,R.raw.ilfautpasconfondreidentitedegenre,R.raw.jenesuispasunhomme,R.raw.maiscestdelamerde,R.raw.arretezcasuffit,R.raw.nousnousreverrons,R.raw.salutmonpote,R.raw.tamereellesucedesours,R.raw.guignol,R.raw.cestlapetee,R.raw.mimicracra,R.raw.ohunebouledeneige,R.raw.boulenoiremotus,R.raw.insultesrenemalleville,R.raw.yalemecamilla,R.raw.tudegagessinonjetencolleune,R.raw.avantjeleslaveque,R.raw.ilaprisuneligue2,R.raw.antimoinsdedix,R.raw.jesuispamela,R.raw.ohmerdeohcestconca,R.raw.cestbieneleonore,R.raw.cestnon,R.raw.cestquilepatroncestmoi,R.raw.marinapasses,R.raw.quellepertedetempsquellepertedenergie,R.raw.tailletailletaille,R.raw.veroniquefaituninfarctus};
        super.soundImage = new Integer[]{R.drawable.ah,R.drawable.ledessert,R.drawable.taisezvous,R.drawable.aiecoupdurpourguillaume,R.drawable.cestlamernoire,R.drawable.ouiouiahoui,R.drawable.maisbordeljailedroit,R.drawable.caaafard,R.drawable.unplusun,R.drawable.jesuispasvenueicipoursouffrir,R.drawable.lesgensenontpleinlecul,R.drawable.lespatronsdeleaderprice,R.drawable.cestcontrenature,R.drawable.jlaientendufaireprout,R.drawable.maisouicestclair,R.drawable.etlacestledrame,R.drawable.aumoinsunmenuwhopper,R.drawable.olalacestladecadence,R.drawable.maisilestmusulman,R.drawable.jairenduservice,R.drawable.votrelivresappelletournelapage,R.drawable.hanounarire,R.drawable.lacongolexicomatisation,R.drawable.momomotus,R.drawable.monsacestfait,R.drawable.commenceparmeparler,R.drawable.unmaladebernard,R.drawable.maismoijveuxfairelamour,R.drawable.boumboummalabar,R.drawable.trestressale,R.drawable.bonjourbonjournagui,R.drawable.cesthonteux,R.drawable.macheriemacherie,R.drawable.heyjamy,R.drawable.baslescouillesfrere,R.drawable.cetaittresinteressant,R.drawable.freddyfreddo,R.drawable.laboulemagique,R.drawable.guillonjaibaisesafemme,R.drawable.tuesgrossemelissandre,R.drawable.vousetesvraimentdegueulasse,R.drawable.jvaistetrangler,R.drawable.ilestsupertonspermatoizoide,R.drawable.ilsontfaitpipidansvotretete,R.drawable.ilsontuntoutpetitpenis,R.drawable.jaijamaistoucheamesfilles,R.drawable.mercimonsieurleprofesseur,R.drawable.voicilameteodegulli,R.drawable.identitedegenreetexpressiondegenre,R.drawable.jenesuispasunhomme,R.drawable.maiscestdelamerde,R.drawable.arretezcasuffit,R.drawable.nousnousreverrons,R.drawable.salutmonpote,R.drawable.tamereellesucedesours,R.drawable.guignol,R.drawable.cestlapetee,R.drawable.mimicracra,R.drawable.ohunebouledeneige,R.drawable.boulenoiremotus,R.drawable.insultesrenemalleville,R.drawable.yalemecamilla,R.drawable.tudegagessijtencolleune,R.drawable.avantjelavaisavecdeleau,R.drawable.ilaprisuneligue2,R.drawable.antimoinsdedix,R.drawable.jesuispamela,R.drawable.ohmerdeohcestconca,R.drawable.cestbieneleonore,R.drawable.cestnon,R.drawable.cestquilepatron,R.drawable.marinapasse,R.drawable.quellepertedetempsquellepertedenergie,R.drawable.tailletailletaille,R.drawable.veroniquefaituninfarctus};
        super.after();
        return view;
    }
}