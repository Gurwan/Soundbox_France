/*
 * *******************************************************
 * Copyright (c) 2020. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance.categories;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.widget.ViewPager2;
import automation.test.soundboxfrance.ActivityToutRecherche;
import automation.test.soundboxfrance.FavoriteActivity;
import automation.test.soundboxfrance.MainActivity;
import automation.test.soundboxfrance.R;
import automation.test.soundboxfrance.adapters.ViewPagerAdapter;

class SuperActivity extends AppCompatActivity {
    protected final static String URLPROP = "http://play.google.com/store/apps/details?id=automation.test.soundboxfrance";
    protected final static String URLTW = "https://twitter.com/OkariaStudio";
    protected final static String URLMAIL = "mailto:okariastudio@gmail.com";
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
        appBarLayout = findViewById(R.id.appbar);
        tabLayout = findViewById(R.id.tablayoutmusic);
        viewPager = findViewById(R.id.viewpagermusic);

        pubfav = new InterstitialAd(this);
        pubfav.setAdUnitId("ca-app-pub-3066536602388745/9205460152");
        pubfav.loadAd(new AdRequest.Builder().build());

        pubrecherche = new InterstitialAd(this);
        pubrecherche.setAdUnitId("ca-app-pub-3066536602388745/6536733088");
        pubrecherche.loadAd(new AdRequest.Builder().build());
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

        Button ButtonFav = findViewById(R.id.button_fav);
        ButtonFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pubfav.loadAd(new AdRequest.Builder().build());
                openFav();
            }
        });

        Button ButtonRecherche = findViewById(R.id.button_search);
        ButtonRecherche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pubrecherche.loadAd(new AdRequest.Builder().build());
                openRecherche();
            }
        });

        Button ButtonNoteLappli = findViewById(R.id.button_note);
        ButtonNoteLappli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNoteLappli();
            }
        });

        Button ButtonTwitter = findViewById(R.id.button_twitter);
        ButtonTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTwitter();
            }
        });

        Button ButtonMail = findViewById(R.id.button_mail);
        ButtonMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMail();
            }
        });

        Button ButtonPropose = findViewById(R.id.button_propose);
        ButtonPropose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPropose();
            }
        });

        Button ButtonHome = findViewById(R.id.button_home);
        ButtonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHome();
            }
        });

        Button ButtonHelp = findViewById(R.id.button_help);
        ButtonHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHelp();
            }
        });
    }

    public void openFav() {
        pubfav.loadAd(new AdRequest.Builder().build());
        Intent intent = new Intent(this, FavoriteActivity.class);
        if (pubfav.isLoaded()) {
            pubfav.show();
        } else {
            startActivity(intent);
        }
    }

    public void openRecherche() {
        pubrecherche.loadAd(new AdRequest.Builder().build());
        Intent intent = new Intent(this, ActivityToutRecherche.class);
        if (pubrecherche.isLoaded()) {
            pubrecherche.show();
        } else {
            startActivity(intent);
        }
    }

    public void openNoteLappli() {
        Intent prop = new Intent(Intent.ACTION_VIEW);
        prop.setData(Uri.parse(URLPROP));
        startActivity(prop);

    }

    public void openTwitter() {
        Intent tw = new Intent(Intent.ACTION_VIEW);
        tw.setData(Uri.parse(URLTW));
        startActivity(tw);
    }

    public void openMail() {
        Intent gm = new Intent(Intent.ACTION_VIEW);
        gm.setData(Uri.parse(URLMAIL));
        startActivity(gm);
    }

    public void openPropose() {
        Intent gm = new Intent(Intent.ACTION_VIEW);
        gm.setData(Uri.parse(URLPROPOSE));
        startActivity(gm);
    }

    public void openHelp() {
        Toast.makeText(this, "Plusieurs catégories ayant le même thême sont regroupées ici.", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "En cliquant longtemps sur un son vous pouvez :", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "- Mettre un son en 'Coup de coeur'", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "- Partager un son avec vos amis", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "- Définir un son en sonnerie,réveil,alarme..", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Vous devez accepter l'accès aux paramètres pour pouvoir définir un son et le partager (la demande d'accès se fait après l'installation).", Toast.LENGTH_LONG).show();
    }

    public void openHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
