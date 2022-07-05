package com.assignment.main;

import com.assignment.beans.Person;
import com.assignment.beans.Vehicle;
import com.assignment.config.ProjectConfig;
import com.assignment.services.VehicleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] arg) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Before");
        var vs1 = context.getBean(Person.class);
        System.out.println("After");
    }
}
