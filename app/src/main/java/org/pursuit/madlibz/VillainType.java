package org.pursuit.madlibz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class VillainType extends AppCompatActivity {
    public static final String LOG_TAG = SomethingDelicious.class.getSimpleName();
    public static final String EXTRA_MESSAGE = "org.pursuit.madlibz.extra.MESSAGE";
    private EditText mMessageEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_villain_type);
        mMessageEditText = findViewById(R.id.editText_villain);
    }

    public void launchRewardActivity(View view) {
        Log.d(LOG_TAG,"Reward button Clicked!");
        Intent intent = new Intent(this,Reward.class);
        String message = mMessageEditText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);

    }
}
