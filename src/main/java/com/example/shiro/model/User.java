package com.example.shiro.model;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class User {
    private Integer uid;
    private String username;
    private String password;
}
