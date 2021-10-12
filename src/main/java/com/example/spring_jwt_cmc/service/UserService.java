package com.example.spring_jwt_cmc.service;

import com.example.spring_jwt_cmc.domain.entity.Role;
import com.example.spring_jwt_cmc.domain.entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role user);
    void addRoleToUser(String userName, String roleName);
    User getUser(String userName);
    List<User> getUsers();
}
