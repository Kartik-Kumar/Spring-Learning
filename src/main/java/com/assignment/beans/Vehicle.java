package com.assignment.beans;

import com.assignment.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "VehicleBean")
public class Vehicle {

    public Vehicle(){
        System.out.println("vechicle bean created");
    }
    private String vehicleName;
    private VehicleService vehicleService;

    public String getVehicleName() {
        return vehicleName;
    }

    public VehicleService getVehicleService() {
        return vehicleService;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    @Autowired(required = false)
    public void setVehicleService(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }
}
