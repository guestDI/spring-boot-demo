package com.di.java.demo.javademo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Boat implements Vehicle{
    @Override
    public String getVehicleType() {
        System.out.println("Method");
        return "Boat +++";
    }

    public Boat() {
        System.out.println("Constructor");
    }

    @PostConstruct
    public void postMount(){
        System.out.println("Post constructor");
    }

    @PreDestroy
    public void preUnmount(){
        System.out.println("Pre unmount");
    }
}
