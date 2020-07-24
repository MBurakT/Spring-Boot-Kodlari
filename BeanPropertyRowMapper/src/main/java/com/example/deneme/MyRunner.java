package com.example.deneme;

import com.example.deneme.model.City;
import com.example.deneme.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private ICityService cityService;

    @Override
    public void run(String... args) throws Exception{

        City city = cityService.findById(1L);
        System.out.println(city);

        List<City> data = cityService.findAll();
        System.out.println(data);

    }

}
