package com.assignment.implementation;

import com.assignment.interfaces.Speaker;

public class SonySpeaker implements Speaker {

    @Override
    public void makeSound() {
        System.out.println("Sony sound");
    }
}
