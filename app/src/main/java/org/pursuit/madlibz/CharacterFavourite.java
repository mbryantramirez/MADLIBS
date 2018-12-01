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

public class CharacterFavourite extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_favourite);

        Random rnd = new Random();
        int color = Color.argb(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        findViewById(android.R.id.content).setBackgroundColor(color);

        ImageButton favouriteButton = findViewById(R.id.favourite_button);
        final EditText FAVOURITE_TEXT = findViewById(R.id.editText_favourite);

        final String name = getIntent().getStringExtra(MainQuestions.NAME);
        final String profession = getIntent().getStringExtra(MainQuestions.PROFESSION);

        favouriteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FavouriteTool.class);
                String favouriteMessage = FAVOURITE_TEXT.getText().toString();

                intent.putExtra(MainQuestions.FAVOURITE, favouriteMessage);
                intent.putExtra(MainQuestions.PROFESSION, profession);
                intent.putExtra(MainQuestions.NAME, name);
                startActivity(intent);

            }
        });


    }
}