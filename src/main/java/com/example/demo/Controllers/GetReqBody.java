package com.example.demo.Controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

class User {
    String firstName;
    String lastName;

    User (String a, String b){
        this.firstName = a;
        this.lastName = b;
    }

    public void displayData () {
        System.out.println("User details");
    }
}
@SpringBootApplication
@RestController
public class GetReqBody {
    String firstName;
    @PostMapping("/register")
    public String getBody(@RequestBody String d ){
        User userOne = new User(d, d);
        userOne.displayData();
        return d;
    }

}

