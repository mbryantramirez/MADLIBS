package org.pursuit.madlibz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Reward extends AppCompatActivity {
    public static final String LOG_TAG = SomethingDelicious.class.getSimpleName();
    public static final String EXTRA_MESSAGE = "org.pursuit.madlibz.extra.MESSAGE";
    public static final String EXTRA_MESSAGE1 = "org.pursuit.madlibz.extra.MESSAGE";
    public static final String EXTRA_MESSAGE2 = "org.pursuit.madlibz.extra.MESSAGE";
    public static final String EXTRA_MESSAGE3 = "org.pursuit.madlibz.extra.MESSAGE";
    public static final String EXTRA_MESSAGE4 = "org.pursuit.madlibz.extra.MESSAGE";
    public static final String EXTRA_MESSAGE5 = "org.pursuit.madlibz.extra.MESSAGE";
    public static final String EXTRA_MESSAGE6 = "org.pursuit.madlibz.extra.MESSAGE";
    public static final String EXTRA_MESSAGE7 = "org.pursuit.madlibz.extra.MESSAGE";


    private EditText rewardEdittext;
    private EditText nameMessage;
    private EditText favouriteMessage;
    private EditText toolMessage;
    private EditText deliciousMessage;
    private EditText villainMessagew;
    private EditText professionMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reward);
        nameMessage = findViewById(R.id.editText);
        favouriteMessage = findViewById(R.id.editText_favourite);
        toolMessage = findViewById(R.id.editText_tool);
        deliciousMessage = findViewById(R.id.editText_delicious);
        rewardEdittext = findViewById(R.id.editText_reward);
        villainMessagew=findViewById(R.id.editText_villain);
        professionMessage = findViewById(R.id.editText_profession);


    }

    public void launchCreateStoryActivity(View view) {

        Log.d(LOG_TAG,"Reward button Clicked!");
        Intent intent = new Intent(this,CreateStory.class);
        String message = nameMessage.getText().toString();
        String message1 = professionMessage.getText().toString();
        String message2 = favouriteMessage.getText().toString();
        String message3 = toolMessage.getText().toString();
        String message4 = deliciousMessage.getText().toString();
        String message5 = villainMessagew.getText().toString();
        String message6 = rewardEdittext.getText().toString();


        intent.putExtra(EXTRA_MESSAGE,message);
        intent.putExtra(EXTRA_MESSAGE1,message1);
        intent.putExtra(EXTRA_MESSAGE2,message2);
        intent.putExtra(EXTRA_MESSAGE3,message3);
        intent.putExtra(EXTRA_MESSAGE4,message4);
        intent.putExtra(EXTRA_MESSAGE5,message5);
        intent.putExtra(EXTRA_MESSAGE6,message6);


       /* String message2 = intent.getStringExtra(CharacterProfession.EXTRA_MESSAGE);
        String message3 = intent.getStringExtra(CharacterFavourite.EXTRA_MESSAGE);
        String message4 = intent.getStringExtra(FavouriteTool.EXTRA_MESSAGE);
        String message5 = intent.getStringExtra(SomethingDelicious.EXTRA_MESSAGE);
        String message6 = intent.getStringExtra(VillainType.EXTRA_MESSAGE);
        String message7 = intent.getStringExtra(Reward.EXTRA_MESSAGE);*/
        String mad1 = getString(R.string.before_name);


        TextView textView = findViewById(R.id.editText2);
        textView.setText(mad1);
        textView.setText(message1);
        startActivity(intent);
    }
}

