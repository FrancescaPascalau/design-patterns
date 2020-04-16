package com.francesca.pascalau.designpatterns.behavioral.strategy;

public class AmexStrategy extends ValidationStrategy {
    @Override
    public boolean isValid(CreditCard creditCard) {
        boolean isValid = true;
        return isValid;
    }
}
