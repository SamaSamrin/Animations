package com.example.user.animations;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TabHost;
import android.widget.ViewFlipper;

public class TabHostSwipe extends Activity {

    private static final String TAG = "**Current Marksheet**";
    TabHost tabHost;
    String[] courseNames;
    int numberOfCourses;
    GestureDetector gestureDetector;
    ViewFlipper flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_host_swipe);

        numberOfCourses = 4;
        //courseNames = new String[numberOfCourses];
        courseNames = new String[]{"CSE110", "MAT110", "PHY111", "ENG101"};

        setGestureDetector();
        flipper = new ViewFlipper(this);
        tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();
        tabHost.setActivated(true);
//        tabHost.showContextMenu();
        //Log.e(TAG, tabHost.toString());
        if(tabHost.isShown())
            Log.e(TAG, "tab host is shown");
        if (tabHost.isActivated())
            Log.e(TAG, "tab host is activated");
        TabHost.TabSpec spec = tabHost.newTabSpec("course1");
        spec.setContent(R.id.tab1);
        spec.setIndicator(courseNames[0]);
        tabHost.addTab(spec);
        spec = tabHost.newTabSpec("course2");
        spec.setContent(R.id.tab2);
        spec.setIndicator(courseNames[1]);
        tabHost.addTab(spec);
        spec = tabHost.newTabSpec("course3");
        spec.setContent(R.id.tab3);
        spec.setIndicator(courseNames[2]);
        tabHost.addTab(spec);
//        spec = tabHost.newTabSpec("course4");
//        spec.setContent(R.id.tab4);
//        spec.setIndicator(courseNames[3]);
//        tabHost.addTab(spec);
        Log.e(TAG, spec.toString());


        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String s) {
                View view = tabHost.getCurrentView();
                //view.setBackgroundColor(Color.GREEN);
                int index = tabHost.getCurrentTab();
                Log.e(TAG, "selected tab index = "+ String.valueOf(index));
                String selectedCourseName=courseNames[index];
                //Toast.makeText(CurrentMarksheet.this, selectedCourseName, Toast.LENGTH_SHORT).show();
            }
        });
    }


    void setGestureDetector(){
        gestureDetector = new GestureDetector(this, new GestureDetector.OnGestureListener() {
            @Override
            public boolean onDown(MotionEvent e) {
                return false;
            }

            @Override
            public void onShowPress(MotionEvent e) {

            }

            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                return false;
            }

            @Override
            public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
                return false;
            }

            @Override
            public void onLongPress(MotionEvent e) {

            }

            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                return false;
            }
        });
    }
}
