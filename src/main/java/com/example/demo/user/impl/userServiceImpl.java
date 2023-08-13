package com.example.demo.user.impl;

import com.example.demo.user.userMapper;
import com.example.demo.user.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService {

    @Autowired
    private userMapper userMapper;


}
