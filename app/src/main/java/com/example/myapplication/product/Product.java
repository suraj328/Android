package com.example.myapplication.product;

public class Product {
    private String title;
    private String desc,category;
    int price = 0;
    public Product(String title,String desc,String category){
        this.title = title;
        this.desc = desc;
        this.category = category;
    }
    public String getTitle(){
        return this.title;
    }
    public String getDesc(){
        return this.desc;
    }
    public  String getCategory(){
        return this.category;
    }
    public int getPrice(){
        return price;
    }
}
