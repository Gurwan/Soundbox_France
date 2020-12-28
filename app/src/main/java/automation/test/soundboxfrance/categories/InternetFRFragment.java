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

public class InternetFRFragment extends SuperFragment {

    public InternetFRFragment(MemeActivity mainActivity) {
        super(mainActivity);
    }

    public InternetFRFragment(){}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.before(inflater,container);
        super.nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesInternetFrancais));
        super.soundID = new Integer[]{R.raw.turbin,R.raw.marine,R.raw.solange,R.raw.ouaismoicestserrefion,R.raw.boobache,R.raw.michel,R.raw.appelerhendek,R.raw.sylvaindurifallu,R.raw.jonathan,R.raw.draa,R.raw.zbeub,R.raw.sprite,R.raw.tequilaheineken,R.raw.mamadousegpa,R.raw.nils,R.raw.chiedansculotte,R.raw.baptiste,R.raw.lopez,R.raw.bravovousetessurinternet,R.raw.pioupiou,R.raw.kalashkalash,R.raw.onvaniquercesoir,R.raw.molletblinde,R.raw.jeanmidu13, R.raw.tuesmoche,R.raw.mangeletonptndepain, R.raw.etiennebolideur,R.raw.grigny,R.raw.winnielourson,R.raw.ohputain, R.raw.nadinemouk,R.raw.desnozeur,R.raw.nomdedieulecanape,R.raw.queuedebillard,R.raw.chatteapoil,R.raw.bolosseva,R.raw.cestfaciledetriquiter,R.raw.mdrrosidu27,R.raw.ruedespotiers,R.raw.kaarisnrv,R.raw.musulmanglace, R.raw.castagnepalier,R.raw.caillou_dur,R.raw.asilequandtuveux,R.raw.jvaisfaireundab,R.raw.tuvasbienjimmy,R.raw.arretedrogue,R.raw.karimmort,R.raw.cucurbitacee,R.raw.elleestoulacarte,R.raw.fermetagueulejolopez,R.raw.jaimelesbiscuits,R.raw.ilmepiquaitlazezette,R.raw.michelforever,R.raw.rendpasfou,R.raw.demanderpardon,R.raw.isabellecommunique,R.raw.jaimebienlesfrites,R.raw.cestrigolohein,R.raw.coupdequeue, R.raw.maisconnard, R.raw.dechainermoi,R.raw.tuesbeteouquoi,R.raw.jusdorange,R.raw.ohjailedroitdevivre,R.raw.menacedehackeur,R.raw.jaimisdumiel,R.raw.nancestpasvrai,R.raw.painraisin,R.raw.petitponey,R.raw.jaidestasdefiances,R.raw.unfouchantesousladouche,R.raw.baiserlachevre,R.raw.jaiunpetitzizi,R.raw.parodiegot,R.raw.zolaavaitditjaccuse,R.raw.dedicaceapersonne,R.raw.messagetg,R.raw.laphotofdp,R.raw.jadorelenutella,R.raw.maislaissemoidormir,R.raw.jaidisnon,R.raw.coucoutuveuxvoirmabite,R.raw.tesqunpetitpd,R.raw.kalashducongo,R.raw.jsuispapegeek,R.raw.charleroi,R.raw.tessale,R.raw.wouahquestquecest,R.raw.jeconnaisdesgrosfdp, R.raw.lachance,R.raw.bonsoircavabien,R.raw.clapclapcestlebruitdemesboules,R.raw.romainmohamedhenni,R.raw.billgatesoutonyoutube,R.raw.jevaisbouffertaculotteyahzebi,R.raw.omiseredemisere,R.raw.salutjemappelleahmed,R.raw.tetaisencoredansles,R.raw.cridedouleur,R.raw.cestreparticommeenquarantesix,R.raw.onattendladatelheure,R.raw.tumasbienkhalass,R.raw.valeregermainjattendslheurelejourlanuit,R.raw.tienstienstiens,R.raw.dansmatetequarantedeux,R.raw.ilsmontdittesou,R.raw.tumens,R.raw.ahki,R.raw.allezvatefairefoutre,R.raw.moijsuisquelquunjadorelerisque,R.raw.ondiraitquecestdesvraisfreres,R.raw.quivoilaje,R.raw.tecoutecatoi,R.raw.tesunmecbizarretoi,R.raw.yapasdepanneaux,R.raw.ehbonjour,R.raw.imafuckingstar,R.raw.jsuisfatiguemgl,R.raw.tespasdroletufaismemepasrire,R.raw.volernestpasbon,R.raw.clemondequiestalenvers,R.raw.toicestquoitonprobleme,R.raw.tucroisquecestdurespect,R.raw.bannezmoica,R.raw.cestmoiwesh,R.raw.frappemoijetempoisonne,R.raw.subhanallahlapuissance,R.raw.tespd,R.raw.tuprefereslechocolat,R.raw.uho,R.raw.ehgrosreveilletoiicicestlescitesdefrancenarvalo,R.raw.jsuisspidermanfdp,R.raw.lacostetn,R.raw.ohpureedepommedeterre,R.raw.onvaallerluicasserlescouillestuconnai,R.raw.pumpitup,R.raw.moijepenselaquestionelleestviterepondue,R.raw.situmeurscetaitecrit,R.raw.tagrandmereellemangedesgn,R.raw.attentiongrenade,R.raw.dehors,R.raw.huitmortssixblesses,R.raw.jaimebienla,R.raw.jetedemandepardon,R.raw.netinquietespas,R.raw.prendpastroplaconfianceredescend,R.raw.touchepasamabagnole};
        super.soundImage = new Integer[]{R.drawable.heureusementquiyaencoreduturbin,R.drawable.hemarine,R.drawable.jefaislamouraveclesrivieres,R.drawable.ouaismoicestserrefion,R.drawable.jenecomprendpas,R.drawable.lachemoimichel,R.drawable.appelerleshendeks,R.drawable.unehallucination,R.drawable.questquiestjaune,R.drawable.draaa,R.drawable.zbeubzbeub,R.drawable.vosdaronnesellesboiventdusprite,R.drawable.tequilaheineken,R.drawable.cordeasauter,R.drawable.ahbahcestbiennils,R.drawable.tutechiesdanslaculotte,R.drawable.maissijesuistresnet,R.drawable.lesangdetesmorts,R.drawable.bravovousetessurinternet,R.drawable.monpioupiouilestmort,R.drawable.kalashkalash,R.drawable.onvaniquercesoir,R.drawable.monmolletilestblinde,R.drawable.okcestjeanmidutreize,R.drawable.tuesmoche,R.drawable.mangeletonputaindepain,R.drawable.capousse,R.drawable.grignylagrandeborne,R.drawable.tousmesamisontunequeue,R.drawable.ohputain,R.drawable.nardinemouk,R.drawable.avecmondeznoseur,R.drawable.nomdedieulecanape,R.drawable.avecunequeuedebillard,R.drawable.ohchatteapoil,R.drawable.bolosseva,R.drawable.cestfaciledetriquiter,R.drawable.mdrmdr,R.drawable.ruedespotiers,R.drawable.jevaistebrisertesos,R.drawable.coucoulesmusulmans,R.drawable.onsestcastagnesurlepalier,R.drawable.jairamasseuncaillou,R.drawable.jemenbatslessteaks,R.drawable.jvaisfaireundab,R.drawable.tuvasbien,R.drawable.arreteladrogue,R.drawable.tesunhommemortkarim,R.drawable.astudejavumoncul,R.drawable.elleestoulacarte,R.drawable.fermetagueule,R.drawable.jaimelesbiscuits,R.drawable.ilmepiquaitlazezette,R.drawable.ouicestmoi,R.drawable.rendpasfou,R.drawable.demanderpardonpourquoi,R.drawable.isabellecommunique,R.drawable.jaimebienlesfrites,R.drawable.cestrigolohein,R.drawable.jeluidonnedescoupsdequeue,R.drawable.maisconnard,R.drawable.jesuisdechainemoi,R.drawable.tuesbeteouquoi,R.drawable.jusdorange,R.drawable.jailedroitdevivre,R.drawable.menacedunhackeur,R.drawable.jaimisdumiel,R.drawable.noncestpasvrai,R.drawable.monpainauraisin,R.drawable.petitponey,R.drawable.jaidestasdefiances,R.drawable.unfouchantesousladouche,R.drawable.jaibaiseunechevre,R.drawable.jaiunpetitzizi,R.drawable.telerealitegot,R.drawable.zolaavaitditjaccuse,R.drawable.dedicaceapersonne,R.drawable.messagetg,R.drawable.laphotofdp,R.drawable.jadorelenutella,R.drawable.maislaissemoidormir,R.drawable.jaidisnon,R.drawable.coucoutuveuxvoirmabite,R.drawable.tesquunpetitpd,R.drawable.kalashducongo,R.drawable.jsuispapegeek,R.drawable.tribunalcharleroi,R.drawable.tessale,R.drawable.whouahmaisquestquecest,R.drawable.jconnaisdesgrosfdpcommetoi,R.drawable.lachance,R.drawable.bonsoircavabien,R.drawable.jgrattejgratte,R.drawable.romaiiin,R.drawable.billgatesoutonyoutube,R.drawable.jvaisbouffertakilotte,R.drawable.ohmiseredemisere,R.drawable.salutjmappelleahmed,R.drawable.tetaisencoredansles,R.drawable.cridedouleur,R.drawable.cestreparticommeenquarantesix,R.drawable.onattendladatelheure,R.drawable.tumasbienkhalass,R.drawable.valeregermainjattendlheure,R.drawable.tienstienstiens,R.drawable.dansmatetequanrantedeux,R.drawable.ilsmontdittesou,R.drawable.tumens,R.drawable.ahki,R.drawable.allezvatefairefoutre,R.drawable.moijsuisquelquunjadorelerisque,R.drawable.ondiraitquecestdesvraisfreres,R.drawable.quivoilaje,R.drawable.tecoutecatoi,R.drawable.tesunmecbizarretoi,R.drawable.yapasdepanneau,R.drawable.hebonjour,R.drawable.imafuckingstar,R.drawable.jesuisfatiguemagueule,R.drawable.tespasdroletufaismemepasrire,R.drawable.volernestpasbon,R.drawable.estcequelemondeestalenvers,R.drawable.toicestquoitonprobleme,R.drawable.tucroisquecestdurespect,R.drawable.bannezmoica,R.drawable.cestmoiwesh,R.drawable.frappemoijetempoisonne,R.drawable.subhanallahlapuissance,R.drawable.tespd,R.drawable.tuprefereslechocolatou,R.drawable.uho,R.drawable.citedefrancenarvalo,R.drawable.jsuisspidermanfdp,R.drawable.lacostetn,R.drawable.ohpureedepommedeterre,R.drawable.onvaallerluicasserlescouilles,R.drawable.pumpitup,R.drawable.questionviterepondue,R.drawable.situmeurscetaitecrit,R.drawable.tagrandmereellemangedesgnocci,R.drawable.attentiongrenade,R.drawable.dehors,R.drawable.huitmortssixblesses,R.drawable.jaimebien,R.drawable.jetedemandepardon,R.drawable.netinquietespas,R.drawable.prendpastroplaconfianceredescends,R.drawable.touchepasamabagnole};
        super.after();
        return view;
    }
}
