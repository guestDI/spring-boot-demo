package com.di.java.demo.javademo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Car implements Vehicle{
    @Override
    public String getVehicleType() {
        return "Car +++";
    }
}
