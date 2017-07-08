package com.example.user.animations;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Slide_in extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_in);

        ImageView iv = (ImageView) findViewById(R.id.slide_in_image);
        iv.setImageResource(R.drawable.canvas_circle);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);
        iv.startAnimation(animation);
    }
}
