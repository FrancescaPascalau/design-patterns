package com.francesca.pascalau.designpatterns.behavioral.chain;

public class Director extends Handler {

    public void handleRequest(Request request) {
        if (request.getType() == Request.RequestType.CONFERENCE) {
            System.out.println("Directors can approve conferences.");
        } else {
            successor.handleRequest(request);
        }
    }
}
