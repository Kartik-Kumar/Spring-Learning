package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Person {

    @Autowired     // can be optional if there is one and only one construtor ut do  it anyway for readablity
    public Person(Vehicle vehicle) {
        System.out.println("Person is created");
        this.vehicle = vehicle;
    }
    private String name;
    private final Vehicle vehicle;  // using contructor variable can be made final  but then you cannot have setter for this

    public String getName() {
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public void setVehicle(Vehicle vehicle) {
//        this.vehicle = vehicle;
//    }
    @PostConstruct
    public void settingPersonName() {
        this.setName("Rama");
    }
}
