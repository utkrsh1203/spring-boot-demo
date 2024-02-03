package com.example.SpringBootDemo.repo;

import com.example.SpringBootDemo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop lap){
        System.out.println("Saved in Database..");
    }

}
