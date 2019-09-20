package com.example.assignment2;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cookingmadeeasy.R;

public class Potato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_2);

        String[] Potato = {"test", "test"}; //user db to populate
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Potato);
        final ListView theListView = (ListView) findViewById(R.id.ListView2);

        theListView.setAdapter(adapter);
    }
}
