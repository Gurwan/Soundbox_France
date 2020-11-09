/*
 * *******************************************************
 * Copyright (c) 2020. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance.categories;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
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

    public SuperFragment(AppCompatActivity mainActivity){
        SoundAdapter = new SoundboxRecyclerAdapter(soundList,mainActivity);
    }

    public SuperFragment(){}

    public void before(LayoutInflater inflater, ViewGroup container){
        view = inflater.inflate(R.layout.activity_categories,container,false);
    }

    public void after(){
        for(int i = 0; i < soundID.length ; i++){
            soundList.add(new SoundObject(nameList.get(i),soundID[i],soundImage[i]));
        }
        SoundView = view.findViewById(R.id.soundboxRecyclerView);

        SoundLayoutManager = new GridLayoutManager(getActivity(),3);

        SoundView.setLayoutManager(SoundLayoutManager);

        SoundView.setAdapter(SoundAdapter);

        SoundView.setNestedScrollingEnabled(false);
    }
}
