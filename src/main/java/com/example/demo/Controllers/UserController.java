package com.example.demo.Controllers;

import com.example.demo.data_transfer_object.Users ;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.*;

// Contains all endpoints related to a user

@RestController
@SpringBootApplication
public class UserController {

    @PostMapping(path = "/new-user")
    String handleRootPath (@RequestBody String request) {
        return  request;
    }


    @PostMapping("/login")
    public Users getUser (@RequestBody Users user){
        return user;
    }

    

}
