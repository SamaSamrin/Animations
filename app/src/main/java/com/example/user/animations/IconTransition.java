package com.example.user.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;

public class IconTransition extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon_transition);
        // to inflate a Transition instance inside your activity from a resource file
        Transition fadeTrans = TransitionInflater.from(this).inflateTransition(R.transition.transition_fade);

        /*
        To make a scene change while applying a transition in response to some event in your activity,
        call the TransitionManager.go() static method with the ending scene and the transition instance to use for the animation
         */


    }
}
