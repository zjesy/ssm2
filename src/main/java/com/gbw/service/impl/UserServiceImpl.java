package com.gbw.service.impl;

import com.gbw.bean.User;
import com.gbw.dao.IUserDao;
import com.gbw.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public int login(String username, String password) {
       User user =userDao.findUserByUserName(username);
       if(user!=null&&user.getPassword().equals(password)){
           return user.getId();
       }
        return -1;
    }

    @Override
    public boolean registe(String username, String password) {
        User user=userDao.findUserByUserName(username);
        if (user==null){
            userDao.createNewUser(username,password);
            return true;
        }
        return  false;
    }


}
