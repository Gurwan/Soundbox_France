/*
 * *******************************************************
 * Copyright (c) 2020. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class SoundboxRecyclerAdapter extends RecyclerView.Adapter<SoundboxRecyclerAdapter.SoundboxViewHolder>{

    private ArrayList<SoundObject> soundObjects;
    private final boolean longClickFav;

    public SoundboxRecyclerAdapter(ArrayList<SoundObject> soundObjects){
        this.soundObjects = soundObjects;
        this.longClickFav = true;
    }

    public SoundboxRecyclerAdapter(ArrayList<SoundObject> soundObjects, AppCompatActivity mainActivity){
        this.soundObjects = soundObjects;
        this.longClickFav = true;
    }

    public SoundboxRecyclerAdapter(ArrayList<SoundObject> soundObjects, FavoriteActivity activity){
        this.soundObjects = soundObjects;
        this.longClickFav = false;
    }

    @NonNull
    @Override
    public SoundboxViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        @SuppressLint("InflateParams") View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.sound_item, null);
        return new SoundboxViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SoundboxViewHolder holder, int position) {
        if(pubmin != null) {
            pubmin.loadAd(new AdRequest.Builder().build());
        }

        final SoundObject object = soundObjects.get(position);
        final Integer soundID = object.getItemID();

        holder.itemTextView.setText(object.getItemName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventHandlerClass.startMediaPlayer(v, soundID);
                
            }
        });

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(longClickFav) {
                    EventHandlerClass.popupManager(v, object);
                }else{
                    EventHandlerClass.popupManagerFav(v, object);
                }
                return true;
            }
        });

        holder.imageViewitem.setImageResource(object.getItemImage());
    }

    @Override
    public int getItemCount() {
        return soundObjects.size();
    }

    public static class SoundboxViewHolder extends RecyclerView.ViewHolder {

        TextView itemTextView;
        ImageView imageViewitem;

        public SoundboxViewHolder(View itemView) {
            super(itemView);
            itemTextView = itemView.findViewById(R.id.textViewItem);
            imageViewitem = itemView.findViewById(R.id.imageViewitem);
        }
    }

    public void updateList(ArrayList<SoundObject> newList){
        soundObjects = new ArrayList<>();
        soundObjects.addAll(newList);
        notifyDataSetChanged();
    }
}
