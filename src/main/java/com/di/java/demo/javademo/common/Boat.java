package com.di.java.demo.javademo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Boat implements Vehicle{
    @Override
    public String getVehicleType() {
        return "Boat +++";
    }
}
