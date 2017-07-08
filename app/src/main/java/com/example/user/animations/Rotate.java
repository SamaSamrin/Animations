package com.example.user.animations;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Rotate extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate);

        final ImageView iv = (ImageView) findViewById(R.id.cross_image);
        iv.setImageResource(R.drawable.cross);//worked, previously image wasnt showing
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.animate().rotationBy(15).setDuration(100).start();;
            }
        });
    }
}
