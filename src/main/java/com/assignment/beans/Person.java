package com.assignment.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("PersonBean")
public class Person {
    @Autowired
    public Person(@Qualifier("VehicleBean") Vehicle vehicle) {
        System.out.println("Bean Person created");
        this.vehicle = vehicle;
    }
    private String name;
    private final Vehicle vehicle;

    public String getName() {
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setName(String name) {
        this.name = name;
    }
}
