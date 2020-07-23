package com.example.taslak.controller;

import com.example.taslak.model.City;
import com.example.taslak.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private ICityService cityService;

    @RequestMapping("/cities")
    public List<City> findCities(){
        return cityService.findAll();
    }
    @RequestMapping("/cities/{cityId}")
    public City findCity(@PathVariable Long cityId){
        return cityService.findById(cityId);
    }
    @ExceptionHandler(EmptyResultDataAccessException.class)
    public ResponseEntity<String> noCityFound(EmptyResultDataAccessException e){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No City found");
    }

}
