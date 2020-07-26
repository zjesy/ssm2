package com.gbw.dao;

import com.gbw.bean.Item;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemDao {
    List<Item> findItemsbyBuyer(@Param("buyer") String username,@Param("itemname") String itemname);
    void deleteItems(int id);
    void buy(@Param("itemname")String itemname, @Param("sum")int sum, @Param("time")String time, @Param("buyer")String username);
    Item findItemsById(int id);
    void updateItemsById(@Param("itemname")String itemname, @Param("sum")int sum, @Param("time")String time,@Param("id") int id);

}
