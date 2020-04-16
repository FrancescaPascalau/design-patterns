package com.francesca.pascalau.designpatterns.behavioral.chain;

public class VP extends Handler {

    public void handleRequest(Request request) {
        if (request.getType() == Request.RequestType.PURCHASE) {
            if (request.getAmount() < 1500)
                System.out.println("VP can approve purchases below 1500.");
            else {
                successor.handleRequest(request);
            }
        }
    }
}
