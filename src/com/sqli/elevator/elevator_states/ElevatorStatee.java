package com.sqli.elevator.elevator_states;

import com.sqli.elevator.Elevator;

public interface ElevatorStatee {
    public  int distance(int floor,int c);
    public void setContext(Context context);
}
