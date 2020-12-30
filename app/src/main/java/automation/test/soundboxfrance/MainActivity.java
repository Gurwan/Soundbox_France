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
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
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
    String urlprop = "http://play.google.com/store/apps/details?id=automation.test.soundboxfrance";
    String urlpropose = "https://docs.google.com/forms/d/e/1FAIpQLScSp4fVFHqFRI9zNGWaD_Lcn2PJACyLlVHeGr2ASq4rhg1kfg/viewform";

    boolean doubleBackPressed = false;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int pleinEcran = WindowManager.LayoutParams.FLAG_FULLSCREEN;
        getWindow().setFlags(pleinEcran, pleinEcran);

        Button buttonFav = findViewById(R.id.coupdecoeurButton);
        buttonFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(14);
            }
        });

        Button buttonRecherche = findViewById(R.id.rechercheButton);
        buttonRecherche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(13);
            }
        });

        Button buttonNoteLappli = findViewById(R.id.noteButton);
        buttonNoteLappli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(16);
            }
        });

        Button buttonPropose = findViewById(R.id.proposeButton);
        buttonPropose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(15);
            }
        });

        Button internetYtbButton = findViewById(R.id.internetytbButton);
        internetYtbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Les mêmes sont en train de charger. Patientez quelques secondes", Toast.LENGTH_SHORT).show();
                openA(3);
            }
        });

        Button sportHumourPolitiqueButton = findViewById(R.id.sporthumourpolitiqueButton);
        sportHumourPolitiqueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Les sons sont en train de charger. Patientez quelques secondes", Toast.LENGTH_SHORT).show();
                openA(4);
            }
        });

        Button musicButton = findViewById(R.id.musictrenteButton);
        musicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Les musiques sont en train de charger. Patientez quelques secondes", Toast.LENGTH_SHORT).show();
                openA(8);
            }
        });

        Button musicRapButton = findViewById(R.id.musicRapButton);
        musicRapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Les musiques sont en train de charger. Patientez quelques secondes", Toast.LENGTH_SHORT).show();
                openA(9);
            }
        });

        Button filmsButton = findViewById(R.id.filmsButton);
        filmsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Les films sont en train de charger. Patientez quelques secondes", Toast.LENGTH_SHORT).show();
                openA(5);
            }
        });

        Button tvButton = findViewById(R.id.tvButton);
        tvButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Les sons sont en train de charger. Patientez quelques secondes", Toast.LENGTH_SHORT).show();
                openA(6);
            }
        });

        Button jvButton = findViewById(R.id.jvButton);
        jvButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Les sons sont en train de charger. Patientez quelques secondes", Toast.LENGTH_SHORT).show();
                openA(7);
            }
        });

        Button themeButton = findViewById(R.id.themeButton);
        themeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Les sons sont en train de charger. Patientez quelques secondes", Toast.LENGTH_SHORT).show();
                openA(11);
            }
        });

        Button generiquesButton = findViewById(R.id.generiqueButton);
        generiquesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Les génériques sont en train de charger. Patientez quelques secondes", Toast.LENGTH_SHORT).show();
                openA(10);
            }
        });

        Button nouveautesButton = findViewById(R.id.nouveautesButton);
        nouveautesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(12);
            }
        });

        Button yourSoundboxButton = findViewById(R.id.yoursoundboxButton);
        yourSoundboxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(1);
            }
        });

        Button dailySoundbox = findViewById(R.id.dailysoundbox);
        dailySoundbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(2);
            }
        });
        requestPermissions();
    }

    public void openA(int a){
        Intent intent = null;
        switch(a){
            case 1:
                intent = new Intent(this, YourSoundboxActivity.class);
                break;
            case 2:
                intent = new Intent(this, DailySoundboxActivity.class);
                break;
            case 3:
                intent = new Intent(this, MemeActivity.class);
                break;
            case 4:
                intent = new Intent(this, SportPoliHumActivity.class);
                break;
            case 5:
                intent = new Intent(this, FilmsTVActivity.class);
                break;
            case 6:
                intent = new Intent(this, TVActivity.class);
                break;
            case 7:
                intent = new Intent(this, JVActivity.class);
                break;
            case 8:
                intent = new Intent(this, MusicFragment.class);
                break;
            case 9:
                intent = new Intent(this, MusiqueRapAutres.class);
                break;
            case 10:
                intent = new Intent(this, GeneriquesActivity.class);
                break;
            case 11:
                intent = new Intent(this, ThemeActivity.class);
                break;
            case 12:
                intent = new Intent(this, NewsFragment.class);
                break;
            case 13:
                intent = new Intent(this, ActivityToutRecherche.class);
                break;
            case 14:
                intent = new Intent(this, FavoriteActivity.class);
                break;
            case 15:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(urlpropose));
                break;
            case 16:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(urlprop));
                break;
            }
            startActivity(intent);
        }
    }

    private void requestPermissions() {

        final ConstraintLayout constraintLayout = findViewById(R.id.activity_main);

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 0);
        }

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_SETTINGS) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.WRITE_SETTINGS}, 0);
        }

        if (!(Settings.System.canWrite(this))) {

            Snackbar.make(constraintLayout, "L'application a besoin d'avoir accès à vos paramètres pour que vous puissiez changer de sonnerie", Snackbar.LENGTH_INDEFINITE).setAction("OK",
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

    public void onBackPressed() {
        if (doubleBackPressed) {
            super.onBackPressed();
        } else {
            doubleBackPressed = true;
            final ConstraintLayout constraintLayout = findViewById(R.id.activity_main);
            Snackbar.make(constraintLayout, getString(R.string.back), Snackbar.LENGTH_SHORT).show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    doubleBackPressed = false;
                }
            }, 2000);
        }
    }

}

