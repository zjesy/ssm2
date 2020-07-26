package com.gbw.service.impl;

import com.gbw.bean.Item;
import com.gbw.bean.User;
import com.gbw.dao.IUserDao;
import com.gbw.dao.ItemDao;
import com.gbw.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDao itemDao;


    @Override
    public void buy(String itemname, int sum, String time, String username) {
        itemDao.buy(itemname,sum,time,username);
    }

    @Override
    public void deleteItems(int id) {
        itemDao.deleteItems(id);
    }


    @Override
    public List<Item> findItemsByBuyer(String username,String itemname) {
        return itemDao.findItemsbyBuyer(username,itemname);
    }

    @Override
    public Item findItemsById(int id) {

        return itemDao.findItemsById(id);
    }

    @Override
    public void updateItemsById(String itemname, int sum, String time, int id) {
         itemDao.updateItemsById(itemname,sum,time,id);
    }


}
