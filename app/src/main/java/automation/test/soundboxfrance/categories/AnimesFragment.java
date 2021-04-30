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

public class AnimesFragment extends SuperFragment {

    public AnimesFragment(TVActivity mainActivity) {
        super(mainActivity);
    }

    public AnimesFragment(){}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.before(inflater,container);
        super.nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesAnimes));
        super.soundID = new Integer[]{R.raw.nulhomer,R.raw.jojo,R.raw.omae,R.raw.coucou_vegeta,R.raw.alertegogole,R.raw.punaisehomer,R.raw.croissant, R.raw.itsover9000,R.raw.lickmyballs,R.raw.mvoyez,R.raw.achevele,R.raw.ftgflanders,R.raw.picklerick,R.raw.nuquelaire, R.raw.kamehameha,R.raw.bonjoursongohan,R.raw.ilsonttuekenny, R.raw.teleportationdbz,R.raw.heyyeyaaeyaa,R.raw.metamorphosegoldorak,R.raw.dbsmusiquepiano,R.raw.jevousemmerde,R.raw.millestonnerresdebrest,R.raw.rasengan,R.raw.homerespecede,R.raw.wubbalubba, R.raw.jesuisrickornichon,R.raw.themeldeath,R.raw.schezwansauce, R.raw.pikachu,R.raw.minirick,R.raw.finalflash,R.raw.cestlheureduduel,R.raw.sonneriebojackhorseman,R.raw.salutcestmoimrlarbin,R.raw.noussommesderetour, R.raw.mrpeanutbuttersong,R.raw.cestladansederick, R.raw.onvavousfaireschwifter,R.raw.gomugomuno,R.raw.lateamrocketsenvoleversdautrescieux,R.raw.weareonepieceamv, R.raw.zawarudo,R.raw.niconiconi,R.raw.spidercochon,R.raw.ultimatehanzo,R.raw.onvacasserdupd,R.raw.afewmomentlater,R.raw.oneeternitylater,R.raw.sonneriedendenmushi, R.raw.yareyaredaze,R.raw.becauseimbatman,R.raw.ratzsoulevetamere,R.raw.smashmidoriya,R.raw.aurevoirhommedelalune,R.raw.mangekyousharingan,R.raw.mineminemine, R.raw.sulligemissement,R.raw.getbackinthekitchen,R.raw.tuveuxquonseladonne,R.raw.dabcarlos,R.raw.jojosbizarreadventure,R.raw.amaterasu,R.raw.kagebunshinnojutsu, R.raw.narutosasukescreaming,R.raw.rasenshuriken,R.raw.endingonepunchman,R.raw.ohmincechipper,R.raw.satesatesate,R.raw.sonnerietotallyspies,R.raw.clonenaruto,R.raw.jereveoutuviensdeposertapechesurmonbureau,R.raw.jesuisspecial,R.raw.ohcacestpastresgentil,R.raw.skiner,R.raw.elimination,R.raw.fraulein,R.raw.objection,R.raw.cadeaudemoiamoi,R.raw.cridingo,R.raw.enfaitnon,R.raw.harderdaddy,R.raw.toitumappellesmonsieur};
        super.soundImage = new Integer[]{R.drawable.cestnul,R.drawable.tobecontinued,R.drawable.omaewamoushindeiru,R.drawable.coucou,R.drawable.alerteauxgogoles,R.drawable.ohpunaise, R.drawable.areyougoingtofinishthatcroissant,R.drawable.itsoverneufmille,R.drawable.lickmyballs,R.drawable.ladroguecmauvaismvoyez,R.drawable.achevele, R.drawable.fermetagrandegueule,R.drawable.impicklerick,R.drawable.caseprononcenuquelaire,R.drawable.kamehameha,R.drawable.bonjourtoutlemonde,R.drawable.ohmondieuilsonttueskenny, R.drawable.teleportation,R.drawable.heyyeyaaeyaa,R.drawable.metamorphosegoldorak,R.drawable.musiquedbsaupian,R.drawable.jevousemmerdeetjerentre,R.drawable.milletonnerresdebrest, R.drawable.rasengan,R.drawable.especede,R.drawable.wubbalubba,R.drawable.jesuisrickornichon,R.drawable.themel,R.drawable.schezwansauce,R.drawable.pikachuu,R.drawable.minirick, R.drawable.finalflash,R.drawable.cestlheureduduel,R.drawable.sonneriebojackhorseman,R.drawable.salutcestmoimrlarbin,R.drawable.noussommesderetourpourvousjouer, R.drawable.sonneriepeanutbutter,R.drawable.cestladansederick,R.drawable.onvavousfaireschwifter,R.drawable.gomugomuno,R.drawable.lateamrocketsenvoleversdautres, R.drawable.weareonepiece,R.drawable.zawarudo,R.drawable.niconiconi,R.drawable.spidercochon,R.drawable.ultimatehanzo,R.drawable.onvacassedupd,R.drawable.afewmomentlater, R.drawable.oneeternitylater,R.drawable.dendenmushi,R.drawable.yareyaredaze,R.drawable.becauseimbatman,R.drawable.unefoisjaisoulevetamere,R.drawable.smashmidoriya, R.drawable.aurevoirhommedelalune,R.drawable.mangekyousharingan,R.drawable.mineminemine,R.drawable.sulligemissement,R.drawable.getbackinthekitchen,R.drawable.tuveuxquonseladonne, R.drawable.dabcarlos,R.drawable.jojosbizarre,R.drawable.amaterasu,R.drawable.kagebunshinnojutsu,R.drawable.narutosasukescreaming,R.drawable.rasenshuriken, R.drawable.endingonepunchman,R.drawable.ohmincechipper,R.drawable.satesatesate,R.drawable.sonnerietotallyspies,R.drawable.clonenaruto,R.drawable.jereveoutuviensdeposertapechesurmonbureau,R.drawable.jesuisspecial,R.drawable.ohcacestpastresgentil,R.drawable.skiner,R.drawable.elimination,R.drawable.fraulein,R.drawable.objection,R.drawable.cadeaudemoiamoi,R.drawable.cridedingo,R.drawable.enfaitnon,R.drawable.harderdaddy,R.drawable.toitumappellesmonsieur};
        super.after();
        return view;
    }
}