package com.example.shiro;

import com.example.shiro.model.User;


import java.util.List;

public interface UserMapper {
    User findByUserName(String userName);
    void InerstUser(User user);
}
