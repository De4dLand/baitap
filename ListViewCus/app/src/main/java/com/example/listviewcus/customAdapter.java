package com.example.listviewcus;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Arrays;
import java.util.List;


public class customAdapter extends ArrayAdapter<Contact> {
    private Context context;
    private int resource;
    private List<Contact> objects;
    private LayoutInflater inflater;
    public customAdapter(@NonNull Context context, int resource, @NonNull List<Contact> objects) {
        super(context, resource, objects);
        this.context= context;
        this.resource= resource;
        this.objects= objects;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder= new ViewHolder();
        //Thiet lap View
        if(convertView == null)//Neu View chua co san
        {
            //Thiet lap view holder
            convertView= inflater.inflate(R.layout.item_listview, null);
            holder.tvAvatar= (TextView)convertView.findViewById(R.id.tvAvatar);
            holder.tvName= (TextView)convertView.findViewById(R.id.tvName);
            holder.tvPhone=(TextView)convertView.findViewById(R.id.tvPhone);


            convertView.setTag(holder);
        }
        else {//Neu View co san

            //lay ve view holder
            holder=(ViewHolder)convertView.getTag();
        }
        //Gan du lieu cho View
        Contact contact = objects.get(position);
        holder.tvAvatar.setText(String.valueOf(position));//lay ve Text Avatar
        holder.tvAvatar.setBackgroundColor(Color.green(1));
        holder.tvName.setText(contact.getName());
        holder.tvPhone.setText(contact.getPhone());
        return super.getView(position, convertView, parent);
    }

    public class ViewHolder
    {
        TextView tvName,tvAvatar,tvPhone;
    }
}
