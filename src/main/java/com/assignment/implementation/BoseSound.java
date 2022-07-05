package com.assignment.implementation;

import com.assignment.interfaces.Speaker;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BoseSound implements Speaker {

    @Override
    public void makeSound() {
        System.out.println("Bose Sound");
    }
}
