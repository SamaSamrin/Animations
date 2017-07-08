package com.example.user.animations;


import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

    private ListView lv;
    private ArrayAdapter<String> adapter;
    private String[] animations_array = {"1. Simple Transition", "2. Icon Transition",
            "3. Sliding", "4. Rotate", "5. Slide image in","6. CrossFading",
            "7. Tabs Swipe"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.mainList);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, animations_array );
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i ;
                if(position==5) {
                    i = new Intent(MainActivity.this, CrossFading.class);
                    startActivity(i);
                }
                else if (position==1){
                    i = new Intent(MainActivity.this, IconTransition.class);
                    startActivity(i);
                }
                else if(position==0){
                    i = new Intent(MainActivity.this, SimpleTranstion.class);
                    startActivity(i);
                }
                else if(position==2){
                    i = new Intent(MainActivity.this, Sliding.class);
                    startActivity(i);
                }
                else if(position==3){
                    i = new Intent(MainActivity.this, Rotate.class);
                    startActivity(i);
                }
                else if(position==4){
                    i = new Intent(MainActivity.this, Slide_in.class);
                    startActivity(i);
                }
                else if(position==6){
                    i = new Intent(MainActivity.this, TabHostSwipe.class);
                    startActivity(i);
                }
            }
        });
    }


}
