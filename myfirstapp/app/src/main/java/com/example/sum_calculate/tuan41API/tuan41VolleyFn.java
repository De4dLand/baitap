package com.example.sum_calculate.tuan41API;

import android.content.Context;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class tuan41VolleyFn {
    String strJSON = "";
    public void getJSONArrayOfObject(Context context, TextView textView)
    {
        //1. Tạo request
        RequestQueue queue = Volley.newRequestQueue(context);
        //2. URL
        String url = "http://172.16.5.59:8080/ajson/a.json";
        //3. Gọi request // JsonArrayRequest(url, thanhcong, thatbai)
        JsonArrayRequest request = new JsonArrayRequest(url,new  Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                //Chuyển mảng sang các đối tượng
                for(int i=0;i<response.length();i++)
                {
                    try {
                        JSONObject person =response.getJSONObject(i);//Lấy từng đối tượng
                        String id = person.getString("id");//Lấy về id
                        String name = person.getString("name");
                        String email = person.getString("email");
                        strJSON +="id  = " +id + "\n";
                        strJSON +="name  = " +name + "\n";
                        strJSON +="email  = " +email + "\n";
                    } catch (JSONException e)
                    {
                        throw  new RuntimeException(e);
                    }
                    textView.setText(strJSON);
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                textView.setText(error.getMessage());
            }
        });
        //4. Thực thi request

    }
}
