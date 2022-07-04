package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.example.beans")
public class ProjectConfig {

    @Bean
    public Vehicle vehicle1() {
        Vehicle v= new Vehicle();
        v.setName("vehicle1");
        return v;
    }

    @Bean
    //@Primary
    public Vehicle vehicle2() {
        Vehicle v= new Vehicle();
        v.setName("vehicle2");
        return v;
    }

    @Bean
    public Vehicle vehicle3() {
        Vehicle v= new Vehicle();
        v.setName("vehicle3");
        return v;
    }


}