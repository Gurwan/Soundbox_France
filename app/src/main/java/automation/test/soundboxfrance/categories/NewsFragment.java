/*
 * *******************************************************
 * Copyright (c) 2021. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance.categories;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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
    int az = -1;

    public NewsFragment(){}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        int pleinEcran = WindowManager.LayoutParams.FLAG_FULLSCREEN ; getWindow().setFlags(pleinEcran,pleinEcran);

        nameList = Arrays.asList(getResources().getStringArray(R.array.soundNamesNouveautes));

        SoundObject[] soundItems = {new SoundObject(nameList.get(0),R.raw.bahouiconnard),new SoundObject(nameList.get(1), R.raw.cadeaudemoiamoi)
                ,new SoundObject(nameList.get(2), R.raw.cestdegeulasse),new SoundObject(nameList.get(3), R.raw.cestpascommecaquonimaginelavie)
                ,new SoundObject(nameList.get(4), R.raw.combien),new SoundObject(nameList.get(5), R.raw.cridemario)
                ,new SoundObject(nameList.get(6), R.raw.cridingo),new SoundObject(nameList.get(7), R.raw.criwilhelm)
                ,new SoundObject(nameList.get(8), R.raw.deathnote),new SoundObject(nameList.get(9), R.raw.eliminationmoundir)
                ,new SoundObject(nameList.get(10), R.raw.enfaitnon),new SoundObject(nameList.get(11), R.raw.enpleindanslesanglier)
                ,new SoundObject(nameList.get(12), R.raw.gameoverpacman),new SoundObject(nameList.get(13), R.raw.harderdaddy)
                ,new SoundObject(nameList.get(14), R.raw.harrypottersong),new SoundObject(nameList.get(15), R.raw.holyjesus)
                ,new SoundObject(nameList.get(16), R.raw.hurlementloup),new SoundObject(nameList.get(17), R.raw.ilikeyourcutg)
                ,new SoundObject(nameList.get(18), R.raw.jeancastex),new SoundObject(nameList.get(19), R.raw.jensaisrienjaiprisnimportequoi)
                ,new SoundObject(nameList.get(20), R.raw.jevaisprankermamadou),new SoundObject(nameList.get(21), R.raw.jujutsukaisenending)
                ,new SoundObject(nameList.get(22), R.raw.jvaisledemarrerct),new SoundObject(nameList.get(23), R.raw.lesfillesjesuistombe)
                ,new SoundObject(nameList.get(24), R.raw.lesschtroumpfs),new SoundObject(nameList.get(25), R.raw.maplay)
                ,new SoundObject(nameList.get(26), R.raw.messireunsarrasin),new SoundObject(nameList.get(27), R.raw.moijaimelepimentdespelette)
                ,new SoundObject(nameList.get(28), R.raw.moncochonprefere),new SoundObject(nameList.get(29), R.raw.mrworldwide)
                ,new SoundObject(nameList.get(30), R.raw.newyorkunitespeciale),new SoundObject(nameList.get(31), R.raw.nonosquare)
                ,new SoundObject(nameList.get(32), R.raw.nwordincoming),new SoundObject(nameList.get(33), R.raw.ohmaiscestcartonrougela),
                new SoundObject(nameList.get(34), R.raw.okboomer),new SoundObject(nameList.get(35), R.raw.oliviertuvasniquerlabatterie),
                new SoundObject(nameList.get(36), R.raw.onappellecaunedouille)
                ,new SoundObject(nameList.get(37), R.raw.pendantlesvacancesjenefaisrien),new SoundObject(nameList.get(38), R.raw.rapdebourgeois)
                ,new SoundObject(nameList.get(39), R.raw.readyplayerone),new SoundObject(nameList.get(40), R.raw.riendeplusnormalpourlebataillondexploration)
                ,new SoundObject(nameList.get(41), R.raw.russiabongo),new SoundObject(nameList.get(42), R.raw.salt)
                ,new SoundObject(nameList.get(43), R.raw.silenceoujefaisejaculerlasalle),new SoundObject(nameList.get(44), R.raw.surispliff),
                new SoundObject(nameList.get(45), R.raw.tagueulejuste)
                ,new SoundObject(nameList.get(46), R.raw.terribledesillusion),new SoundObject(nameList.get(47), R.raw.tkmangehamburgernoir)
                ,new SoundObject(nameList.get(48), R.raw.toitumappellesmonsieur),new SoundObject(nameList.get(49), R.raw.wellberightback)
                ,new SoundObject(nameList.get(50), R.raw.wshbienouquoipaindepices)
                ,new SoundObject(nameList.get(51), R.raw.yaaaa),new SoundObject(nameList.get(52), R.raw.youtakesomechocolate)};
        soundListNouveautes.addAll(Arrays.asList(soundItems));

        soundItems[0].setImage(R.drawable.bahouiconnard);
        soundItems[1].setImage(R.drawable.cadeaudemoiamoi);
        soundItems[2].setImage(R.drawable.cestdegueulasse);
        soundItems[3].setImage(R.drawable.cestpascommecaquonimaginelavie);
        soundItems[4].setImage(R.drawable.combien);
        soundItems[5].setImage(R.drawable.cridemario);
        soundItems[6].setImage(R.drawable.cridedingo);
        soundItems[7].setImage(R.drawable.criwilhelm);
        soundItems[8].setImage(R.drawable.deathnote);
        soundItems[9].setImage(R.drawable.eliminationmoundir);
        soundItems[10].setImage(R.drawable.enfaitnon);
        soundItems[11].setImage(R.drawable.enpleindanslesanglier);
        soundItems[12].setImage(R.drawable.gameoverpacman);
        soundItems[13].setImage(R.drawable.harderdaddy);
        soundItems[14].setImage(R.drawable.harrypottersong);
        soundItems[15].setImage(R.drawable.holyjesus);
        soundItems[16].setImage(R.drawable.hurlementloup);
        soundItems[17].setImage(R.drawable.ilikeyourcutg);
        soundItems[18].setImage(R.drawable.jeancastex);
        soundItems[19].setImage(R.drawable.jensaisrienjaiprisnimportequoi);
        soundItems[20].setImage(R.drawable.jevaisprankermamadou);
        soundItems[21].setImage(R.drawable.jujutsukaisenending);
        soundItems[22].setImage(R.drawable.jevaisledemarrer);
        soundItems[23].setImage(R.drawable.lesfillesjesuistombe);
        soundItems[24].setImage(R.drawable.lesschtroumpfs);
        soundItems[25].setImage(R.drawable.maplay);
        soundItems[26].setImage(R.drawable.messireunsarrasin);
        soundItems[27].setImage(R.drawable.moijaimelepimentdespelette);
        soundItems[28].setImage(R.drawable.moncochonprefere);
        soundItems[29].setImage(R.drawable.mrworldwide);
        soundItems[30].setImage(R.drawable.newyorkunitespeciale);
        soundItems[31].setImage(R.drawable.nonosquare);
        soundItems[32].setImage(R.drawable.nwordincoming);
        soundItems[33].setImage(R.drawable.ohmaiscestcartonrouge);
        soundItems[34].setImage(R.drawable.okboomer);
        soundItems[35].setImage(R.drawable.oliviertuvasniquerla);
        soundItems[36].setImage(R.drawable.onappellecaunedouille);
        soundItems[37].setImage(R.drawable.pendantlesvacancesjenefaisrien);
        soundItems[38].setImage(R.drawable.rapdebourgeois);
        soundItems[39].setImage(R.drawable.readyplayerone);
        soundItems[40].setImage(R.drawable.riendeplusnormalpourlebataillondexploration);
        soundItems[41].setImage(R.drawable.russiabongo);
        soundItems[42].setImage(R.drawable.salt);
        soundItems[43].setImage(R.drawable.silenceoujefaisejaculerlasalle);
        soundItems[44].setImage(R.drawable.surispliff);
        soundItems[45].setImage(R.drawable.tagueulejuste);
        soundItems[46].setImage(R.drawable.terribledesillusion);
        soundItems[47].setImage(R.drawable.cestlapremierefoisdetoutemavie);
        soundItems[48].setImage(R.drawable.toitumappellesmonsieur);
        soundItems[49].setImage(R.drawable.wellberightback);
        soundItems[50].setImage(R.drawable.wshbienouquoipaindepices);
        soundItems[51].setImage(R.drawable.yaaaa);
        soundItems[52].setImage(R.drawable.youtakesome);

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.help_menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem){
        if(menuItem.getItemId() == R.id.action_help){
            Toast.makeText(this, "Tous les sons ajoutés lors d'une mise à jour se trouvent ici ! Aucune chance de rater les nouveautés.", Toast.LENGTH_LONG).show();
            return true;
        } else if(menuItem.getItemId() == R.id.action_sort){
            if(az!=0){
                Collections.sort(soundListNouveautes, new Comparator<SoundObject>() {
                    @Override
                    public int compare(SoundObject soundObject, SoundObject t1) {
                        return soundObject.getItemName().compareTo(t1.getItemName());
                    }
                });
                az = 0;
            } else {
                Collections.sort(soundListNouveautes, Collections.reverseOrder(new Comparator<SoundObject>() {
                    @Override
                    public int compare(SoundObject soundObject, SoundObject t1) {
                        return soundObject.getItemName().compareTo(t1.getItemName());
                    }
                }));
                az = 1;
            }
            SoundAdapter.notifyDataSetChanged();
        }

        return super.onOptionsItemSelected(menuItem);
    }
}