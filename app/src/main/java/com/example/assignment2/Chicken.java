package com.example.assignment2;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.cookingmadeeasy.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.Arrays;


    public class Chicken extends AppCompatActivity {
        //ListView chickenAdapter;
        //ArrayAdapter<String> adapter;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.layout_2);

            String[] chicken = {"test","test"}; //user db to populate
            ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, chicken);
            final ListView theListView = (ListView) findViewById(R.id.ListView2);

            //chickenAdapter = (ListView) findViewById(R.id.ingredients);
            //ArrayList<String> chickenArray = new ArrayList<>();
            //chickenArray.add("test");
            //chickenArray.add("test");
            //chickenArray.addAll(Arrays.asList(getResources().getStringArray(R.array.chicken)));

            //adapter = new ArrayAdapter<String>(
             //       Chicken.this,
              //      android.R.layout.simple_list_item_1,
              //      chickenArray
            //);
            theListView.setAdapter(adapter);
            //database format name of recipe and main ingredient









}}
