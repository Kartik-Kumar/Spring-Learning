package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.beans.VetoableChangeListener;
import java.util.Random;
import java.util.function.Supplier;

public class Example {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var person = context.getBean(Person.class);
        //var vehicle = context.getBean(Vehicle.class);

        System.out.println("this is person - " + person.getName());
        //System.out.println("this is Vechicle-" + vehicle.getName());
        System.out.println("this is person vehicle- " + person.getVehicle());
    }
}
