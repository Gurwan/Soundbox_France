/*
 * *******************************************************
 * Copyright (c) 2021. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance.categories;

import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import automation.test.soundboxfrance.Category;
import automation.test.soundboxfrance.DatabaseHandler;
import automation.test.soundboxfrance.R;
import automation.test.soundboxfrance.SoundObject;
import automation.test.soundboxfrance.SoundboxRecyclerAdapter;

class SuperFragment extends Fragment {
    ArrayList<SoundObject> soundList = new ArrayList<>();

    RecyclerView SoundView;
    SoundboxRecyclerAdapter SoundAdapter;
    RecyclerView.LayoutManager SoundLayoutManager;
    View view;
    Integer[] soundID;
    Integer[] soundImage;
    List<String> nameList;
    int az = -1;

    public SuperFragment(AppCompatActivity mainActivity){
        SoundAdapter = new SoundboxRecyclerAdapter(soundList,mainActivity);
    }

    public SuperFragment(){}

    public void all(LayoutInflater inflater, ViewGroup container,String s){
        view = inflater.inflate(R.layout.activity_categories,container,false);
        DatabaseHandler databaseHandler = new DatabaseHandler(this.getContext());
        Cursor cursor = databaseHandler.getSoundCollectionCategory(s);
        while(cursor.moveToNext()){
            String name = cursor.getString(cursor.getColumnIndex("mainName"));
            Integer sound = cursor.getInt(cursor.getColumnIndex("mainSound"));
            Integer image = cursor.getInt(cursor.getColumnIndex("mainImage"));
            this.soundList.add(new SoundObject(name,sound,image));
        }
        this.SoundAdapter.notifyDataSetChanged();
        cursor.close();
        SoundView = view.findViewById(R.id.soundboxRecyclerView);
        SoundLayoutManager = new GridLayoutManager(getActivity(),3);
        SoundView.setLayoutManager(SoundLayoutManager);
        SoundView.setAdapter(SoundAdapter);
        SoundView.setNestedScrollingEnabled(false);
    }

    public int getAz() {
        int ret = -1;
        if(az!=0){
            ret = az;
            az = 0;
        } else {
            ret = az;
            az = 1;
        }
        return ret;
    }
}
