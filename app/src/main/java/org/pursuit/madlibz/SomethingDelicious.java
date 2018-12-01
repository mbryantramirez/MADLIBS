package org.pursuit.madlibz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class SomethingDelicious extends AppCompatActivity {
    public static final String LOG_TAG = SomethingDelicious.class.getSimpleName();
    public static final String EXTRA_MESSAGE = "org.pursuit.madlibz.extra.MESSAGE";
    private EditText mMessageEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_something_delicious);
        mMessageEditText = findViewById(R.id.editText_delicious);
    }

    public void launchVillainActivity(View view) {
        Log.d(LOG_TAG,"This button is delicious!");
        Intent intent = new Intent(this,VillainType.class);
        String message = mMessageEditText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }
}
