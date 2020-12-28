/*
 * *******************************************************
 * Copyright (c) 2020. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomRecyclerAdapter extends RecyclerView.Adapter<CustomRecyclerAdapter.SoundboxViewHolder>{

    private ArrayList<SoundObject> soundObjects;
    private Integer[] images = {R.drawable.tempoimage,R.drawable.tempoimagebleu,R.drawable.tempoimagejaune,R.drawable.tempoimagerose,R.drawable.tempoimagevert,R.drawable.tempoimageviolet};

    public CustomRecyclerAdapter(ArrayList<SoundObject> soundObjects, YourSoundboxActivity yourSoundboxActivity){
        this.soundObjects = soundObjects;
    }

    @NonNull
    @Override
    public SoundboxViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        @SuppressLint("InflateParams") View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.sound_custom_item, null);
        return new SoundboxViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull SoundboxViewHolder holder, int position) {
        final SoundObject object = soundObjects.get(position);
        final Uri soundID = object.getItemUri();

        holder.itemTextView.setText(object.getItemName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = new MediaPlayer();
                mediaPlayer.setAudioAttributes(
                        new AudioAttributes.Builder()
                                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                                .setUsage(AudioAttributes.USAGE_MEDIA)
                                .build()
                );
                try {
                    mediaPlayer.setDataSource(v.getContext(), soundID);
                    mediaPlayer.prepare();
                    mediaPlayer.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                EventHandlerClass.customManager(v, object);
                return true;
            }
        });

        holder.imageViewitem.setImageResource(images[new Random().nextInt(images.length)]);
    }

    @Override
    public int getItemCount() {
        return soundObjects.size();
    }

    public void updateList(ArrayList<SoundObject> newList){
        soundObjects = new ArrayList<>();
        soundObjects.addAll(newList);
        notifyDataSetChanged();
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
}
