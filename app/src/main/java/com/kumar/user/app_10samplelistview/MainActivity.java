package com.kumar.user.app_10samplelistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= (ListView) findViewById(R.id.lView);
        final String[] values=new String[]{
                "The Complete Android and Java Course",
                "@pdichone",
                "I love this",
                "Hello Friends",
                "Android is great!",
                "@pdichone",
                "Hello Friends",
                "Android is great!",
                "@pdichone",
                "Hello Friends",
                "Android is great!",
                "@pdichone",
                "Hello Friends",
                "Android is great!",
                "@pdichone",
                "Hello Friends",
                "Android is great!",
                "@pdichone",
                "Hello Friends",
                "Android is great!",
                "@pdichone",
                "Hello Friends",
                "Android is great!"

        };
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1,values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int intPosition=position;
                String clickValues=listView.getItemAtPosition(intPosition).toString();
                Toast.makeText(MainActivity.this, clickValues, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
