package com.di.java.demo.javademo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class Car implements Vehicle{
    @Override
    public String getVehicleType() {
        return "Car";
    }
}
