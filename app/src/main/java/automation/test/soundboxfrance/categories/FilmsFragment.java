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

public class FilmsFragment extends SuperFragment {

    public FilmsFragment(FilmsTVActivity mainActivity) {
        super(mainActivity);
    }

    public FilmsFragment(){}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.before(inflater,container);
        super.nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesFilms));
        super.soundID = new Integer[]{R.raw.pasdechocolat,R.raw.onattendpas,R.raw.grantorino,R.raw.tanzanidoudou,R.raw.philippe,R.raw.jesuistonpere,R.raw.mercilagueuse,R.raw.coucoudobii,R.raw.avadakedavra,R.raw.lumosmaxima,R.raw.passerpentard,R.raw.pottercelebrite,R.raw.intentionmauvaise,R.raw.renvoyerhp,R.raw.sorcierharry,R.raw.papadeadpool,R.raw.iletaittempspirate,R.raw.obiwan,R.raw.sayhellotomylittlefriend,R.raw.campingcardebatard,R.raw.parlemainterminator,R.raw.eluanakin,R.raw.aucunsensjack,R.raw.gollum,R.raw.iambatman,R.raw.coursforest,R.raw.teslaoutespasla,R.raw.scarfaceencule,R.raw.beurrerbiscote,R.raw.omeletteoeuf,R.raw.vousnepasserezpas,R.raw.hagrid,R.raw.jaimemebattre,R.raw.ohmonaco,R.raw.biloute,R.raw.stupidehobbit,R.raw.liberteegalitentm,R.raw.iltarrivedesaigner,R.raw.mynameisjeff,R.raw.unjourelleseramienne,R.raw.hehehevoldemort,R.raw.desfritestuches,R.raw.jaimeleveau,R.raw.huithdecachou,R.raw.nein,R.raw.crialiensoupeauxchoux,R.raw.jaiglissechef,R.raw.justleblanc,R.raw.quelaforcedepeter,R.raw.jetireuneballedanslatete,R.raw.thisissparta,R.raw.theprophetyistrue,R.raw.maisvoussavez,R.raw.alertegenerale,R.raw.zegemabeach,R.raw.coursasterixme,R.raw.unedictaturecest,R.raw.canapifatal,R.raw.cesoirbranlette,R.raw.daammn,R.raw.geaimoqueurhungergames,R.raw.splendide,R.raw.jesappellegroot,R.raw.votrepereetaitunsalop,R.raw.alarmepurge,R.raw.quedieubenisselesnouveaux,R.raw.theyretakingthehobbittoisengard,R.raw.talesboulestalesglandes,R.raw.waza,R.raw.jamaisvuuntasdemerde,R.raw.utini,R.raw.nomdezeus,R.raw.baslespattestetedepoule,R.raw.etmoijesuisironman,R.raw.runitsgodzilla,R.raw.pouahcapuire,R.raw.etsionfaisaitlamourtoutnu,R.raw.quandjsuiscontentjevomis,R.raw.bisoubiscoto,R.raw.goodmorningvietnam,R.raw.spartiatequelestvotremetier,R.raw.ungrandpouvoir,R.raw.jeveuxdeschaussures,R.raw.cestvousledocdoc,R.raw.unpeumonneveu,R.raw.combien,R.raw.criwilhelm,R.raw.holyjesus,R.raw.messireunsarrasin};
        super.soundImage = new Integer[]{R.drawable.pasdebraspasdechocolat,R.drawable.alorsonattendpaspatrick,R.drawable.unmecquilfallaitpasfairechier,R.drawable.onestentanzanie,R.drawable.philippejesaisoututecaches,R.drawable.jesuistonpere, R.drawable.mercilagueuse,R.drawable.coucouharrypotter,R.drawable.avadakedavra,R.drawable.lumosmaxima,R.drawable.interditdepenetrer,R.drawable.monsieurpotternotrenouvellecelebrite, R.drawable.jejuresolennellementquemesintentionssontmauvaises,R.drawable.wingardiumleviosa,R.drawable.tuesunsorcierharry,R.drawable.jevaisfaireatagueule,R.drawable.hissonsnoscouleurs, R.drawable.salutatous, R.drawable.sayhellotomylittlefriend,R.drawable.lecampingcardebatard,R.drawable.parleamamainterminator,R.drawable.tuetaitlelu,R.drawable.cequetudisnaaucunsens,R.drawable.monprecieux, R.drawable.imbatman,R.drawable.coursforestcours,R.drawable.tesououtespasla,R.drawable.vatefaireenculerscarface,R.drawable.jaimemebeurrerlabiscotte,R.drawable.taimebienlesomelettes, R.drawable.vousnepasserezpas,R.drawable.hagriiid,R.drawable.jaimemebattre,R.drawable.tucheamonaco,R.drawable.biloute,R.drawable.stupidehobbitjoufflu,R.drawable.liberteegalitentm, R.drawable.iltarrivedesaigner,R.drawable.mynameisjeff,R.drawable.unjourelleseramienne,R.drawable.hehehehe,R.drawable.desfritesdesfrites,R.drawable.jaimeleveau,R.drawable.huitheuresdecachou, R.drawable.nein,R.drawable.aliendelasoupeauxchoux,R.drawable.jaiglissechef,R.drawable.ilsappellejusteblanc,R.drawable.quelaforcedepetermccalloway,R.drawable.jetireuneballedanslatetealamain, R.drawable.sparta,R.drawable.theprophecyistrue,R.drawable.maisvoussavez,R.drawable.alertegenerale,R.drawable.zegemabeach,R.drawable.coursasterixme,R.drawable.unedictature, R.drawable.canapi,R.drawable.cesoirbranlette,R.drawable.dammn,R.drawable.geaimoqueurhg,R.drawable.splendide,R.drawable.jesappellegroot,R.drawable.votrepereetaituns,R.drawable.alarmedelapurge, R.drawable.quedieubenisselesnouveaux,R.drawable.theyaretakingthehobbittoisengard,R.drawable.taslesboulestaslesglandes,R.drawable.wazaaaaaaa,R.drawable.jamaisvuuntasdemerde,R.drawable.utini, R.drawable.nomdezeus,R.drawable.baslespattestetedepoulet,R.drawable.etmoijesuisironman,R.drawable.runitsgozilla,R.drawable.pouahcapuire,R.drawable.etsionfaisaitlamourtoutnu,R.drawable.quandjsuiscontentjevomis,R.drawable.bisoubiscoto,R.drawable.goodmorningvietnam,R.drawable.spartiatequelestvotremetier,R.drawable.ungrandpouvoir,R.drawable.jeveuxleschaussures,R.drawable.cestvousledocdoc,R.drawable.unpeumonneveu,R.drawable.combien,R.drawable.criwilhelm,R.drawable.holyjesus,R.drawable.messireunsarrasin};
        super.after();
        return view;
    }
}