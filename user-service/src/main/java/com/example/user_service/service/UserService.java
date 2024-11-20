package com.example.user_service.service;

import java.util.List;

import com.example.user_service.model.User;

public interface UserService {
    User saveUser(User user);
    User getUserById(Integer id);    
    List<User> getUsers();
}
