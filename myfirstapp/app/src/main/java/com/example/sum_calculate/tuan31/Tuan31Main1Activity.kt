package com.example.sum_calculate.tuan31

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.sum_calculate.R

class Tuan31Main1Activity : AppCompatActivity() {
    var txtA: EditText? = null
    var txtB: EditText? = null
    var txtC: EditText? = null
    var btn2: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan31_main1)
        txtA = findViewById(R.id.tuan31A)
        txtB = findViewById(R.id.tuan31B)
        txtC = findViewById(R.id.tuan31C)
        btn2 = findViewById(R.id.Tuan31btn2)
        btn2!!.setOnClickListener(View.OnClickListener {
            var i = Intent(this@Tuan31Main1Activity,Tuan31Second2Activity::class.java)
            i.putExtra("a",txtA!!.text.toString())
            i.putExtra("b",txtB!!.text.toString())
            i.putExtra("c",txtC!!.text.toString())
            startActivity(i)

        })
    }
}