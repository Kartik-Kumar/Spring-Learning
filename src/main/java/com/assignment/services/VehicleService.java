package com.assignment.services;

import com.assignment.interfaces.Speaker;
import com.assignment.interfaces.Tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
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
