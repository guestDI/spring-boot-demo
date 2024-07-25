package com.di.java.demo.javademo.common;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
    @Override
    public String getVehicleType() {
        return "Car +++";
    }
}
