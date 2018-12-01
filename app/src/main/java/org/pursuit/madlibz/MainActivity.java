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

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rnd = new Random();
        int color = Color.argb(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        findViewById(android.R.id.content).setBackgroundColor(color);

        ImageButton nameButton = findViewById(R.id.imageButton2);
        final EditText NAME_TEXT = findViewById(R.id.editText);

        nameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CharacterProfession.class);
                String nameMessage = NAME_TEXT.getText().toString();
                intent.putExtra(MainQuestions.NAME, nameMessage);
                startActivity(intent);

            }
        });

    }
}
