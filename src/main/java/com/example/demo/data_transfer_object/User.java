package com.example.demo.data_transfer_object;

//Containes private fields with getters and setters
//should not have any business logic
//represents data from an entitu

public class User {
    private  String username;
    private  String email ;

    User (String u, String e ){
        this.email = e;
        this.username = u;
    }

    // getter and setters


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public  String toString () {
        return "User details are " +
                username +
                email ;
    }

}
