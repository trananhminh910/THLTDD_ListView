package com.example.listviewandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView danhsach;
    ArrayList<String> arrayCars;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        danhsach  = (ListView) findViewById(R.id.listView);
        arrayCars = new ArrayList<>();
        arrayCars.add("Toyota");
        arrayCars.add("Mescerdes Benz");
        arrayCars.add("BWM");
        arrayCars.add("Vinfast");
        arrayCars.add("Poscher");
        arrayCars.add("Huyndai");
        arrayCars.add("Roll rouce");
        arrayCars.add("Ford");
        arrayCars.add("Kia");
        arrayCars.add("Honda");

        ArrayAdapter adapter = new ArrayAdapter(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                arrayCars
        );
danhsach.setAdapter(adapter);

    }
}