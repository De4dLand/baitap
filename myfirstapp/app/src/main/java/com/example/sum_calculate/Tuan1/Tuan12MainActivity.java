package com.example.sum_calculate.Tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sum_calculate.R;

public class Tuan12MainActivity extends AppCompatActivity {
    //Khai báo các control
    EditText txt1, txt2;
    Button btn1;
    TextView Tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan12_main);
        //Ánh xạ các control
        txt1 = findViewById(R.id.demo11txt1);
        txt2 = findViewById(R.id.demo11txt2);
        btn1 = findViewById(R.id.demo11btn1);
        Tv1 = findViewById(R.id.demo11Rtxt1);
        //Xử lý dòng sự kiện
        btn1.setOnClickListener(v->{
            //Gọi hàm tính tổng
            tinhtong();
        });
    }

    private void tinhtong() {
        //Lấy dữ liệu nhập vào từ Edittext1
        String str1 = txt1.getText().toString();
        String str2 = txt2.getText().toString();
        Float num1 =Float.parseFloat(str1);
        Float num2 = Float.parseFloat(str2);
        Float Tong = num1 + num2;
        Tv1.setText(String.valueOf(Tong));
    }
}