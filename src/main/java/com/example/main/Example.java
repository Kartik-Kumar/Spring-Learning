package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Vehicle name from non-spring context is: " + vehicle.getName());
        /*
        The var keyword was introduced in Java 10. Type inference is used in
        var keyword in which it detects automatically the datatype of a variable
        based on the surrounding context.
        * */
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // exception : No qualifying bean of type 'com.example.beans.Vehicle
        //Vehicle veh = context.getBean(Vehicle.class);

        //overload of getBean with parameter = provide the name for the beans which provided in bean Annotation
        Vehicle veh = context.getBean("v1", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh.getName());

        Vehicle veh2 = context.getBean("v2", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh2.getName());

        //not providing name of the bean, in this case @primary annotated bean will be considered
        Vehicle veh3 = context.getBean("v3",Vehicle.class);
        System.out.println(" primary Vehicle name from Spring Context is: " + veh3.getName());


    }
}
