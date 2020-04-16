package com.francesca.pascalau.designpatterns.structural.flyweight;

public class Order {

    private final int orderNumber;
    private Item item;

    public Order(int orderNumber, Item item) {
        this.orderNumber = orderNumber;
        this.item = item;
    }

    void processOrder() {
        System.out.println("Processing order number: " + orderNumber + " with item: " + item);
    }
}
