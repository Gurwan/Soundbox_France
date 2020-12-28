/*
 * *******************************************************
 * Copyright (c) 2020. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance.categories;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import automation.test.soundboxfrance.EventHandlerClass;
import automation.test.soundboxfrance.R;
import automation.test.soundboxfrance.SoundObject;
import automation.test.soundboxfrance.SoundboxRecyclerAdapter;

public class NewsFragment extends AppCompatActivity {

    ArrayList<SoundObject> soundListNouveautes = new ArrayList<>();

    RecyclerView SoundView;
    SoundboxRecyclerAdapter SoundAdapter = new SoundboxRecyclerAdapter(soundListNouveautes);
    RecyclerView.LayoutManager SoundLayoutManager;
    private List<String> nameList = new ArrayList<>();

    public NewsFragment(){}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        int pleinEcran = WindowManager.LayoutParams.FLAG_FULLSCREEN ; getWindow().setFlags(pleinEcran,pleinEcran);

        nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesNouveautes));

        SoundObject[] soundItems = {new SoundObject(nameList.get(0),R.raw.accelereaccelere),new SoundObject(nameList.get(1), R.raw.argentine),new SoundObject(nameList.get(2), R.raw.ascenseurmusique),new SoundObject(nameList.get(3), R.raw.attentiongrenade),new SoundObject(nameList.get(4), R.raw.aurevoir),new SoundObject(nameList.get(5), R.raw.australie),new SoundObject(nameList.get(6), R.raw.avengersinfinitywars),new SoundObject(nameList.get(7), R.raw.ayo),new SoundObject(nameList.get(8), R.raw.bisoubiscoto),new SoundObject(nameList.get(9), R.raw.bluebirdnaruto),new SoundObject(nameList.get(10), R.raw.bonanniversairelesptitsindiens),new SoundObject(nameList.get(11), R.raw.brawlstar),new SoundObject(nameList.get(12), R.raw.bresil),new SoundObject(nameList.get(13), R.raw.canada),new SoundObject(nameList.get(14), R.raw.cestbieneleonore),new SoundObject(nameList.get(15), R.raw.cestnon),new SoundObject(nameList.get(16), R.raw.cestquilepatroncestmoi),new SoundObject(nameList.get(17), R.raw.champagneytb),new SoundObject(nameList.get(18), R.raw.cheztati),new SoundObject(nameList.get(19), R.raw.clashroyale),new SoundObject(nameList.get(20), R.raw.clonenaruto),new SoundObject(nameList.get(21), R.raw.cocowejdene),new SoundObject(nameList.get(22), R.raw.colombie),new SoundObject(nameList.get(23), R.raw.dehors),new SoundObject(nameList.get(24), R.raw.demonslayer),new SoundObject(nameList.get(25), R.raw.djomb),new SoundObject(nameList.get(26), R.raw.doralexploratrice),new SoundObject(nameList.get(27), R.raw.eatingminecraft),new SoundObject(nameList.get(28), R.raw.ecosse),new SoundObject(nameList.get(29), R.raw.egypte),new SoundObject(nameList.get(30), R.raw.europaleague),new SoundObject(nameList.get(31), R.raw.fantomas),new SoundObject(nameList.get(32), R.raw.fautpasrespirerlacompote),new SoundObject(nameList.get(33), R.raw.finlande),new SoundObject(nameList.get(34), R.raw.fivenightsatfreddys),new SoundObject(nameList.get(35), R.raw.foodwars),new SoundObject(nameList.get(36), R.raw.fordboyard),new SoundObject(nameList.get(37), R.raw.fruitdelapassion),new SoundObject(nameList.get(38), R.raw.fullflemme),new SoundObject(nameList.get(39),R.raw.galakticfootball),new SoundObject(nameList.get(40), R.raw.galettesaucissejetaime),new SoundObject(nameList.get(41), R.raw.gamecube),new SoundObject(nameList.get(42), R.raw.gameoveryeah),new SoundObject(nameList.get(43), R.raw.goodbyetoaworld),new SoundObject(nameList.get(44), R.raw.goodmorningvietnam),new SoundObject(nameList.get(45), R.raw.hongrie),new SoundObject(nameList.get(46), R.raw.huitmortssixblesses),new SoundObject(nameList.get(47), R.raw.jaimebienla),new SoundObject(nameList.get(48), R.raw.japon),new SoundObject(nameList.get(49), R.raw.jereveoutuviensdeposertapechesurmonbureau),new SoundObject(nameList.get(50), R.raw.jesuisspecial),new SoundObject(nameList.get(51), R.raw.jetedemandepardon),new SoundObject(nameList.get(52), R.raw.fortnitekill),new SoundObject(nameList.get(53), R.raw.lessnorkies),new SoundObject(nameList.get(54), R.raw.lucifer),new SoundObject(nameList.get(55), R.raw.luigiclashmario),new SoundObject(nameList.get(56), R.raw.marinapasses),new SoundObject(nameList.get(57), R.raw.mariokartdoubledash),new SoundObject(nameList.get(58), R.raw.messimessimessi),new SoundObject(nameList.get(59), R.raw.mexique), new SoundObject(nameList.get(60), R.raw.modezombie),new SoundObject(nameList.get(61), R.raw.murlok),new SoundObject(nameList.get(62), R.raw.musette),new SoundObject(nameList.get(63), R.raw.netinquietespas),new SoundObject(nameList.get(64), R.raw.nevergonnagiveyouup),new SoundObject(nameList.get(65), R.raw.norvege),new SoundObject(nameList.get(66), R.raw.ohcacestpastresgentil),new SoundObject(nameList.get(67), R.raw.otarie),new SoundObject(nameList.get(68), R.raw.ouilesinconnus),new SoundObject(nameList.get(69), R.raw.paysdegalle),new SoundObject(nameList.get(70), R.raw.peakyblinders),new SoundObject(nameList.get(71), R.raw.phoenixwright),new SoundObject(nameList.get(72), R.raw.pinglol),new SoundObject(nameList.get(73), R.raw.pourquoijeparleaveceux),new SoundObject(nameList.get(74), R.raw.prendpastroplaconfianceredescend),new SoundObject(nameList.get(75), R.raw.quellepertedetempsquellepertedenergie),new SoundObject(nameList.get(76), R.raw.republiquedemocratiqueducongo),new SoundObject(nameList.get(77), R.raw.sega),new SoundObject(nameList.get(78), R.raw.skiner),new SoundObject(nameList.get(79), R.raw.slovenie),new SoundObject(nameList.get(80), R.raw.spartiatequelestvotremetier),new SoundObject(nameList.get(81), R.raw.streetfighter2),new SoundObject(nameList.get(82), R.raw.suede),new SoundObject(nameList.get(83), R.raw.supersmashbrosbrawl),new SoundObject(nameList.get(84), R.raw.swordartonline),new SoundObject(nameList.get(85), R.raw.tailletailletaille),new SoundObject(nameList.get(86), R.raw.thatalotofdamage),new SoundObject(nameList.get(87), R.raw.tombraiderlegend),new SoundObject(nameList.get(88), R.raw.tomsayer),new SoundObject(nameList.get(89), R.raw.touchepasamabagnole),new SoundObject(nameList.get(90), R.raw.tuesqui),new SoundObject(nameList.get(91), R.raw.undertale),new SoundObject(nameList.get(92), R.raw.ungrandpouvoir),new SoundObject(nameList.get(93), R.raw.veroniquefaituninfarctus),new SoundObject(nameList.get(94), R.raw.voilabonokbyebye),new SoundObject(nameList.get(95), R.raw.whoisthatpokemon),new SoundObject(nameList.get(96), R.raw.yeet),new SoundObject(nameList.get(97), R.raw.yoshi),new SoundObject(nameList.get(98), R.raw.zumbacafe)};
        soundListNouveautes.addAll(Arrays.asList(soundItems));

        soundItems[0].setImage(R.drawable.accelereaccelere);
        soundItems[1].setImage(R.drawable.argentine);
        soundItems[2].setImage(R.drawable.ascenseurmusique);
        soundItems[3].setImage(R.drawable.attentiongrenade);
        soundItems[4].setImage(R.drawable.aurevoir);
        soundItems[5].setImage(R.drawable.australie);
        soundItems[6].setImage(R.drawable.avengersinfinitywars);
        soundItems[7].setImage(R.drawable.ayo);
        soundItems[8].setImage(R.drawable.bisoubiscoto);
        soundItems[9].setImage(R.drawable.bluebirdnaruto);
        soundItems[10].setImage(R.drawable.bonanniversairelesptitsindiens);
        soundItems[11].setImage(R.drawable.brawlstar);
        soundItems[12].setImage(R.drawable.bresil);
        soundItems[13].setImage(R.drawable.canada);
        soundItems[14].setImage(R.drawable.cestbieneleonore);
        soundItems[15].setImage(R.drawable.cestnon);
        soundItems[16].setImage(R.drawable.cestquilepatron);
        soundItems[17].setImage(R.drawable.champagneytb);
        soundItems[18].setImage(R.drawable.cheztati);
        soundItems[19].setImage(R.drawable.clashroyale);
        soundItems[20].setImage(R.drawable.clonenaruto);
        soundItems[21].setImage(R.drawable.cocowejdene);
        soundItems[22].setImage(R.drawable.colombie);
        soundItems[23].setImage(R.drawable.dehors);
        soundItems[24].setImage(R.drawable.demonslayer);
        soundItems[25].setImage(R.drawable.djomb);
        soundItems[26].setImage(R.drawable.doralexploratrice);
        soundItems[27].setImage(R.drawable.eatingminecraft);
        soundItems[28].setImage(R.drawable.ecosse);
        soundItems[29].setImage(R.drawable.egypte);
        soundItems[30].setImage(R.drawable.europaleague);
        soundItems[31].setImage(R.drawable.fantomas);
        soundItems[32].setImage(R.drawable.fautpasrespirerlacompote);
        soundItems[33].setImage(R.drawable.finlande);
        soundItems[34].setImage(R.drawable.fivenightsatfreddys);
        soundItems[35].setImage(R.drawable.foodwars);
        soundItems[36].setImage(R.drawable.fordboyard);
        soundItems[37].setImage(R.drawable.fruitdelapassion);
        soundItems[38].setImage(R.drawable.fullflemme);
        soundItems[39].setImage(R.drawable.galakticfootball);
        soundItems[40].setImage(R.drawable.galettesaucissejetaime);
        soundItems[41].setImage(R.drawable.gamecube);
        soundItems[42].setImage(R.drawable.gameoveryeah);
        soundItems[43].setImage(R.drawable.goodbyetoaworld);
        soundItems[44].setImage(R.drawable.goodmorningvietnam);
        soundItems[45].setImage(R.drawable.hongrie);
        soundItems[46].setImage(R.drawable.huitmortssixblesses);
        soundItems[47].setImage(R.drawable.jaimebien);
        soundItems[48].setImage(R.drawable.japon);
        soundItems[49].setImage(R.drawable.jereveoutuviensdeposertapechesurmonbureau);
        soundItems[50].setImage(R.drawable.jesuisspecial);
        soundItems[51].setImage(R.drawable.jetedemandepardon);
        soundItems[52].setImage(R.drawable.killfortnite);
        soundItems[53].setImage(R.drawable.lessnorkies);
        soundItems[54].setImage(R.drawable.lucifer);
        soundItems[55].setImage(R.drawable.luigiclashmario);
        soundItems[56].setImage(R.drawable.marinapasse);
        soundItems[57].setImage(R.drawable.mariokartdoubledash);
        soundItems[58].setImage(R.drawable.messimessimessi);
        soundItems[59].setImage(R.drawable.mexique);
        soundItems[60].setImage(R.drawable.modezombie);
        soundItems[61].setImage(R.drawable.murloc);
        soundItems[62].setImage(R.drawable.musette);
        soundItems[63].setImage(R.drawable.netinquietespas);
        soundItems[64].setImage(R.drawable.nevergonnagiveyouup);
        soundItems[65].setImage(R.drawable.norvege);
        soundItems[66].setImage(R.drawable.ohcacestpastresgentil);
        soundItems[67].setImage(R.drawable.otarie);
        soundItems[68].setImage(R.drawable.ouilesinconnus);
        soundItems[69].setImage(R.drawable.paysdegalle);
        soundItems[70].setImage(R.drawable.peakyblinders);
        soundItems[71].setImage(R.drawable.phoenixwright);
        soundItems[72].setImage(R.drawable.pinglol);
        soundItems[73].setImage(R.drawable.pourquoijeparleaveceux);
        soundItems[74].setImage(R.drawable.prendpastroplaconfianceredescends);
        soundItems[75].setImage(R.drawable.quellepertedetempsquellepertedenergie);
        soundItems[76].setImage(R.drawable.congordc);
        soundItems[77].setImage(R.drawable.sega);
        soundItems[78].setImage(R.drawable.skiner);
        soundItems[79].setImage(R.drawable.slovenie);
        soundItems[80].setImage(R.drawable.spartiatequelestvotremetier);
        soundItems[81].setImage(R.drawable.streetfighter2);
        soundItems[82].setImage(R.drawable.suede);
        soundItems[83].setImage(R.drawable.supersmashbrosbrawl);
        soundItems[84].setImage(R.drawable.swordartonline);
        soundItems[85].setImage(R.drawable.tailletailletaille);
        soundItems[86].setImage(R.drawable.thatalotofdamage);
        soundItems[87].setImage(R.drawable.tombraiderlegend);
        soundItems[88].setImage(R.drawable.tomsayer);
        soundItems[89].setImage(R.drawable.touchepasamabagnole);
        soundItems[90].setImage(R.drawable.tuesqui);
        soundItems[91].setImage(R.drawable.undertale);
        soundItems[92].setImage(R.drawable.ungrandpouvoir);
        soundItems[93].setImage(R.drawable.veroniquefaituninfarctus);
        soundItems[94].setImage(R.drawable.voilabonokbyebye);
        soundItems[95].setImage(R.drawable.whoisthatpokemon);
        soundItems[96].setImage(R.drawable.yeet);
        soundItems[97].setImage(R.drawable.yoshi);
        soundItems[98].setImage(R.drawable.zumbacafe);

        SoundView = findViewById(R.id.soundboxRecyclerView);

        SoundLayoutManager = new GridLayoutManager(this, 3);

        SoundView.setLayoutManager(SoundLayoutManager);

        SoundView.setAdapter(SoundAdapter);

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();

        EventHandlerClass.releaseMediaPlayer();
    }
}