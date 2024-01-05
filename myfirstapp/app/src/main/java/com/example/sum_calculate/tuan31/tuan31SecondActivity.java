package com.example.sum_calculate.tuan31;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.sum_calculate.R;

public class tuan31SecondActivity extends AppCompatActivity {
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan31_second);
        tv1=findViewById(R.id.tuan31Tv1);
        Intent intent = getIntent();
        int HsA=Integer.parseInt(intent.getExtras().getString("a"));
        int HsB=Integer.parseInt(intent.getExtras().getString("b"));
        int HsC=Integer.parseInt(intent.getExtras().getString("c"));
        float delta=HsB*HsB-4*HsA*HsC;
        if(delta <0)
        {
            tv1.setText("PT Vo Nghiem");
        }
        else if (delta ==0)
        {
            tv1.setText("PT Co Nghiem Kep x = "+ (-HsB)/(2*HsA));
        }
        else
        {
            float x1= (float) (-HsB + Math.sqrt(delta))/(2*HsA);
            float x2 = (float) (-HsB - Math.sqrt(delta))/(2*HsA);
            tv1.setText("PT Co Hai Nghiem Phan Biet,x1 = " +x1 +" va x2 = " +x2);
        }
    }
}