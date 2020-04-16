package com.francesca.pascalau.designpatterns.behavioral.state;

public class FanMedState extends State {
    private Fan fan;

    public FanMedState(Fan fan) {
        this.fan = fan;
    }

    public void handleRequest() {
        System.out.println("Turning fan off");
        fan.setState(fan.getFanOff());
    }

    public String toString() {
        return "Fan is med";
    }
}
