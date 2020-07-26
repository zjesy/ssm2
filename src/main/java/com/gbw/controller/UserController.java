package com.gbw.controller;

import com.gbw.bean.Item;
import com.gbw.bean.Producer;
import com.gbw.bean.User;
import com.gbw.dao.IRoleDao;
import com.gbw.service.IProducerService;
import com.gbw.service.IRoleService;
import com.gbw.service.IUserService;
import com.gbw.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping
public class UserController {

    @Autowired
    private IUserService userService;
    @Autowired
    private ItemService itemService;
    @Autowired
    private IProducerService producerService;
    @Autowired
    private IRoleService roleService;
    @RequestMapping("login.do")
    public ModelAndView login(User user, HttpSession session){
        int id=userService.login(user.getUsername(),user.getPassword());
        ModelAndView modelAndView=new ModelAndView();
        if(id!=-1){
            modelAndView.addObject("username",user.getUsername());
            session.setAttribute("user",user);
            List<Integer> roleIds=roleService.findRoleByUserId(id);
            session.setAttribute("roleIds",roleIds);
            modelAndView.setViewName("../main");
        }
        else
            modelAndView.setViewName("../index");

        return  modelAndView;

    }

    @RequestMapping("registe.do")
    public ModelAndView registe(User user){
        boolean flag=userService.registe(user.getUsername(),user.getPassword());
        ModelAndView modelAndView=new ModelAndView();
        if(flag){
            modelAndView.setViewName("../index");
        }
        else
            modelAndView.setViewName("../registe");

        return  modelAndView;
    }

    @RequestMapping("toBuy.do")
    public ModelAndView buy(HttpSession session){
        ModelAndView modelAndView=new ModelAndView();
        User user=(User)session.getAttribute("user");
        String username=user.getUsername();
        modelAndView.addObject("username",username);
        modelAndView.setViewName("../buy");
        return modelAndView;
    }


    @RequestMapping("toSearch.do")
    public ModelAndView search(HttpSession session){
        ModelAndView modelAndView=new ModelAndView();
        User user=(User)session.getAttribute("user");
        String username=user.getUsername();
        List<Item> list=itemService.findItemsByBuyer(user.getUsername(),"");
        modelAndView.addObject("list",list);
        modelAndView.addObject("username",username);
        modelAndView.setViewName("../search");
        return modelAndView;
    }

    @RequestMapping("toUpdate.do")
    public ModelAndView toUpdate(int id){
        ModelAndView modelAndView=new ModelAndView();
        Item item=itemService.findItemsById(id);
        modelAndView.addObject("itemname",item.getItemname());
        modelAndView.addObject("sum",item.getSum());
        modelAndView.addObject("buyer",item.getBuyer());
        modelAndView.addObject("time",item.getTime());
        modelAndView.addObject("id",item.getId());
        modelAndView.setViewName("../update");
        return modelAndView;
    }

    @RequestMapping("toMain.do")
    public ModelAndView toMain(HttpSession session){
        ModelAndView modelAndView=new ModelAndView();
        User user=(User)session.getAttribute("user");
        String username=user.getUsername();
        modelAndView.addObject("username",username);
        modelAndView.setViewName("../main");
        return modelAndView;
    }

    @RequestMapping("toProducer")
    public  ModelAndView toProducer(HttpSession session){
        ModelAndView modelAndView=new ModelAndView();
        User user=(User)session.getAttribute("user");
        String username=user.getUsername();
        List<Producer> list=producerService.findAll();
        modelAndView.addObject("list",list);
        modelAndView.addObject("username",username);
        modelAndView.setViewName("../producer");
        return modelAndView;
    }

}
