package com.example.listviewcus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity1 extends AppCompatActivity {
    ListView LvContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        LvContact = findViewById(R.id.lv);
        ArrayList<Contact> arrContact = new ArrayList<>();
        Contact contact1 = new Contact("Nguyen Van A","A", "0912345678");
        Contact contact2 = new Contact("Tran Van B","B", "0912345679");
        arrContact.add(contact1);
        arrContact.add(contact2);
        customAdapter adapter = new customAdapter(this,R.layout.item_listview,arrContact);
        LvContact.setAdapter(adapter);

    }
}