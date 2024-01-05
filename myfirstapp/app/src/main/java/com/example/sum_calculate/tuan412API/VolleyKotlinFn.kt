package com.example.sum_calculate.tuan412API

import android.content.Context
import android.widget.TextView
import com.android.volley.Response
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley

class VolleyKotlinFn {
    var strJSON = ""
    fun getJSON_Array_Objiect(context: Context, textview: TextView)
    {
        //1. Tạo request
        val quere = Volley.newRequestQueue(context)
        //2. url
        val url ="http://172.16.5.59:8080/ajson/a.json"
        //3. Gọi request(MẢng của các đối tượng
        //        val request = JsonArrayRequest(url, thanhcong, thatbai)
        val request = JsonArrayRequest(url,Response.Listener{
            response ->  for (i in 0 until response.length())
        {
            //lấy các đối tượng
            val person = response.getJSONObject(i)
            val id = person.getString("id")
            val name = person.getString("name")
            val email = person.getString("email")
            //Đưa tất cả vào textview
            strJSON += "id: $id \n"
            strJSON += "name: $name \n"
            strJSON += "email: $email \n"
        }
                textview.text = strJSON

        },Response.ErrorListener {
            error -> textview.text= error.message
        })
        quere.add(request)

    }
}