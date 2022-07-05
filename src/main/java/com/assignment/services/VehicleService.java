package com.assignment.services;

import com.assignment.interfaces.Speaker;
import com.assignment.interfaces.Tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON) // it is default scope
public class VehicleService {

    @Autowired
    private Speaker speaker;   //autowiring using Variaable
    private Tyre tyre;

    public Speaker getSpeaker() {
        return speaker;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    @Autowired
    public void setTyre(Tyre tyre) {    // autowiring using setter method
        this.tyre = tyre;
    }

    public void playMusic(){
        speaker.makeSound();
    }

    public void moveVehicle() {
        tyre.rotate();
    }
}
