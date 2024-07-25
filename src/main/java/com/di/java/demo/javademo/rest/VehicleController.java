package com.di.java.demo.javademo.rest;

import com.di.java.demo.javademo.common.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class VehicleController {
    private Vehicle myVehicle;

//    @Autowired
//    public VehicleController(Vehicle vehicle){
//        myVehicle = vehicle;
//    }

    @Autowired
    public void setVehicle(Vehicle veh){
        myVehicle = veh;
    }

    @GetMapping("/myvehicle")
    public String printMessage(){
        return "This is " + myVehicle.getVehicleType();
    }
}
