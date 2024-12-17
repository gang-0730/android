package com.example.adapterview_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.sql.Array;

public class MainActivity extends AppCompatActivity {
ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.list);
String[] data={"1ddddd","2ddddd","3ddddd","4ddddd","5ddddd"};


        ArrayAdapter<String> adapter=
                new ArrayAdapter<String>(MainActivity.this,
                        android.R.layout.simple_list_item_1,data);
        list.setAdapter(adapter);
    }
}