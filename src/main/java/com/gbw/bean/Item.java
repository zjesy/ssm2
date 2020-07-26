package com.gbw.bean;

import java.text.SimpleDateFormat;

public class Item {
    String itemname;
    int sum;
    String time;
    String buyer;
    int id;

    public Item() {
    }

    public Item(String itemname, int sum, String time, String buyer, int id) {
        this.itemname = itemname;
        this.sum = sum;
        this.time = time;
        this.buyer = buyer;
        this.id = id;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
