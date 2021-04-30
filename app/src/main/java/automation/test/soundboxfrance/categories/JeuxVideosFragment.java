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

public class JeuxVideosFragment extends SuperFragment {

    public JeuxVideosFragment(JVActivity mainActivity) {
        super(mainActivity);
    }

    public JeuxVideosFragment(){}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.before(inflater,container);
        super.nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesJeuxVideos));
        super.soundID = new Integer[]{R.raw.crashb,R.raw.skyrim,R.raw.soulgta4,R.raw.trevorgta5,R.raw.cj,R.raw.itsmemario,R.raw.warneverchangesfallout,R.raw.sucertroll,R.raw.fortnitebus,R.raw.fortnitefirstdanse,R.raw.fortinitesddanse,R.raw.leeroyjenkins,R.raw.paspretillidan,R.raw.flossfortnite,R.raw.electroshuffle,R.raw.ouitempliernoir,R.raw.travailtermine,R.raw.coffrezelda,R.raw.nonmario,R.raw.zelda,R.raw.fusrodah,R.raw.mortroblox,R.raw.fievrediscofortnite,R.raw.wastedgta,R.raw.missionfailedmetalgearsolid,R.raw.mortvivantfortnite,R.raw.belairfortnite,R.raw.heynikoitsroman,R.raw.ineedhealing,R.raw.thorisherestarcraft,R.raw.soundeffecthitminecraft,R.raw.bonsangquestquonpeut,R.raw.meilleurpotefortnite,R.raw.delormerci,R.raw.bigsmokesorder,R.raw.linkfacesofevilrireduroi,R.raw.welcometobrahlala,R.raw.yourthelastonecompletethemission,R.raw.easports,R.raw.megalovania,R.raw.anucheekybreekyivdank,R.raw.ragnarlerougeskyrim,R.raw.heylisten,R.raw.alertmetalgearsolid,R.raw.perfectstreetfighter,R.raw.ohshitherewegoagain,R.raw.kikikimamama,R.raw.scp096sounds,R.raw.operationhealth,R.raw.musiqueboitemodezombie,R.raw.demarragemariokart,R.raw.clashroyale,R.raw.eatingminecraft,R.raw.gamecube,R.raw.gameoveryeah,R.raw.fortnitekill,R.raw.murlok,R.raw.pinglol,R.raw.sega,R.raw.yoshi,R.raw.emergencyamongus,R.raw.killamongus,R.raw.startamongus,R.raw.youpickedthewronghousefool,R.raw.deadbydaylightdoctorlaughting,R.raw.cridemario,R.raw.gameoverpacman};
        super.soundImage = new Integer[]{R.drawable.crashbandicoot,R.drawable.dovahkiin,R.drawable.andyoudontworryabout,R.drawable.trevordecuve,R.drawable.followthedamntrain,R.drawable.itsmemario ,R.drawable.warneverchanges ,R.drawable.vasuceruntroll,R.drawable.musiquedubus,R.drawable.turkdance,R.drawable.dansesurfortnite,R.drawable.leeroyjenkins,R.drawable.illidan, R.drawable.flossfortnite,R.drawable.electroshuffle,R.drawable.ouistarcraft,R.drawable.travailtermine,R.drawable.coffrezelda, R.drawable.nonmario,R.drawable.squalalanoussommespartis,R.drawable.fusrodah,R.drawable.robloxmort,R.drawable.fievredisco,R.drawable.wasted,R.drawable.missionfailed,R.drawable.mortvivant,R.drawable.belairfortnite,R.drawable.heynikoitsroman,R.drawable.ineedhealing,R.drawable.thorishere,R.drawable.hitminecraft,R.drawable.bonsangquestquonpeutsennuyer,R.drawable.meilleuramifornite,R.drawable.delormerci,R.drawable.bigsmokeorder,R.drawable.rireduroi,R.drawable.welcometobrawlhalla,R.drawable.yourethelastonecompletethemission,R.drawable.easport,R.drawable.megalovania,R.drawable.anucheekybreeky,R.drawable.ragnarlerouge,R.drawable.heylisten,R.drawable.alertemetalgearsolid,R.drawable.perfect,R.drawable.ohshitherewego,R.drawable.kikikimamama,R.drawable.scp096,R.drawable.operationhealth,R.drawable.boitemysteremodezombie,R.drawable.demarragemariokart,R.drawable.clashroyale,R.drawable.eatingminecraft,R.drawable.gamecube,R.drawable.gameoveryeah,R.drawable.killfortnite,R.drawable.murloc,R.drawable.pinglol,R.drawable.sega,R.drawable.yoshi,R.drawable.emergencyamongus,R.drawable.killamongus,R.drawable.startamongus,R.drawable.youpickedthewronghousefool,R.drawable.deadbydaylightdoctorlaugh,R.drawable.cridemario,R.drawable.gameoverpacman};
        super.after();
        return view;
    }
}