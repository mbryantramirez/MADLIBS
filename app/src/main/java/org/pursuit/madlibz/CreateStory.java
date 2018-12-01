package org.pursuit.madlibz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;

import java.util.Random;

public class CreateStory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_story);
        Random rnd = new Random();
        int color = Color.argb(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        findViewById(android.R.id.content).setBackgroundColor(color);
        Intent intent = getIntent();
        String message = intent.getStringExtra(Reward.EXTRA_MESSAGE);
        String message1 = intent.getStringExtra(Reward.EXTRA_MESSAGE1);
        String message2 = intent.getStringExtra(Reward.EXTRA_MESSAGE2);
        String message3 = intent.getStringExtra(Reward.EXTRA_MESSAGE3);
        String message4 = intent.getStringExtra(Reward.EXTRA_MESSAGE4);
        String message5 = intent.getStringExtra(Reward.EXTRA_MESSAGE5);
        String message6 = intent.getStringExtra(Reward.EXTRA_MESSAGE6);


        TextView textView = findViewById(R.id.editText2);
        textView.setText(message);
        textView.setText(message1);





    }
}
