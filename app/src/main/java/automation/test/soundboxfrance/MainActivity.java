/*
 * *******************************************************
 * Copyright (c) 2020. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import automation.test.soundboxfrance.categories.FilmsTVActivity;
import automation.test.soundboxfrance.categories.GeneriquesActivity;
import automation.test.soundboxfrance.categories.JVActivity;
import automation.test.soundboxfrance.categories.MemeActivity;
import automation.test.soundboxfrance.categories.MusicFragment;
import automation.test.soundboxfrance.categories.MusiqueRapAutres;
import automation.test.soundboxfrance.categories.NewsFragment;
import automation.test.soundboxfrance.categories.SportPoliHumActivity;
import automation.test.soundboxfrance.categories.TVActivity;
import automation.test.soundboxfrance.categories.ThemeActivity;

public class MainActivity extends AppCompatActivity {
    private ActionBarDrawerToggle mToggle;

    String urlprop = "http://play.google.com/store/apps/details?id=automation.test.soundboxfrance";
    String urltw = "https://twitter.com/OkariaStudio";
    String urlmail = "mailto:okariastudio@gmail.com";
    String urlpropose = "https://docs.google.com/forms/d/e/1FAIpQLScSp4fVFHqFRI9zNGWaD_Lcn2PJACyLlVHeGr2ASq4rhg1kfg/viewform";
    private InterstitialAd pubfav;
    private InterstitialAd pubrecherche;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int pleinEcran = WindowManager.LayoutParams.FLAG_FULLSCREEN;
        getWindow().setFlags(pleinEcran, pleinEcran);

        Button ButtonFav = findViewById(R.id.coupdecoeurButton);
        ButtonFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFav();
            }
        });


        Button ButtonRecherche = findViewById(R.id.rechercheButton);
        ButtonRecherche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRecherche();
            }
        });

        Button ButtonNoteLappli = findViewById(R.id.noteButton);
        ButtonNoteLappli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNoteLappli();
            }
        });


        Button ButtonPropose = findViewById(R.id.proposeButton);
        ButtonPropose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPropose();
            }
        });


        Button InternetYtbButton = findViewById(R.id.internetytbButton);
        InternetYtbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMeme();
            }
        });

        Button SportHumourPolitiqueButton = findViewById(R.id.sporthumourpolitiqueButton);
        SportHumourPolitiqueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSportPolitiqueHumour();
            }
        });

        Button MusicButton = findViewById(R.id.musictrenteButton);
        MusicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMusic();
            }
        });

        Button MusicRapButton = findViewById(R.id.musicRapButton);
        MusicRapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMusicRap();
            }
        });

        Button FilmsButton = findViewById(R.id.filmsButton);
        FilmsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFilmsTV();
            }
        });

        Button TVButton = findViewById(R.id.tvButton);
        TVButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTV();
            }
        });

        Button JVButton = findViewById(R.id.jvButton);
        JVButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openJV();
            }
        });

        Button ThemeButton = findViewById(R.id.themeButton);
        ThemeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTheme();
            }
        });

        Button GeneriquesButton = findViewById(R.id.generiqueButton);
        GeneriquesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGeneriques();
            }
        });

        Button NouveautesButton = findViewById(R.id.nouveautesButton);
        NouveautesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNouveautes();
            }
        });

        Button YourSoundboxButton = findViewById(R.id.yoursoundboxButton);
        YourSoundboxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openYourSoundbox();
            }
        });

        requestPermissions();
    }




    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void openFav() {
        Intent intent = new Intent(this, FavoriteActivity.class);
        startActivity(intent);
    }

    private void openYourSoundbox() {
        Intent intent = new Intent(this, YourSoundboxActivity.class);
        startActivity(intent);
    }

    public void openRecherche() {
        Intent intent = new Intent(this, ActivityToutRecherche.class);
        startActivity(intent);
    }

    public void openMeme() {
        Intent intent = new Intent(this, MemeActivity.class);
        startActivity(intent);
    }

    public void openSportPolitiqueHumour() {
        startActivity(intent);
    }

    public void openMusic() {
        Intent intent = new Intent(this, MusicFragment.class);
        startActivity(intent);
    }

    public void openMusicRap() {
        Intent intent = new Intent(this, MusiqueRapAutres.class);
        startActivity(intent);
    }

    public void openFilmsTV() {
        Intent intent = new Intent(this, FilmsTVActivity.class);
        startActivity(intent);
    }

    public void openTV() {
        Intent intent = new Intent(this, TVActivity.class);
        startActivity(intent);
    }

    public void openJV() {
        Intent intent = new Intent(this, JVActivity.class);
        startActivity(intent);
    }

    public void openTheme() {
        Intent intent = new Intent(this, ThemeActivity.class);
        startActivity(intent);
    }

    public void openGeneriques() {
        Intent intent = new Intent(this, GeneriquesActivity.class);
        startActivity(intent);
    }

    public void openNouveautes() {
        Intent intent = new Intent(this, NewsFragment.class);
        startActivity(intent);
    }

    public void openNoteLappli() {
        Intent prop = new Intent(Intent.ACTION_VIEW);
        prop.setData(Uri.parse(urlprop));
        startActivity(prop);

    }

    public void openPropose() {
        Intent gm = new Intent(Intent.ACTION_VIEW);
        gm.setData(Uri.parse(urlpropose));
        startActivity(gm);
    }

    private void requestPermissions() {

        final ConstraintLayout relativeLayout = findViewById(R.id.activity_main);

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 0);
        }

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_SETTINGS) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.WRITE_SETTINGS}, 0);
        }

        if (!(Settings.System.canWrite(this))) {

            Snackbar.make(relativeLayout, "L'application a besoin d'avoir accès à vos paramètres pour que vous puissiez changer de sonnerie", Snackbar.LENGTH_INDEFINITE).setAction("OK",
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            Context context = view.getContext();
                            Intent intent = new Intent(Settings.ACTION_MANAGE_WRITE_SETTINGS);
                            intent.setData(Uri.parse("package:" + context.getPackageName()));
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            startActivity(intent);
                        }
                    }).show();
        }


    }

    Boolean doubleBackPressed = false;

    public void onBackPressed() {
        if (doubleBackPressed) {
            super.onBackPressed();

        } else {
            doubleBackPressed = true;
            final ConstraintLayout relativeLayout = findViewById(R.id.activity_main);

            Snackbar.make(relativeLayout, getString(R.string.back), Snackbar.LENGTH_SHORT).show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    doubleBackPressed = false;
                }
            }, 2000);
        }
    }

}

