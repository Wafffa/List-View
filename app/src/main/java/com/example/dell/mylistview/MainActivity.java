package com.example.dell.mylistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.dell.mylistview.adapter.HighTeckItemAdapter;
import com.example.dell.mylistview.models.HighTechItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // list of items
        List<HighTechItem> highTechItemList = new ArrayList<>();
        highTechItemList.add(new HighTechItem("Huawei","huawei", 100000));
        highTechItemList.add(new HighTechItem("Samsung","iphone" ,154000));
        highTechItemList.add(new HighTechItem("Iphone","sumsong", 130000));
        highTechItemList.add(new HighTechItem("Redmi","redmi", 130000));
        highTechItemList.add(new HighTechItem("Ipad","ipad", 130000));
        highTechItemList.add(new HighTechItem("Sumsong","tabsumsong", 130000));
        highTechItemList.add(new HighTechItem("Lenevo","lenovo", 130000));
        highTechItemList.add(new HighTechItem("Ecouteur","ecouteur", 130000));
        highTechItemList.add(new HighTechItem("Sony","sony", 130000));
        //
        highTechItemList.add(new HighTechItem("Huawei","huawei", 100000));
        highTechItemList.add(new HighTechItem("Samsung","iphone" ,154000));
        highTechItemList.add(new HighTechItem("Iphone","sumsong", 130000));
        highTechItemList.add(new HighTechItem("Redmi","redmi", 130000));
        highTechItemList.add(new HighTechItem("Ipad","ipad", 130000));
        highTechItemList.add(new HighTechItem("Sumsong","tabsumsong", 130000));
        highTechItemList.add(new HighTechItem("Lenevo","lenovo", 130000));
        highTechItemList.add(new HighTechItem("Ecouteur","ecouteur", 130000));
        highTechItemList.add(new HighTechItem("Sony","sony", 130000));

        // get list view
        ListView shopListView = (ListView) findViewById(R.id.shop_list_view);
        shopListView.setAdapter(new HighTeckItemAdapter(this, highTechItemList));

    }
}
