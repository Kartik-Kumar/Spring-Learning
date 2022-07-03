package com.example.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component     // instruct this class can be converted to beans,   easy way of creating beans
public class Vehicle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello(){
        System.out.println("printing from vechicle bean");
    }

    @PostConstruct
    public void initialize(){
        this.name = "from initit @postConstruct";
    }

    @PreDestroy
    public void destroy(){
        System.out.println("trying to destroy the beaan");
    }
}
