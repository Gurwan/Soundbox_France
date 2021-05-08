/*
 * *******************************************************
 * Copyright (c) 2021. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance.categories;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.widget.ViewPager2;

import automation.test.soundboxfrance.activity.ActivityPlaylist;
import automation.test.soundboxfrance.activity.ActivityToutRecherche;
import automation.test.soundboxfrance.activity.FavoriteActivity;
import automation.test.soundboxfrance.activity.IntoPlaylistActivity;
import automation.test.soundboxfrance.activity.MainActivity;
import automation.test.soundboxfrance.R;
import automation.test.soundboxfrance.model.SoundObject;
import automation.test.soundboxfrance.SoundboxRecyclerAdapter;
import automation.test.soundboxfrance.activity.YourSoundboxActivity;
import automation.test.soundboxfrance.adapters.ViewPagerAdapter;

class SuperActivity extends AppCompatActivity {
    protected final static String URLPROP = "http://play.google.com/store/apps/details?id=automation.test.soundboxfrance";
    protected final static String URLTW = "https://twitter.com/OkariaStudio";
    protected final static String URLPROPOSE = "https://docs.google.com/forms/d/e/1FAIpQLScSp4fVFHqFRI9zNGWaD_Lcn2PJACyLlVHeGr2ASq4rhg1kfg/viewform";
    protected InterstitialAd pubfav;
    protected InterstitialAd pubrecherche;

    protected TabLayout tabLayout;
    protected ViewPager2 viewPager;
    protected AppBarLayout appBarLayout;
    protected ViewPagerAdapter adapter;
    protected ArrayList<String> nameTab;

    public SuperActivity(){}

    protected void first(FragmentManager supportFragmentManager, Lifecycle lifecycle) {
        tabLayout = findViewById(R.id.tablayoutmusic);
        viewPager = findViewById(R.id.viewpagermusic);
        this.adapter = new ViewPagerAdapter(supportFragmentManager,lifecycle);
    }

    protected void second() {
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(6);
        new TabLayoutMediator(tabLayout,viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText(nameTab.get(position));
            }
        }).attach();

        Button buttonFav = findViewById(R.id.button_fav);
        buttonFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(2);
            }
        });

        Button buttonRecherche = findViewById(R.id.button_search);
        buttonRecherche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(3);
            }
        });

        Button buttonHome = findViewById(R.id.button_home);
        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(1);
            }
        });

        Button buttonYourSoundbox = findViewById(R.id.button_yoursoundbox);
        buttonYourSoundbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(4);
            }
        });

        Button buttonHelp = findViewById(R.id.button_help);
        buttonHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(6);
            }
        });

        Button playlistButton = findViewById(R.id.button_playlist);
        playlistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(7);
            }
        });

    }


    public void openSort(SoundboxRecyclerAdapter adapter, ArrayList<SoundObject> soundList,int az) {
        if(az!=0){
            Collections.sort(soundList, new Comparator<SoundObject>() {
                @Override
                public int compare(SoundObject soundObject, SoundObject t1) {
                    return soundObject.getItemName().compareTo(t1.getItemName());
                }
            });
        } else {
            Collections.sort(soundList, Collections.reverseOrder(new Comparator<SoundObject>() {
                @Override
                public int compare(SoundObject soundObject, SoundObject t1) {
                    return soundObject.getItemName().compareTo(t1.getItemName());
                }
            }));
        }
        adapter.notifyDataSetChanged();
    }

    public void openA(int a){
        Intent intent = null;
        switch(a){
            case 1:
                intent = new Intent(this, MainActivity.class);
                break;
            case 2:
                intent = new Intent(this, FavoriteActivity.class);
                break;
            case 3:
                intent = new Intent(this, ActivityToutRecherche.class);
                break;
            case 4:
                intent = new Intent(this, YourSoundboxActivity.class);
                break;
            case 5:
                int c = 1+1;
                break;
            case 6:
                Toast.makeText(this, "Plusieurs catégories ayant le même thême sont regroupées ici.", Toast.LENGTH_SHORT).show();
                Toast.makeText(this, "En cliquant longtemps sur un son vous pouvez :", Toast.LENGTH_SHORT).show();
                Toast.makeText(this, "- Mettre un son en 'Coup de coeur'", Toast.LENGTH_SHORT).show();
                Toast.makeText(this, "- Partager un son avec vos amis", Toast.LENGTH_SHORT).show();
                Toast.makeText(this, "- Définir un son en sonnerie,réveil,alarme..", Toast.LENGTH_SHORT).show();
                Toast.makeText(this, "Vous devez accepter l'accès aux paramètres pour pouvoir définir un son et le partager (la demande d'accès se fait après l'installation).", Toast.LENGTH_LONG).show();
                break;
            case 7:
                intent = new Intent(this, ActivityPlaylist.class);
                break;
        }

        if(intent != null){
            startActivity(intent);
        }
    }


}
