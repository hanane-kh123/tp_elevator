package com.sqli.elevator.elevator_states;

import com.sqli.elevator.Elevator;

public class StopState implements ElevatorStatee {
    private Elevator elevator=new Elevator();


    @Override
    public int distance(int floor , int c) {
        return -1;
    }

    @Override
    public void setContext(Context context) {

    }
}
