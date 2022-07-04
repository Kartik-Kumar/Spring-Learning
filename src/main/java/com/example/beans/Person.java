package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Person {

    public Person() {
        System.out.println("Person is created");
    }
    private String name;

    //@Autowired
    private Vehicle vehicle;

    public String getName() {
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Autowired //@Autowired(required = false)  // not prod  // it doesnt matter how bean created eithe rby @Component or @bean
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @PostConstruct
    public void settingPersonName() {
        this.setName("Rama");
    }
}


// you can also do by consturctor
//void person(Vehicle vehicle){
//    this.vehicle = vehicle;
//}

//in this way, we can make the vechile private and final