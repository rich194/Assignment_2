package com.example.cookingmadeeasy;

import android.content.Intent;
import android.os.Bundle;

import com.example.assignment2.Beef;
import com.example.assignment2.Chicken;
import com.example.assignment2.Fish;
import com.example.assignment2.Lamb;
import com.example.assignment2.Pork;
import com.example.assignment2.Potato;
import com.example.assignment2.Rice;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    ListView searchIngredients;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        searchIngredients = (ListView) findViewById(R.id.ingredients);

        ArrayList<String> ingredientArray = new ArrayList<>();
        ingredientArray.addAll(Arrays.asList(getResources().getStringArray(R.array.food)));

        adapter = new ArrayAdapter<String>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                ingredientArray
        );

        searchIngredients.setAdapter(adapter);

        searchIngredients.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition = position;
                String value = (String) searchIngredients.getItemAtPosition(position);

                switch(value){
                    case "chicken":
                        Intent newScreen = new Intent(MainActivity.this, Chicken.class);
                        MainActivity.this.startActivity(newScreen);
                        break;
                    case "fish":
                        Intent newScreen1 = new Intent(MainActivity.this, Fish.class);
                        MainActivity.this.startActivity(newScreen1);
                        break;
                    case "pork":
                        Intent newScreen2 = new Intent(MainActivity.this, Pork.class);
                        MainActivity.this.startActivity(newScreen2);
                        break;
                    case "rice":
                        Intent newScreen3 = new Intent(MainActivity.this, Rice.class);
                        MainActivity.this.startActivity(newScreen3);
                        break;
                    case "potato":
                        Intent newScreen4 = new Intent(MainActivity.this, Potato.class);
                        MainActivity.this.startActivity(newScreen4);
                        break;
                    case "lamb":
                        Intent newScreen5 = new Intent(MainActivity.this, Lamb.class);
                        MainActivity.this.startActivity(newScreen5);
                        break;
                    case "beef":
                        Intent newScreen6= new Intent(MainActivity.this, Beef.class);
                        MainActivity.this.startActivity(newScreen6);
                        break;
            }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem item = menu.findItem(R.id.search_food);
        SearchView searchView = (SearchView)item.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String query) {
                adapter.getFilter().filter(query);
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        return super.onOptionsItemSelected(item);
    }
}
