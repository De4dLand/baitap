package com.example.sum_calculate.Tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.sum_calculate.R;

public class Tuan22MainActivity extends AppCompatActivity {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan22_main);
        lv=findViewById(R.id.tuan22Listview);
        //Nguon du lieu
        String[] arr = new String[]{"Mon 1", "Mon 2","Mon 3","Mon 4","Mon5"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arr);
        //Hien thi lien listview
        lv.setAdapter(adapter);
    }

    }