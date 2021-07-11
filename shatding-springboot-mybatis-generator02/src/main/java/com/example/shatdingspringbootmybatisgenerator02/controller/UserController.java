package com.example.shatdingspringbootmybatisgenerator02.controller;


import com.example.shatdingspringbootmybatisgenerator02.entity.User;
import com.example.shatdingspringbootmybatisgenerator02.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/save")
    public String save(){
        for (int i = 0; i <10 ; i++) {
            User user=new User();
            user.setName("test"+i);
            user.setCityId(i%2==0?1:2);
            user.setCreateTime(new Date());
            user.setSex(i%2==0?1:2);
            user.setPhone("11111111"+i);
            user.setEmail("xxxxx");
            user.setCreateTime(new Date());
            user.setPassword("eeeeeeeeeeee");
            userService.save(user);
        }
        return "success";
    }

    @RequestMapping("/get")
    public User get(Long id){
        User user = this.userService.get(id);
        return user;
    }

}
