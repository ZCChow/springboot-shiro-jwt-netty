package com.example.shiro.service;

import com.example.shiro.UserMapper;
import com.example.shiro.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User findByUserName(String userName) {
        return userMapper.findByUserName(userName);
    }

    @Override
    public void InerstUser(User user) {
        userMapper.InerstUser(user);

    }
}
