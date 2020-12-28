/*
 * *******************************************************
 * Copyright (c) 2020. Okaria Studio
 * ******************************************************
 */

package automation.test.soundboxfrance;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AddNewSoundActivity extends AppCompatActivity {

    EditText nameNewSound;
    Button loadNewSound;
    Button validationButton;
    SoundObject newSound;
    AwesomeValidation awesomeValidation;
    private static DatabaseHandler databaseHandler;
    Uri uriSound;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                this.uriSound = data.getData();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_sound);

        final Intent intent = new Intent(this, YourSoundboxActivity.class);

        databaseHandler = new DatabaseHandler(this);

        nameNewSound = findViewById(R.id.name_new_sound);
        loadNewSound = findViewById(R.id.load_new_sound);
        validationButton = findViewById(R.id.validation_button);

        loadNewSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent soundIntent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
                soundIntent.setType("audio/*");
                startActivityForResult(soundIntent,1);
            }
        });

        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);
        awesomeValidation.addValidation(this,R.id.name_new_sound, RegexTemplate.NOT_EMPTY,R.string.invalid_name);

        validationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(awesomeValidation.validate()){
                    newSound = new SoundObject(nameNewSound.getText().toString(),uriSound);
                    databaseHandler.addCustom(newSound);
                    startActivity(intent);
                }
            }
        });
    }
}