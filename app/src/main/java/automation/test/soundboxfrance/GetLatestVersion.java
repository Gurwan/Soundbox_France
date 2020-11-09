/*
 * *******************************************************
 * Copyright (c) 2020. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;

import org.jsoup.Jsoup;

import java.io.IOException;

public class GetLatestVersion extends AsyncTask<String,Void,String> {
    String latestV,currentV;
    @SuppressLint("StaticFieldLeak")
    MainActivity mainActivity;

    public GetLatestVersion(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }

    @Override
    protected String doInBackground(String... strings) {
        try{
            latestV = Jsoup
                    .connect("https://play.google.com/store/apps/details?id=automation.test.soundboxfrance")
                    .timeout(30000)
                    .get()
                    .select("div.hAyfc:nth-child(4)>"+"span:nth-child(2) > div:nth-child(1)"+"> span:nth-child(1) ")
                    .first()
                    .ownText();
        } catch(IOException e){
            e.printStackTrace();
        }
        return latestV;
    }

    @Override
    protected void onPostExecute(String s){
        currentV = BuildConfig.VERSION_NAME;
        if(latestV!=null){
            currentV = currentV.replaceAll("\\.","");
            latestV = latestV.replaceAll("\\.","");
            int fCurrent = Integer.parseInt(currentV);
            int fLatest = Integer.parseInt(latestV);
            if(fLatest>fCurrent){
                proposeNewVersion();
            }
        }
    }

    private void proposeNewVersion(){
        AlertDialog.Builder builder = new AlertDialog.Builder(mainActivity);
        builder.setTitle("Soundbox France");
        builder.setMessage("Une nouvelle version de Soundbox France est disponible !! \n Télécharger dès maintenant la mise à jour");
        builder.setCancelable(false);
        builder.setPositiveButton("Mettre à jour", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                mainActivity.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=automation.test.soundboxfrance")));
                dialogInterface.dismiss();
            }
        });

        builder.setNegativeButton("Plus tard", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        builder.show();
    }
}
