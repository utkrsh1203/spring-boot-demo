package com.example.SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Autowired
    Laptop lappy;
    public void code(){
//        System.out.println("Coding");
    }
}
