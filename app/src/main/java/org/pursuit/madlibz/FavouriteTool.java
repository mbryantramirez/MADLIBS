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

public class FavouriteTool extends AppCompatActivity {
    public static final String LOG_TAG = FavouriteTool.class.getSimpleName();
    public static final String EXTRA_MESSAGE = "org.pursuit.madlibz.extra.MESSAGE";
    private EditText mMessageEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite_tool);

        Random rnd = new Random();
        int color = Color.argb(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        findViewById(android.R.id.content).setBackgroundColor(color);

        ImageButton toolsButton = findViewById(R.id.imageButton_tool);\
        final EditText TOOLS_TEXT = findViewById(R.id.editText_tool);

        final String name = getIntent().getStringExtra(MainQuestions.NAME);
        final String profession = getIntent().getStringExtra(MainQuestions.PROFESSION);
        final String favourite = getIntent().getStringExtra(MainQuestions.FAVOURITE);


        toolsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FavouriteTool.class);
                String toolsMessage = TOOLS_TEXT.getText().toString();

                intent.putExtra(MainQuestions.FAVOURITE, favourite);
                intent.putExtra(MainQuestions.PROFESSION, profession);
                intent.putExtra(MainQuestions.NAME, name);
                startActivity(intent);

            }
        });
    }


}
