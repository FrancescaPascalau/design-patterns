package com.francesca.pascalau.designpatterns.behavioral.state;

public class FanOffState extends State {

    private Fan fan;

    public FanOffState(Fan fan) {
        this.fan = fan;
    }

    public void handleRequest() {
        System.out.println("Turning fan low");
        fan.setState(fan.getFanLow());
    }

    public String toString() {
        return "Fan is off";
    }
}
