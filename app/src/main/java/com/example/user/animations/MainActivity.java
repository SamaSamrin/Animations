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
    private String[] animations_array = {"1. Simple Transition", "2. Icon Transition","3. Sliding", "4. CrossFading"};

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
                if(position==3) {
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
            }
        });
    }


}
