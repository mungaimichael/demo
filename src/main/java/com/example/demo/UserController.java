package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class UserController {

    @RequestMapping(path = "/")
    String handleRootPath () {
        return  "This is the root path";
    }
}
