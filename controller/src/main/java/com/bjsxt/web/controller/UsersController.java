package com.bjsxt.web.controller;

import com.bjsxt.wsk.pojo.Users;
import com.bjsxt.wsk.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/addUsers")
    public String addUsers(Users users){
        this.usersService.addUsers(users);
        return "redirect:/ok";
    }

    @RequestMapping("/findUsers")
    public String findUsers(Model model){
        List<Users> list = this.usersService.findUsers();
        model.addAttribute("list", list);
        return "/showUsers";
    }

    @RequestMapping("/preUpdateUser")
    public String preUpdateUser(Integer userid,Model model){
        Users users = this.usersService.findUserById(userid);
        model.addAttribute("users",users);
        return "/updateUsers";
    }


    @RequestMapping("/updateUsers")
    public String updateUsers(Users users){
        this.usersService.modifyUsers(users);
        return "redirect:/ok";
    }

    @RequestMapping("/deleteUser")
    public String delectUsers(Integer userid){
        this.usersService.dropUsersById(userid);
        return "redirect:/ok";
    }

}
