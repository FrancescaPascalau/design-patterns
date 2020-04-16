package com.francesca.pascalau.designpatterns.behavioral.strategy;

public class CreditCard {

    private int number;
    private ValidationStrategy strategy;

    public CreditCard(ValidationStrategy strategy) {
        this.strategy = strategy;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isValid() {
        return strategy.isValid(this);
    }
}
