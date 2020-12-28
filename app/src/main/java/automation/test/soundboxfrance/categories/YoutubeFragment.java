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

public class YoutubeFragment extends SuperFragment {

    public YoutubeFragment(MemeActivity mainActivity) {
        super(mainActivity);
    }

    public YoutubeFragment(){}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.before(inflater,container);
        super.nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesYoutubeVieux));
        super.soundID = new Integer[]{R.raw.thekairi1,R.raw.bob_lennon_haha,R.raw.siphano,R.raw.davidlafarge,R.raw.tesparano,R.raw.ramadan_la,R.raw.slt_lasalle,R.raw.coucoumiss,R.raw.starfoulah,R.raw.biflette,R.raw.chavais,R.raw.francais,R.raw.dinosaure,R.raw.russie,R.raw.mohamedhenni,R.raw.quenouille,R.raw.rhinoshield,R.raw.macouille,R.raw.trasheurs,R.raw.yo_squeezie,R.raw.johnnycrying,R.raw.tagueulemaman,R.raw.qide143,R.raw.unpetitjeuamixem,R.raw.nonamixem,R.raw.mushway,R.raw.kennypoisson,R.raw.tocabricot,R.raw.tagueuleptnfanta,R.raw.poceblo,R.raw.gotagatk,R.raw.laissezmoilebuildfight,R.raw.chaussettesjdg,R.raw.bienevidemment,R.raw.weshwesh,R.raw.lalalatk,R.raw.penisyaourt,R.raw.comportementdarabe,R.raw.grosdegueulasse,R.raw.ourspolaire,R.raw.paradisrubis,R.raw.fromageblanc,R.raw.moustiquepronostic,R.raw.ouifrodon,R.raw.damntiboinshape,R.raw.chequesiphano,R.raw.paulokkyu,R.raw.onyvasuper,R.raw.jailedemon,R.raw.moicestbertrand,R.raw.xavierpontte,R.raw.cestpolo,R.raw.bonsoirmcflycarlito,R.raw.guitarezimbabwe,R.raw.cavalekenny,R.raw.parcequecestcoollamort,R.raw.douknowdaway,R.raw.littleredshit,R.raw.ohcequilapris,R.raw.bonjourjeremstar,R.raw.papierbulleamixem,R.raw.etcacestpasreglo,R.raw.ouvretagueuletk,R.raw.cassetoi,R.raw.wtcpsycopathes,R.raw.tesnulmohammedhenni,R.raw.unecartegoogleplay,R.raw.sltatouscestpaulok,R.raw.maisvoilamaiscetaitsur,R.raw.lapuipuissance,R.raw.clubjdg,R.raw.woopgang,R.raw.rapvsrealite,R.raw.mashallahlegenie,R.raw.filsdepioutetk,R.raw.clapbonjour,R.raw.jesucetoutleszboubs,R.raw.lejoueurfrancais,R.raw.ptdrtki,R.raw.tobogland,R.raw.introgotata,R.raw.plusunetuerieunmassacre,R.raw.mozartlecharo,R.raw.pastrestresgentil,R.raw.demandedamitk,R.raw.bahouaislogique,R.raw.maiscesvoituressontnuls,R.raw.fermezvosputaindegueule,R.raw.cheh,R.raw.riredeporto,R.raw.babapourquoi,R.raw.cacetaitgratuit,R.raw.jepeuxpas,R.raw.japonjdg,R.raw.joueurdugrenierintro,R.raw.yolerap,R.raw.adoubilahminsheytan,R.raw.alertepsycopathe,R.raw.catapultetesmorts,R.raw.concombre,R.raw.jtauraivioler,R.raw.maisouiptnbiensurenfin,R.raw.allezgigiallezrourou,R.raw.doubletoz,R.raw.jamaisjenetoublierai,R.raw.robertotupreferes,R.raw.hesstotal,R.raw.jechiealagueuledorelsan,R.raw.pompemoildard,R.raw.primokyogre,R.raw.gotikmohamedhenni,R.raw.intrololywood,R.raw.lisala2000,R.raw.mangemonpaineren,R.raw.papaourstk,R.raw.ausecours,R.raw.bonsoirparis,R.raw.helloatouscguep,R.raw.laps4danslachatatamere,R.raw.jemappellepierre,R.raw.jesuus,R.raw.cetaitlablaguenulledujour,R.raw.internetnet,R.raw.jadorelezboub,R.raw.jebranlelalampe,R.raw.lagrosseroue,R.raw.maissincerementquoi,R.raw.mamerepardon,R.raw.tagueuleleskassos,R.raw.mathoxdiamant,R.raw.jaiunedescesenvies,R.raw.ouaismaiscestpastoiquidecide,R.raw.tuvavoirquijesuis,R.raw.vouslepayerezpourca,R.raw.dislikedislike,R.raw.palalalalaoneil,R.raw.claclac,R.raw.jetebloque,R.raw.montagneesttropfort,R.raw.maisvayptn,R.raw.champagneytb,R.raw.fullflemme,R.raw.pourquoijeparleaveceux};
        super.soundImage = new Integer[]{R.drawable.filsdeputemalumiere,R.drawable.bonsoirjesuisboblennon,R.drawable.jenairienafoutre,R.drawable.salutatouslesamis,R.drawable.tesparanotoi,R.drawable.latesentraindefaireleramadan,R.drawable.salutatouscestlasalle,R.drawable.coucoumissjirachi,R.drawable.starfoulahthekairi,R.drawable.biflette,R.drawable.chavaischavais,R.drawable.alorsilssontfrancais,R.drawable.vosmerescestdesdinosaures,R.drawable.cestnormalenrussie,R.drawable.vosgrandmereslesdragons,R.drawable.astuvulesquenouilles,R.drawable.rhinoshield,R.drawable.introwankil,R.drawable.yolestrasheurs,R.drawable.yotoutlemondecestsqueezie,R.drawable.jedetruistonvagin,R.drawable.tagueulemaman,R.drawable.qide143,R.drawable.jouonstousensembleaunpetitjeu,R.drawable.nonarretezdemefaireca,R.drawable.arretedecritiquertoitesqui,R.drawable.maispourquoitumangessousleau,R.drawable.ettoclabricot,R.drawable.tagueuleputain,R.drawable.poceblo,R.drawable.introgotagastreet,R.drawable.laissezmoilebuildfight,R.drawable.jesuispartiellementfoufou,R.drawable.bienevidemment,R.drawable.weshweshlesamis,R.drawable.lalala,R.drawable.jaimemettremonpenisdans,R.drawable.comportementdarabe,R.drawable.grosdegeulasse,R.drawable.jaimeslesourspolaires,R.drawable.paradisderubis,R.drawable.fromageblanc,R.drawable.vosgrandmereslesmoustiques,R.drawable.ouiantoinedaniel,R.drawable.damnlesgens,R.drawable.jaitouchelecheque,R.drawable.pauloketkyu,R.drawable.onyvasuper,R.drawable.jailedemon,R.drawable.moicestbertrand,R.drawable.xavierpontte,R.drawable.salutbonsoircestpolo,R.drawable.bonsoirmcflyetcarlito,R.drawable.tonperefabriquedesguitares,R.drawable.cavalekenny,R.drawable.jaienviedemesuicidercarcestcoollamort,R.drawable.doyouknowdawae,R.drawable.littleredshit,R.drawable.ohcequilapritgotaga,R.drawable.bonjouratoutesles,R.drawable.papierbulle,R.drawable.etcacestpasreglo,R.drawable.ouvretagueule,R.drawable.cassetoiaquituveuxmentir,R.drawable.wtcpsycopathes,R.drawable.tesnul,R.drawable.unecartegoogleplay,R.drawable.salutatouslesamiscestpaulok,R.drawable.maisvoilamaiscetaitsur,R.drawable.lapuipuissance,R.drawable.clubjdg,R.drawable.lewoopgang,R.drawable.tousleskilossontdanslauto,R.drawable.mashallahlegenie,R.drawable.filsdepioute,R.drawable.clapbonjour,R.drawable.jesucetousleszboub,R.drawable.lejoueurfrancais,R.drawable.ptdrtki,R.drawable.letobogland,R.drawable.introgotaga,R.drawable.cenestplusunetuerie,R.drawable.mozartlecharo,R.drawable.pastrestresgentil,R.drawable.nousavonsunedemandedami,R.drawable.bahouaislogique,R.drawable.maiscesvoituressontnulles,R.drawable.fermezvosputaindegueule,R.drawable.cheh,R.drawable.riredeporto,R.drawable.babapourquoitufaisca,R.drawable.cacetaitgratuit,R.drawable.jepeuxpas,R.drawable.japonjdg,R.drawable.introjdg,R.drawable.yolerap,R.drawable.audhubillahmin,R.drawable.alertepsycopathe,R.drawable.catapultetesmorts,R.drawable.concombre,R.drawable.jtauraiviole,R.drawable.maisouiputainmaisbiensur,R.drawable.allezgigiallezrourou,R.drawable.doubletoz,R.drawable.jamaisjenetoublierai,R.drawable.robertotupreferes,R.drawable.cestlahesstotal,R.drawable.jechiealagueuledorelsan,R.drawable.pompemoiledard,R.drawable.primokyogre,R.drawable.cemecestunl,R.drawable.intrololywood,R.drawable.lisala2000,R.drawable.mangemonpaineren,R.drawable.cestlhistoiredupapaours,R.drawable.ausecours,R.drawable.bonsoirparis,R.drawable.helloatouscestguep,R.drawable.lapsquatredansla,R.drawable.jemappellepierre,R.drawable.jesuuus,R.drawable.cetaitlablaguenulledujour,R.drawable.internethugoposay,R.drawable.jadorelezboub,R.drawable.jebranlelalampe,R.drawable.lagrosseroue,R.drawable.maissincerementquoi,R.drawable.mamerepardon,R.drawable.tagueuleleskassos,R.drawable.ilveutmesdiamants,R.drawable.jaiundecesenviesdemangeruncassoulet,R.drawable.ouaismaiscestpastoiquidecide,R.drawable.tuvasvoirquijesuis,R.drawable.vouslepayerezpourca,R.drawable.dislike,R.drawable.palalalaoneil,R.drawable.clacclac,R.drawable.jetebloque,R.drawable.montagneesttropfort,R.drawable.maisvayptn,R.drawable.champagneytb,R.drawable.fullflemme,R.drawable.pourquoijeparleaveceux};
        super.after();
        return view;
    }
}
