package com.assignment.main;

import com.assignment.beans.Person;
import com.assignment.beans.Vehicle;
import com.assignment.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] arg) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        String[] persons = context.getBeanNamesForType(Person.class);
        Person person = context.getBean(Person.class);
        String[] names = context.getBeanNamesForType(Vehicle.class);
        /*Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.getVehicleServices().playMusic();
        vehicle.getVehicleServices().moveVehicle();*/
        person.getVehicle().getVehicleService().playMusic();
        person.getVehicle().getVehicleService().moveVehicle();
    }
}
