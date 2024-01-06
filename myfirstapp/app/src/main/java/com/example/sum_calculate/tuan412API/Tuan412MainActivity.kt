package com.example.sum_calculate.tuan412API

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.sum_calculate.R

class Tuan412MainActivity : AppCompatActivity() {
    var btn1:Button? = null
    var tv1:TextView? = null
    var context: Context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan412_main)
        btn1 = findViewById(R.id.btn1)
        tv1 = findViewById(R.id.tv1)
        val fn = VolleyKotlinFn()
        btn1!!.setOnClickListener{fn.getJSON_Array_Objiect(context,tv1!!)}
    }
}