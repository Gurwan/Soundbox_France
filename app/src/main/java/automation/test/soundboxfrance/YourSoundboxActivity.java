/*
 * *******************************************************
 * Copyright (c) 2020. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class YourSoundboxActivity extends AppCompatActivity {

    private static final String LOG_TAG = "YOURSOUNDBOXACTIVITY";
    ArrayList<SoundObject> customList = new ArrayList<>();

    RecyclerView customView;
    CustomRecyclerAdapter customAdapter = new CustomRecyclerAdapter(customList,this);
    RecyclerView.LayoutManager customLayoutManager;
    DatabaseHandler databaseHandler = new DatabaseHandler(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_soundbox);
        int pleinEcran = WindowManager.LayoutParams.FLAG_FULLSCREEN ; getWindow().setFlags(pleinEcran,pleinEcran);

        addDataToArrayList();
        customView = findViewById(R.id.customRecyclerView);
        customLayoutManager = new GridLayoutManager(this, 3);
        customView.setLayoutManager(customLayoutManager);
        customView.setAdapter(customAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.add_sound_menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem){
        if (menuItem.getItemId() == R.id.action_add) {
            Intent intent = new Intent(this, AddNewSoundActivity.class);
            startActivity(intent);
            return true;
        } else if (menuItem.getItemId() == R.id.action_clear) {
            databaseHandler.clearAllCustom(this);
            return true;
        } else if(menuItem.getItemId() == R.id.action_help){
            Toast.makeText(this, "Tu peux maintenant créer ta propre Soundbox ! ", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Pour ajouter un son il faut appuyer sur le +", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Pour supprimer un son il faut appuyer longtemps sur un son et pour supprimer tous les sons il faut appuyer sur la corbeille.", Toast.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        EventHandlerClass.releaseMediaPlayer();
    }

    private void addDataToArrayList(){
        customList.clear();
        Cursor cursor = databaseHandler.getCustom();
        if (cursor.getCount() == 0){
            Log.e(LOG_TAG, "Cursor is empty or failed to convert data");
            cursor.close();
        }
        while (cursor.moveToNext() ){
                String name = cursor.getString(cursor.getColumnIndex("customName"));
                Uri uriSound = Uri.parse(cursor.getString(cursor.getColumnIndex("customId")));
                customList.add(new SoundObject(name,uriSound));
                customAdapter.notifyDataSetChanged();
        }
        cursor.close();
    }
}