/*
 * *******************************************************
 * Copyright (c) 2021. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class DailySoundboxActivity extends AppCompatActivity {

    ArrayList<SoundObject> dailyList = new ArrayList<>();
    RecyclerView DailyView;
    DailyRecyclerAdapter DailyAdapter = new DailyRecyclerAdapter(dailyList);
    RecyclerView.LayoutManager DailyLayoutManager;
    int az = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_soundbox);
        int pleinEcran = WindowManager.LayoutParams.FLAG_FULLSCREEN ; getWindow().setFlags(pleinEcran,pleinEcran);

        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference().child("Sons");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                dailyList.clear();
                for(DataSnapshot snap : snapshot.getChildren()){
                    SoundObject s;
                    String son = snap.child("son").getValue().toString();
                    String name = snap.child("name").getValue().toString();
                    Integer like = Integer.valueOf(snap.child("like").getValue().toString());
                    if(snap.child("ecoutes").getValue()!=null){
                        Integer ecoutes = Integer.valueOf(snap.child("ecoutes").getValue().toString());
                        s = new SoundObject(name,son,snap.getKey(),like,ecoutes);
                    } else {
                        s = new SoundObject(name,son,snap.getKey(),like);
                    }

                    dailyList.add(s);
                    DailyAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {}
        });

        DailyView = findViewById(R.id.dailyRecyclerView);
        DailyLayoutManager = new GridLayoutManager(this, 1);
        DailyView.setLayoutManager(DailyLayoutManager);
        DailyView.setAdapter(DailyAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.daily_menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem){
        if (menuItem.getItemId() == R.id.action_propose) {
            openPropose();
            return true;
        } else if(menuItem.getItemId() == R.id.action_help){
            Toast.makeText(this, "Tu peux maintenant voter pour les prochains sons qui intégreront la soundbox ! ", Toast.LENGTH_LONG).show();
            Toast.makeText(this, "Attention un like est définitif et ne peux pas être retiré. ", Toast.LENGTH_LONG).show();
            Toast.makeText(this, "Les sons s'actualisent tous les jours et les sons les plus likés seront intégrés dans la prochaine mise à jour. ", Toast.LENGTH_LONG).show();
            return true;
        } else if(menuItem.getItemId() == R.id.action_sort){
            if(az!=0){
                Collections.sort(dailyList, new Comparator<SoundObject>() {
                    @Override
                    public int compare(SoundObject soundObject, SoundObject t1) {
                        return soundObject.getItemName().compareTo(t1.getItemName());
                    }
                });
                az = 0;
            } else {
                Collections.sort(dailyList, Collections.reverseOrder(new Comparator<SoundObject>() {
                    @Override
                    public int compare(SoundObject soundObject, SoundObject t1) {
                        return soundObject.getItemName().compareTo(t1.getItemName());
                    }
                }));
                az = 1;
            }
            DailyAdapter.notifyDataSetChanged();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        EventHandlerClass.releaseMediaPlayer();
    }

    public void openPropose() {
        String urlpropose = "https://docs.google.com/forms/d/e/1FAIpQLScSp4fVFHqFRI9zNGWaD_Lcn2PJACyLlVHeGr2ASq4rhg1kfg/viewform";
        Intent gm = new Intent(Intent.ACTION_VIEW);
        gm.setData(Uri.parse(urlpropose));
        startActivity(gm);
    }

}