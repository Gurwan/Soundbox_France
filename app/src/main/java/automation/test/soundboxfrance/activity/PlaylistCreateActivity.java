/*
 * *******************************************************
 * Copyright (c) 2021. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import automation.test.soundboxfrance.DatabaseHandler;
import automation.test.soundboxfrance.R;
import automation.test.soundboxfrance.model.Playlist;

public class PlaylistCreateActivity extends AppCompatActivity {

    private EditText nom;
    private Button validate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist_create);

        nom = findViewById(R.id.playlistNameEdit);
        validate = findViewById(R.id.validateCreatePlaylist);
        validate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nom.getText().toString().length()>0){
                    Playlist playlist = new Playlist(nom.getText().toString());
                    finish(playlist);
                }
            }
        });
    }

    private void finish(Playlist playlist){
        DatabaseHandler databaseHandler = new DatabaseHandler(this);
        databaseHandler.addPlaylist(playlist.getName());
        Intent intent = new Intent(this,ActivityPlaylist.class);
        startActivity(intent);
    }
}