package com.example.deneme;

import com.example.deneme.model.MaritalStatus;
import com.example.deneme.model.User;
import com.example.deneme.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(DenemeApplication.class);

    @Autowired
    private IUserService userService;

    @Override
    public void run(String... args) throws Exception{

        User u1 = userService.create("John Doe", MaritalStatus.SINGLE);
        logger.info("{} created", u1);

        User u2 = userService.create("Bill Dennis", MaritalStatus.MARRIED);
        logger.info("{} created", u2);

        User u3 = userService.create("Lucia Smith", MaritalStatus.SINGLE);
        logger.info("{} created", u3);

        User u4 = userService.create("Robert Brown", MaritalStatus.NOT_SPECIFIED);
        logger.info("{} created", u4);

        List<User> users = userService.findAll();
        logger.info("{}", users);
    }

}
