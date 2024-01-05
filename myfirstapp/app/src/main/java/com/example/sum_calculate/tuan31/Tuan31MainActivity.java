package com.example.sum_calculate.tuan31;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

import com.example.sum_calculate.R;

public class Tuan31MainActivity extends AppCompatActivity {
    EditText txt1,txt2,txt3;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan31_main);
        txt1 = findViewById(R.id.tuan31txt1);
        txt2 = findViewById(R.id.tuan31txt2);
        txt3 = findViewById(R.id.tuan31txt3);
        btn1= findViewById(R.id.tuan31btn1);
        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(Tuan31MainActivity.this, tuan31SecondActivity.class);
                intent.putExtra("a",txt1.getText().toString());
                intent.putExtra("b",txt2.getText().toString());
                intent.putExtra("c",txt3.getText().toString());
                startActivity(intent);
            }
        });

    }
}