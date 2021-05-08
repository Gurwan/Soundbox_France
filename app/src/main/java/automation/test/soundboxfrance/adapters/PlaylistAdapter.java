/*
 * *******************************************************
 * Copyright (c) 2021. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import automation.test.soundboxfrance.model.Playlist;
import automation.test.soundboxfrance.R;

public class PlaylistAdapter extends BaseAdapter {

    private List<Playlist> playlistList;
    private Context context;
    private LayoutInflater inflater;

    public PlaylistAdapter(Context context,List<Playlist> playlists){
        this.context = context;
        this.playlistList = playlists;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return playlistList.size();
    }

    @Override
    public Object getItem(int i) {
        return playlistList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v;

        if(view == null){
            v = inflater.inflate(R.layout.playlist_item,viewGroup,false);
        } else {
            v = view;
        }

        TextView textView = v.findViewById(R.id.name_playlist);
        textView.setText(playlistList.get(i).getName());

        return v;
    }
}
