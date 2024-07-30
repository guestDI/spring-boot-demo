package com.di.java.demo.javademo.config;

import com.di.java.demo.javademo.common.Motorcycle;
import com.di.java.demo.javademo.common.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VehicleConfig {
    @Bean("moto")
    public Vehicle motorcycleVehicle(){
        return new Motorcycle();
    }
}
