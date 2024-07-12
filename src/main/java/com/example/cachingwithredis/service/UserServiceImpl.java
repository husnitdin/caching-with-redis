package com.example.cachingwithredis.service;

import com.example.cachingwithredis.model.User;
import com.example.cachingwithredis.repo.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public boolean saveUser(User user) {
        return userDao.saveUser(user);
    }

    @Override
    public List<User> fetchAllUsers() {
        return userDao.fetchAllUsers();
    }

    @Override
    public User fetchUserById(Long id) {
        return userDao.fetchUserById(id);
    }

    @Override
    public boolean deleteUser(Long id) {
        return userDao.deleteUser(id);
    }

    @Override
    public boolean editUser(Long id, User user) {
        return userDao.editUser(id, user);
    }
}
