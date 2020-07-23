package com.example.taslak.service;

import com.example.taslak.model.City;

import java.util.List;

public interface ICityService {
    List<City> findAll();
    City findById(Long id);
}
