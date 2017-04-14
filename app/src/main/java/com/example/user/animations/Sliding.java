package com.example.user.animations;

import android.app.Activity;
import android.os.Bundle;
import android.transition.Visibility;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sliding extends Activity {

    private TextView slidingText;
    private final String TAG = "**Sliding**";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sliding);

        slidingText = (TextView) findViewById(R.id.text_to_slide);
        Button upButton = (Button) findViewById(R.id.up_slider_button);
        Button downButton = (Button) findViewById(R.id.down_slider_button);

        upButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "up button clicked");
                slidingText.animate().translationY(-100);
            }
        });
        downButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "down button clicked");
                slidingText.animate().translationY(250);
            }
        });

    }
}
