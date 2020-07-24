package com.example.deneme.controller;

import com.example.deneme.model.User;
import com.example.deneme.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> allUsers(){
        return userService.findAll();
    }

    @GetMapping("/users/count")
    public Long count(){
        return userService.count();
    }

    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable String id){
        Long userId = Long.parseLong(id);
        userService.deleteById(userId);
    }


}
