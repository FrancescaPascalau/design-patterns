package com.francesca.pascalau.designpatterns.behavioral.command;

public class Light {

    public Boolean isOn = false;

    public void toggle() {
        if (isOn) {
            off();
            isOn = false;
        } else {
            on();
            isOn = true;
        }
    }

    public void on() {
        System.out.println("Light is ON");
    }

    public void off() {
        System.out.println("Light is OFF");
    }
}
