package com.example.config;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.xml.validation.Validator;
import java.util.Vector;

@Configuration
public class ProjectConfig {

    @Bean
    public Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("mercedies");
        return vehicle;
    }

//    @Bean(name = "v1")
//    public Vehicle vehicle1() {
//        Vehicle vehicle = new Vehicle();
//        vehicle.setName("auto");
//        return vehicle;
//    }

    @Bean    // using parameter
    public Person person(Vehicle vehicle) {
        Person person = new Person();
        person.setName("Kartik Kumaar");
        person.setVehicle(vehicle);
        return person;
    }
}


// Question : what if we have two vechicle bean ? how the context know which one to inject? - try @Qualifier()