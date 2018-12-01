package org.pursuit.madlibz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.Random;

public class CharacterProfession extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_profession);

        Random rnd = new Random();
        int color = Color.argb(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        findViewById(android.R.id.content).setBackgroundColor(color);

        ImageButton professionButton = findViewById(R.id.imageButton_profession);
        final EditText PROFESSION_TEXT = findViewById(R.id.editText_profession);
        final String name = getIntent().getStringExtra(MainQuestions.NAME);

        professionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CharacterFavourite.class);
                String professionMessage = PROFESSION_TEXT.getText().toString();

                intent.putExtra(MainQuestions.PROFESSION,professionMessage);
                intent.putExtra(MainQuestions.NAME, name);
                startActivity(intent);

            }
        });



    }
}