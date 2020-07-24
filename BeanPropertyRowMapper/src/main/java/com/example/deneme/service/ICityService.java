package com.example.deneme.service;

import com.example.deneme.model.City;

import java.util.List;

public interface ICityService {

    List<City> findAll();
    City findById(Long id);

}
