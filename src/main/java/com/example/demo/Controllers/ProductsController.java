package com.example.demo.Controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ProductsController {

    @GetMapping(path = "/products")
    String handleRootPath () {
        return  "This is the root path";
    }
}
