package com.francesca.pascalau.designpatterns.behavioral.template;

public class StoreOrder extends OrderTemplate {
    @Override
    public void doCheckout() {
        System.out.println("Checking out from store.");
    }

    @Override
    public void doPayment() {
        System.out.println("Paying...");
    }
}
