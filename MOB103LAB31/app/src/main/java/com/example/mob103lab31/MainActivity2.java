package com.example.mob103lab31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button BtnDangNhap;
    EditText txtUser, txtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtPass = findViewById(R.id.edPassWord);
        txtUser = findViewById(R.id.edUserName);
        BtnDangNhap = findViewById(R.id.BtnDangNhap);
    }
    public void dangNhap(View view)
    {
        if (txtUser.getText().toString().equals("admin")&&txtPass.getText().toString().equals("admin"))
        {
            Toast.makeText(getApplicationContext(),"Dang Nhap Thanh Cong ", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Dang Nhap That Bai ", Toast.LENGTH_LONG).show();
        }
    }
}