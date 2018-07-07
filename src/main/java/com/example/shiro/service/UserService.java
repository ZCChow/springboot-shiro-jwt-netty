package com.example.shiro.service;

import com.example.shiro.model.User;

import java.util.List;

public interface UserService {
    User findByUserName(String userName);
}
