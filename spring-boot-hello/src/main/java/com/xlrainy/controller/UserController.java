package com.xlrainy.controller;

import com.xlrainy.domain.User;
import com.xlrainy.domain.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    public void insert(@RequestParam(value ="name") String name,
                       @RequestParam(value="age", defaultValue = "0") Integer age){
        userMapper.insert(name,age);
    }

    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public String select(@RequestParam(value = "name") String name){
        User user = userMapper.findByName(name);
        return user.toString();
    }
}
