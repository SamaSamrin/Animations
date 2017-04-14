package com.example.user.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.app.Activity;

public class CrossFading extends Activity {

    private View tv;
    private View pbar;
    private int shortAnimationTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cross_fading);

        tv = findViewById(R.id.textView);
        pbar = findViewById(R.id.spinner_progress);

        //initially hide the content/text view because
        //For the view that is being faded in, set its visibility to GONE. This prevents the view from taking up layout space and omits it from layout calculations, speeding up processing.
        tv.setVisibility(View.GONE);

        /*
        Cache the config_shortAnimTime system property in a member variable. This property defines a standard "short" duration for the animation.
        This duration is ideal for subtle animations or animations that occur very frequently.
        config_longAnimTime and config_mediumAnimTime are also available if you wish to use them.
         */

        shortAnimationTime = getResources().getInteger(android.R.integer.config_shortAnimTime);
        crossFade();
    }

    private void crossFade(){

    }
}
