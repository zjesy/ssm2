package com.gbw.controller;

import com.gbw.bean.Item;
import com.gbw.bean.User;
import com.gbw.service.IUserService;
import com.gbw.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping
public class ItemController {

    @Autowired
    private ItemService itemService;


    @RequestMapping("buy.do")
    public ModelAndView buyItems(Item item, HttpSession session){
        User user=(User)session.getAttribute("user");
        String username=user.getUsername();
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        String time=dateFormat.format(date);
        itemService.buy(item.getItemname(),item.getSum(),time,username);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("username",username);

        List<Item> list=itemService.findItemsByBuyer(user.getUsername(),"");
        modelAndView.addObject("list",list);
        modelAndView.setViewName("../search");
        return modelAndView;
    }

    @RequestMapping("delete.do")
    public ModelAndView deleteItems(int id,HttpSession session){
        itemService.deleteItems(id);
        ModelAndView modelAndView=new ModelAndView();
        User user=(User)session.getAttribute("user");
        String username=user.getUsername();

        List<Item> list=itemService.findItemsByBuyer(user.getUsername(),"");
        modelAndView.addObject("list",list);
        modelAndView.addObject("username",username);
        modelAndView.setViewName("../search");
        return modelAndView;
    }

    @RequestMapping("update.do")
    public ModelAndView update(String itemname,int sum, int id,HttpSession session){
        ModelAndView modelAndView=new ModelAndView();
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        String time=dateFormat.format(date);
        itemService.updateItemsById(itemname,sum,time,id);
        User user=(User)session.getAttribute("user");
        String username=user.getUsername();

        List<Item> list=itemService.findItemsByBuyer(user.getUsername(),"");
        modelAndView.addObject("list",list);
        modelAndView.addObject("username",username);
        modelAndView.setViewName("../search");
        return modelAndView;
    }

    @RequestMapping("find.do")
    public ModelAndView find(String itemname,HttpSession session){
        ModelAndView modelAndView=new ModelAndView();
        User user=(User)session.getAttribute("user");
        String username=user.getUsername();
        List<Item> list=itemService.findItemsByBuyer(user.getUsername(),itemname);
        modelAndView.addObject("list",list);
        modelAndView.addObject("username",username);
        modelAndView.setViewName("../search");
        return modelAndView;
    }
}
