package com.example.shatdingspringbootmybatisgenerator01.service;


import com.example.shatdingspringbootmybatisgenerator01.entity.User;
import com.example.shatdingspringbootmybatisgenerator01.mapper.UserMapper;
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
