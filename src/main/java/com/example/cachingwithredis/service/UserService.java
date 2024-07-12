package com.example.cachingwithredis.service;

import com.example.cachingwithredis.model.User;

import java.util.List;

public interface UserService {

    boolean saveUser(User user);

    List<User> fetchAllUsers();

    User fetchUserById(Long id);

    boolean deleteUser(Long id);

    boolean editUser(Long id, User user);
}
