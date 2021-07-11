package com.example.shatdingspringbootmybatisgenerator02.service;


import com.example.shatdingspringbootmybatisgenerator02.entity.User;
import com.example.shatdingspringbootmybatisgenerator02.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void save(User user){
        this.userMapper.save(user);
    }

    public User get(Long id){
        User user = this.userMapper.get(id);
        return user;
    }


}
