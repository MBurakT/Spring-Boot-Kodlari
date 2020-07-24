package com.example.deneme;

import com.example.deneme.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.swing.*;


@EnableAutoConfiguration
@Configuration
@Import(value= TimeService.class)
public class DenemeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		//SpringApplication.run(DenemeApplication.class, args);
        new SpringApplicationBuilder(DenemeApplication.class)
                .sources(TimeService.class)
                .build()
                .run(args);
	}

	@Autowired
    private TimeService timeService;

	@Override
    public void run(String... args) throws Exception{
        System.out.println(timeService.getTime());
    }

}
