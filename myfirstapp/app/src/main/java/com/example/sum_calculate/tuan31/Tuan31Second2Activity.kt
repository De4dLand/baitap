package com.example.sum_calculate.tuan31

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.sum_calculate.R

class Tuan31Second2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var tv2:TextView? = null;
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan31_second2)
        tv2=findViewById(R.id.Tuan31Tv2);
        val i1= intent
        val a = i1.extras!!.getString("a")!!.toInt()
        val b = i1.extras!!.getString("b")!!.toInt()
        val c = i1.extras!!.getString("c")!!.toInt()
        val delta = (b*b-4*a*c).toDouble()
        if(delta <0)
        {
            tv2!!.text="PT Vo Nghiem"
        }
        else if (delta ==0.0)
        {
            tv2!!.text="PT Co Nghiem kep x =  "+(-b)/(2*a)
        }
        else
        {
            val x1 = (-b +Math.sqrt(delta))/(2*a)
            val x2 = (-b -Math.sqrt(delta))/(2*a)
            tv2!!.text="PT Co Hai Nghiem Phan Biet , x1 = " +x1 + " va x2 = " + x2
        }
    }
}