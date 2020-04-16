package com.francesca.pascalau.designpatterns.behavioral.observer;

public class PhoneClient extends Observer {
    public PhoneClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessagge(String message) {
        subject.setState(message + " - sent from phone.");
    }

    @Override
    public void update() {
        System.out.println("Phone stream: " + subject.getState());
    }
}
