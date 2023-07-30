package com.example.labreport;

public class ContactItem {
    private String name = null, address = null,contact = null;
    private int age = 0;
    public ContactItem(String name, String address, String contact, int age){
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.age = age;
    }
    public String getName(){return this.name;};
    public String getAddress(){return this.address;};
    public  String getContact(){return  this.contact;};
    public  int getAge(){return this.age;};
}
