package com.example.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Vehicle {

    public Vehicle() {
        System.out.println("Vehicle is created");
    }
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

    @Override
    public String toString(){
        return "vehicle name is- " + name;
    }

    @PostConstruct
    public void settingVechicleName() {
        this.setName("BMW");
    }

}
