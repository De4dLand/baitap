package com.example.sum_calculate.tuan41API;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
//import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.sum_calculate.R;

public class tuan411MainActivity extends AppCompatActivity {
    Button btn1;
    TextView tv1;
    Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan411_main);
        btn1 = findViewById(R.id.tuan411btn1);
        tv1 = findViewById(R.id.tuan411TVKQ);
        tuan41VolleyFn volleyFn= new tuan41VolleyFn();
        btn1.setOnClickListener(v -> volleyFn.getJSONArrayOfObject(context,tv1));
    }
}