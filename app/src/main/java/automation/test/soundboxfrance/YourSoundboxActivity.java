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

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class YourSoundboxActivity extends AppCompatActivity {

    private static final String LOG_TAG = "YOURSOUNDBOXACTIVITY";
    ArrayList<SoundObject> customList = new ArrayList<>();

    RecyclerView CustomView;
    CustomRecyclerAdapter CustomAdapter = new CustomRecyclerAdapter(customList,this);
    RecyclerView.LayoutManager CustomLayoutManager;
    DatabaseHandler databaseHandler = new DatabaseHandler(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_soundbox);
        int pleinEcran = WindowManager.LayoutParams.FLAG_FULLSCREEN ; getWindow().setFlags(pleinEcran,pleinEcran);

        addDataToArrayList();

        CustomView = findViewById(R.id.customRecyclerView);

        CustomLayoutManager = new GridLayoutManager(this, 3);

        CustomView.setLayoutManager(CustomLayoutManager);

        CustomView.setAdapter(CustomAdapter);
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
        }

        if (menuItem.getItemId() == R.id.action_clear) {
            databaseHandler.clearAllCustom(this);
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
                CustomAdapter.notifyDataSetChanged();
        }
        cursor.close();

    }

}