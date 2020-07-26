package com.gbw.service;

import com.gbw.bean.Item;

import java.util.List;

public interface ItemService {
    void buy(String itemname,int sum,String time,String username);

    void deleteItems(int id);

    List<Item> findItemsByBuyer(String username,String itemname);

    Item findItemsById(int id);

    void updateItemsById(String itemname,int sum,String time,int id);
}
