package com.example.testspringboot.controller;

import com.example.testspringboot.entity.user;
import com.example.testspringboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/insert")
    public int insert(String name, Integer age){
        return userMapper.insert(new user(name, age));
    }

    @RequestMapping("/all")
    public List<user> all(){
        return userMapper.selectList(null);
    }
}
