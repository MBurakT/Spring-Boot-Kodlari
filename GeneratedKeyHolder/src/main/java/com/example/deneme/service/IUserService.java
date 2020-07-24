package com.example.deneme.service;

import com.example.deneme.model.MaritalStatus;
import com.example.deneme.model.User;

import java.util.List;

public interface IUserService {

    List<User> findAll();
    User findById(Long id);
    User create(String name, MaritalStatus status);

}
