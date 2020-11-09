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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        int pleinEcran = WindowManager.LayoutParams.FLAG_FULLSCREEN ; getWindow().setFlags(pleinEcran,pleinEcran);

        nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesNouveautes));

        SoundObject[] soundItems = {new SoundObject(nameList.get(0),R.raw.antimoinsdedix),new SoundObject(nameList.get(1), R.raw.babybemine),new SoundObject(nameList.get(2), R.raw.billiejean),new SoundObject(nameList.get(3), R.raw.deconnectedjhamida),new SoundObject(nameList.get(4), R.raw.demarragemariokart),new SoundObject(nameList.get(5), R.raw.ehgrosreveilletoiicicestlescitesdefrancenarvalo),new SoundObject(nameList.get(6), R.raw.endingonepunchman),new SoundObject(nameList.get(7), R.raw.fallguystheme),new SoundObject(nameList.get(8), R.raw.howimetyourmother),new SoundObject(nameList.get(9), R.raw.irlandtheme),new SoundObject(nameList.get(10), R.raw.jedanselemia),new SoundObject(nameList.get(11), R.raw.jesuispamela),new SoundObject(nameList.get(12), R.raw.jsuisspidermanfdp),new SoundObject(nameList.get(13), R.raw.lacostetn),new SoundObject(nameList.get(14), R.raw.maisvayptn),new SoundObject(nameList.get(15), R.raw.menteurpharisien),new SoundObject(nameList.get(16), R.raw.midnightcity),new SoundObject(nameList.get(17), R.raw.moijepenselaquestionelleestviterepondue),new SoundObject(nameList.get(18), R.raw.multiplexcanalplus),new SoundObject(nameList.get(19), R.raw.nbasoundeffect),new SoundObject(nameList.get(20), R.raw.nonjaipasdamis),new SoundObject(nameList.get(21), R.raw.ohmerdeohcestconca),new SoundObject(nameList.get(22), R.raw.ohmincechipper),new SoundObject(nameList.get(23), R.raw.ohpureedepommedeterre),new SoundObject(nameList.get(24), R.raw.onseconnaityouss),new SoundObject(nameList.get(25), R.raw.onvaallerluicasserlescouillestuconnai),new SoundObject(nameList.get(26), R.raw.pimpfiftycent),new SoundObject(nameList.get(27), R.raw.portequigrince),new SoundObject(nameList.get(28), R.raw.poutinewalking),new SoundObject(nameList.get(29), R.raw.pumpitup),new SoundObject(nameList.get(30), R.raw.bruitrat),new SoundObject(nameList.get(31), R.raw.rot),new SoundObject(nameList.get(32), R.raw.satesatesate),new SoundObject(nameList.get(33), R.raw.situmeurscetaitecrit),new SoundObject(nameList.get(34), R.raw.sonnerietotallyspies),new SoundObject(nameList.get(35), R.raw.tagrandmereellemangedesgn),new SoundObject(nameList.get(36), R.raw.hymnetunisie),new SoundObject(nameList.get(37), R.raw.wrongneighborhood),new SoundObject(nameList.get(38), R.raw.bruitzombie)};
        soundListNouveautes.addAll(Arrays.asList(soundItems));

        soundItems[0].setImage(R.drawable.antimoinsdedix);
        soundItems[1].setImage(R.drawable.babybemine);
        soundItems[2].setImage(R.drawable.billiejean);
        soundItems[3].setImage(R.drawable.deconnecte);
        soundItems[4].setImage(R.drawable.demarragemariokart);
        soundItems[5].setImage(R.drawable.citedefrancenarvalo);
        soundItems[6].setImage(R.drawable.endingonepunchman);
        soundItems[7].setImage(R.drawable.fallguystheme);
        soundItems[8].setImage(R.drawable.howimetyourmother);
        soundItems[9].setImage(R.drawable.irlande);
        soundItems[10].setImage(R.drawable.jedanselemia);
        soundItems[11].setImage(R.drawable.jesuispamela);
        soundItems[12].setImage(R.drawable.jsuisspidermanfdp);
        soundItems[13].setImage(R.drawable.lacostetn);
        soundItems[14].setImage(R.drawable.maisvayptn);
        soundItems[15].setImage(R.drawable.menteurpharisien);
        soundItems[16].setImage(R.drawable.midnightcity);
        soundItems[17].setImage(R.drawable.questionviterepondue);
        soundItems[18].setImage(R.drawable.multiplexcanalplus);
        soundItems[19].setImage(R.drawable.nbasoundeffect);
        soundItems[20].setImage(R.drawable.nonjaipasdamis);
        soundItems[21].setImage(R.drawable.ohmerdeohcestconca);
        soundItems[22].setImage(R.drawable.ohmincechipper);
        soundItems[23].setImage(R.drawable.ohpureedepommedeterre);
        soundItems[24].setImage(R.drawable.onseconnaityouss);
        soundItems[25].setImage(R.drawable.onvaallerluicasserlescouilles);
        soundItems[26].setImage(R.drawable.pimpfiftycent);
        soundItems[27].setImage(R.drawable.portegrince);
        soundItems[28].setImage(R.drawable.poutinewalking);
        soundItems[29].setImage(R.drawable.pumpitup);
        soundItems[30].setImage(R.drawable.bruitrat);
        soundItems[31].setImage(R.drawable.rot);
        soundItems[32].setImage(R.drawable.satesatesate);
        soundItems[33].setImage(R.drawable.situmeurscetaitecrit);
        soundItems[34].setImage(R.drawable.sonnerietotallyspies);
        soundItems[35].setImage(R.drawable.tagrandmereellemangedesgnocci);
        soundItems[36].setImage(R.drawable.tunisie);
        soundItems[37].setImage(R.drawable.wrongneighborhood);
        soundItems[38].setImage(R.drawable.bruitzombie);

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