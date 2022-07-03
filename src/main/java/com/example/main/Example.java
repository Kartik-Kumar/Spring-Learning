package com.example.main;

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

        Vehicle audiVehicle = new Vehicle();
        audiVehicle.setName("bean_created_using_audiSupplier");
        Supplier<Vehicle> audiSupplier = () -> audiVehicle;

        Supplier<Vehicle> marutiSupplier = () -> {
            Vehicle marutiVehicle = new Vehicle();
            marutiVehicle.setName("bean_created_using_MarutiSupplier");
            return marutiVehicle;
        };

        Random random = new Random();
        var r = random.nextInt(100);
        System.out.println("Random number: " + r);
        if(r % 2 == 0) {
            context.registerBean("audiBean", Vehicle.class, audiSupplier);  // introduced in spring 5
        }
        else {
            context.registerBean("marutiBean", Vehicle.class, marutiSupplier);
        }

        Vehicle audi = null, maruti = null;

        try {
            audi = context.getBean("audiBean", Vehicle.class);
        }
        catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            System.out.println("Error while creating audi bean");
        }

        try {
            maruti = context.getBean("marutiBean", Vehicle.class);
        }
        catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            System.out.println("Error while creating maruti bean");
        }

        if(audi != null){
            System.out.println(audi.getName());
        }
        else System.out.println(maruti.getName());
    }
}
