package com.example.dell.mylistview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dell.mylistview.R;
import com.example.dell.mylistview.models.HighTechItem;

import java.util.List;

/**
 * Created by DELL on 09/04/2022.
 */

public class HighTeckItemAdapter extends BaseAdapter {

    //fields
    private Context context;
    private List<HighTechItem> highTechItemList;
    private LayoutInflater inflater;

    //constructor
    public HighTeckItemAdapter(Context context,List<HighTechItem> highTechItemList){
        this.context = context;
        this.highTechItemList = highTechItemList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return highTechItemList.size();
    }

    @Override
    public HighTechItem getItem(int position) {
        return highTechItemList.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = inflater.inflate(R.layout.adapter_item, null);
        //get informations about item
        HighTechItem currentItem = getItem(i);
        String itemName = currentItem.getName();
        String memonic = currentItem.getMemonic();
        double itemPrice = currentItem.getPrice();

        //get item icon view
        ImageView itemIconView = view.findViewById(R.id.item_icon);
        String resourceName = "item_"+ memonic + "_icon";
        int resId = context.getResources().getIdentifier(resourceName, "drawable",context.getOpPackageName()) ;
        itemIconView.setImageResource(resId);

        //get item name view
        TextView itemNameView = view.findViewById(R.id.item_name);
        itemNameView.setText(itemName);

        //get item price view
        TextView itemPriceView = view.findViewById(R.id.item_price);
        itemPriceView.setText(itemPrice + "DA");

        return view;
    }
}
