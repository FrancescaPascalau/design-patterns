package com.francesca.pascalau.designpatterns.behavioral.state;

public class FanLowState extends State {
    private Fan fan;

    public FanLowState(Fan fan) {
        this.fan = fan;
    }

    public void handleRequest() {
        System.out.println("Turning fan med");
        fan.setState(fan.getFanMed());
    }

    public String toString() {
        return "Fan is low";
    }
}
