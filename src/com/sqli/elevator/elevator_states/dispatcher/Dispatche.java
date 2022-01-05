package com.sqli.elevator.elevator_states.dispatcher;

import com.sqli.elevator.Elevator;

import java.util.Map;

public interface Dispatche {
    public String min_distance(int floor);
    public void init(Map<String, Elevator> elevatorsMap) ;
}
