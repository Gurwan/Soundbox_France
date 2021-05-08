/*
 * *******************************************************
 * Copyright (c) 2021. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance.adapters;

import android.annotation.SuppressLint;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import automation.test.soundboxfrance.R;
import automation.test.soundboxfrance.model.SoundObject;

public class DailyRecyclerAdapter extends RecyclerView.Adapter<DailyRecyclerAdapter.SoundboxViewHolder>{

    private final ArrayList<SoundObject> soundObjects;
    private final Integer[] images = {R.drawable.tempoimage,R.drawable.tempoimagebleu,R.drawable.tempoimagejaune,R.drawable.tempoimagerose,R.drawable.tempoimagevert,R.drawable.tempoimageviolet};

    public DailyRecyclerAdapter(ArrayList<SoundObject> soundObjects){
        this.soundObjects = soundObjects;
    }

    @NonNull
    @Override
    public SoundboxViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        @SuppressLint("InflateParams") View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.sound_daily_item, null);
        return new SoundboxViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull SoundboxViewHolder holder, int position) {
        final SoundObject object = soundObjects.get(position);

        holder.itemTextView.setText(object.getItemName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = new MediaPlayer();
                mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
                try {
                    mediaPlayer.setDataSource(object.getItemSon());
                    mediaPlayer.prepare();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                mediaPlayer.start();
                object.setEcoutes(object.getEcoutes()+1);
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("like",object.getLike());
                hashMap.put("name",object.getItemName());
                hashMap.put("son",object.getItemSon());
                hashMap.put("ecoutes",object.getEcoutes());

                DatabaseReference sound = FirebaseDatabase.getInstance().getReference().child("Sons");
                sound.child(object.getKey()).updateChildren(hashMap).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                    }
                });
            }
        });

        holder.imageViewitem.setImageResource(images[new Random().nextInt(images.length)]);
        holder.likeTextView.setText(Integer.toString(object.getLike()));

        holder.likeViewItem.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(final View view) {
                object.setLike(object.getLike()+1);
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("like",object.getLike());
                hashMap.put("name",object.getItemName());
                hashMap.put("son",object.getItemSon());
                hashMap.put("ecoutes",object.getEcoutes());

                DatabaseReference sound = FirebaseDatabase.getInstance().getReference().child("Sons");
                sound.child(object.getKey()).updateChildren(hashMap).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Toast.makeText(view.getContext(), "Tu as aimé ce son", Toast.LENGTH_SHORT).show();
                        view.setBackgroundResource(R.drawable.ic_baseline_thumb_up_alt_24_blue);
                        view.setEnabled(false);
                    }
                });
            }
        });
    }

    @Override
    public int getItemCount() {
        return soundObjects.size();
    }

    public static class SoundboxViewHolder extends RecyclerView.ViewHolder {
        TextView itemTextView;
        ImageView imageViewitem;
        Button likeViewItem;
        TextView likeTextView;

        public SoundboxViewHolder(View itemView) {
            super(itemView);
            itemTextView = itemView.findViewById(R.id.textViewItem);
            imageViewitem = itemView.findViewById(R.id.imageViewitem);
            likeViewItem = itemView.findViewById(R.id.ilikethissound);
            likeTextView = itemView.findViewById(R.id.textLikeView);
        }
    }
}
