package com.example.my;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class listview extends AppCompatActivity {
    ListView listView;
    AdapterListview adapterListview;
    List<Products> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
    }

    @Override
    protected void onStart() {
        super.onStart();
        listView =(ListView)findViewById(R.id.listview);
        createListCustom_list();
        adapterListview =new AdapterListview(listview.this,list);
        listView.setAdapter(adapterListview);
    }

    private void createListCustom_list() {
        list =new ArrayList<Products>();
        list.add(new Products("Gà quay",20,"https://cdn.24h.com.vn/upload/2-2018/images/2018-04-18/1524049352-46-ga-quay-giay-bac-thom-lung-da-gion-thit-ngot-ma-lai-don-gian-vo-cung-_mg_9751-1524049142-width650height433.jpg"));
        list.add(new Products("Cá kho",10,"http://ttol.vietnamnetjsc.vn//2017/06/04/10/01/cu-thu-uop-kieu-nay-thi-du-ca-kho-hay-ca-chien-cung-khong-he-tanh-ngon-khong-tuong_1.jpg"));
        list.add(new Products("Lẩu gà ",30,"https://cdn.eva.vn/upload/4-2018/images/2018-12-05/cach-nau-lau-ga-ngon-ca-nha-vua-an-vua-xuy-xoa-suong-mieng-6-1543985869-86-width613height437.jpg"));
        list.add(new Products("Heo quay",20,"https://image.thanhnien.vn/980/uploaded/vuphuong/2019_01_27/7_oeww.jpg"));
        list.add(new Products("Gỏi sứa",20,"https://cdn.cet.edu.vn/wp-content/uploads/2019/10/goi-sua-xoai-xanh-co-mau-sac-bat-mat.jpg"));

    }
}