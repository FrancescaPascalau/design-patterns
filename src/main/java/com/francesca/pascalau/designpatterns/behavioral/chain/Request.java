package com.francesca.pascalau.designpatterns.behavioral.chain;

public class Request {

    private RequestType type;
    private double amount;

    public Request(RequestType type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public RequestType getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public enum RequestType {
        CONFERENCE,
        PURCHASE
    }
}
