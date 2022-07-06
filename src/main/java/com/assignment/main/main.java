package com.assignment.main;

import com.assignment.beans.Person;
import com.assignment.beans.Vehicle;
import com.assignment.config.ProjectConfig;
import com.assignment.services.VehicleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] arg) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var vs1 = context.getBean(VehicleService.class);
        var vs2 = context.getBean(VehicleService.class);
        System.out.println(vs1.hashCode());
        System.out.println(vs2.hashCode());
        if(vs1 != vs2) System.out.println("prototype");
    }
}
