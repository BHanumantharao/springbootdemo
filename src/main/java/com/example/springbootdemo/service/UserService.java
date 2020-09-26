package com.example.springbootdemo.service;

import com.example.springbootdemo.model.Channel;
import com.example.springbootdemo.model.User;

import java.util.List;

/**
 * @author Hanumantharao Bitragunta
 */
public interface UserService {
    List<User> getUsers();
    User getUser(int Id);
    void createUser(User channel);
    void updateUser(User channel);
    void deleteUser(int Id);
}
