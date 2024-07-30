package com.di.java.demo.javademo.rest;

import com.di.java.demo.javademo.common.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class VehicleController {
    private Vehicle myVehicle;
    private Vehicle myVehicle2;

    @Autowired
    public VehicleController(@Qualifier("boat") Vehicle vehicle, @Qualifier("boat") Vehicle vehicle2){
        myVehicle = vehicle;
        myVehicle2 = vehicle2;
    }

//    @Autowired
//    public void setVehicle(Vehicle veh){
//        myVehicle = veh;
//    }

    @GetMapping("/myvehicle")
    public String printMessage(){
        return "This is " + myVehicle.getVehicleType();
    }

    @GetMapping("/check")
    public String check(){
        return "This is " + (myVehicle == myVehicle2);
    }
}
