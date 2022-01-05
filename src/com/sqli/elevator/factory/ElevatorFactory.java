package com.sqli.elevator.factory;

import com.sqli.elevator.Elevator;

import java.util.HashMap;
import java.util.Map;

public abstract class ElevatorFactory {
    public abstract Map<String,Elevator> getElevators(String... id);


}

