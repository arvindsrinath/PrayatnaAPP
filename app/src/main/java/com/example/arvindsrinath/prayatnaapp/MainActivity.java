package com.example.arvindsrinath.prayatnaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"hi",Toast.LENGTH_LONG).show();

        final ArrayList<String> mobileArray = new ArrayList<>(Arrays.asList("OSPC","Reverse Coding","Debugging","Linux Mate",
                "Web Design","Hackathon","Sql Scholar"));


            ArrayAdapter adapter = new ArrayAdapter<String>(this,
                    R.layout.activity_listview, mobileArray);

            ListView listView = (ListView) findViewById(R.id.mobile_list);
            listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //       Toast.makeText(getApplicationContext(),String.valueOf(intt.size()),Toast.LENGTH_SHORT).show();

                mobileArray.get(position);
                Intent i = new Intent(MainActivity.this, newact.class);
                startActivity(i);

            }
        });

    }

    }

