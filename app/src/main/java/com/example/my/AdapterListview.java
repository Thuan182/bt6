package com.example.my;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class AdapterListview extends BaseAdapter implements ListAdapter {
    Context context;
    List<Products> list;

    public AdapterListview(Context context, List<Products> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.custom_list,null);
        TextView txt = (TextView)convertView.findViewById(R.id.textViewten);
        TextView txt1 = (TextView)convertView.findViewById(R.id.textViewnamsinh);
        ImageView img = (ImageView)convertView.findViewById(R.id.imageView);
        txt.setText(list.get(position).getFoodname());
        txt1.setText("$"+list.get(position).getPrice());

        Glide.with(context).load(list.get(position).getImage()).into(img);
        return convertView;
    }
}
