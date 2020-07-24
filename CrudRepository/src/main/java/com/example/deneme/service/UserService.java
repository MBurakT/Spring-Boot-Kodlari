package com.example.deneme.service;

import com.example.deneme.model.User;
import com.example.deneme.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        var it = userRepository.findAll();

        var users = new ArrayList<User>();
        it.forEach(e->users.add(e));

        return users;
    }
    public Long count(){
        return userRepository.count();
    }
    public void deleteById(Long userId){
        userRepository.deleteById(userId);
    }


}

