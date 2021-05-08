/*
 * *******************************************************
 * Copyright (c) 2021. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import automation.test.soundboxfrance.R;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        int pleinEcran = WindowManager.LayoutParams.FLAG_FULLSCREEN ; getWindow().setFlags(pleinEcran,pleinEcran);

        Button buttonHome = findViewById(R.id.button_home);
        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(1);
            }
        });

        Button buttonFav = findViewById(R.id.button_fav);
        buttonFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(2);
            }
        });

        Button buttonSearch = findViewById(R.id.button_search);
        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(3);
            }
        });

        Button buttonYourSoundbox = findViewById(R.id.button_yoursoundbox);
        buttonYourSoundbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(4);
            }
        });

        Button buttonPlaylist = findViewById(R.id.button_playlist);
        buttonPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(5);
            }
        });

        Button buttonTwitter = findViewById(R.id.twitter_button);
        buttonTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(6);
            }
        });

        Button buttonMail = findViewById(R.id.mail_button);
        buttonMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(7);
            }
        });

        Button buttonProposerSon = findViewById(R.id.proposer_son_button);
        buttonProposerSon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(8);
            }
        });

        Button buttonAvis = findViewById(R.id.laisser_un_avis);
        buttonAvis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openA(9);
            }
        });
    }

    private void openA(int i) {
        Intent intent = null;
        switch(i){
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
                intent = new Intent(this,ActivityPlaylist.class);
                break;
            case 6:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://twitter.com/OkariaStudio"));
                break;
            case 7:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("mailto:okariastudio@gmail.com"));
                break;
            case 8:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLScSp4fVFHqFRI9zNGWaD_Lcn2PJACyLlVHeGr2ASq4rhg1kfg/viewform"));
                break;
            case 9:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://play.google.com/store/apps/details?id=automation.test.soundboxfrance"));
                break;

        }
        startActivity(intent);
        if(i<6){
            overridePendingTransition(R.anim.slide_left, R.anim.slide_right_2);
        } else {
            overridePendingTransition(R.anim.slide_right, R.anim.slide_left_2);

        }
    }
}