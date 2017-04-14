package com.example.user.animations;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SimpleTranstion extends Activity {

    private ViewGroup group;
    private TextView hiddenText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_transtion);

        group = (ViewGroup) findViewById(R.id.container);
        Button button = (Button) group.findViewById(R.id.transition_button);
        hiddenText = (TextView) group.findViewById(R.id.hidden_text);

        button.setOnClickListener(new View.OnClickListener() {
            boolean visible;//boolean's default value in java is false
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(group);
                visible = !visible;
                hiddenText.setVisibility(visible ? View.VISIBLE : View.GONE);
                // ^ visible true hole set visible r visible na hole set gone??
            }
        });
    }
}
