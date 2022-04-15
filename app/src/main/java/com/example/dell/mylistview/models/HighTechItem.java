package com.example.dell.mylistview.models;

/**
 * Created by DELL on 09/04/2022.
 */

public class HighTechItem {
    private String name;
    private String memonic;
    private double price;

    //constructor

    public HighTechItem(String name ,String memonic, double price){
        this.name = name;
        this.memonic = memonic;
        this.price = price;
    }
    //methods

    public String getName(){ return name;}

    public String getMemonic() { return memonic;}

    public double getPrice(){ return price;}
}
