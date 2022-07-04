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
    @Autowired // @Autowired(required = false) will avooid the NoSUchBeanDefinationException if the bean is not available during Autowiring process
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

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @PostConstruct
    public void settingPersonName() {
        this.setName("Rama");
    }
}
