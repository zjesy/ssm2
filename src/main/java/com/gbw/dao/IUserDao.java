package com.gbw.dao;

import com.gbw.bean.User;
import org.apache.ibatis.annotations.Param;

public interface IUserDao {
    User findUserByUserName(String username);
    void createNewUser(@Param("username")String username, @Param("password")String password);
}
