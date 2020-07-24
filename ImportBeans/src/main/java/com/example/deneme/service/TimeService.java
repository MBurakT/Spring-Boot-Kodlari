package com.example.deneme.service;

import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class TimeService {

    public LocalTime getTime(){

        LocalTime now = LocalTime.now();

        return now;

    }

}
