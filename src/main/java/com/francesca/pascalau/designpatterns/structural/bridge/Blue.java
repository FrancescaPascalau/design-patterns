package com.francesca.pascalau.designpatterns.structural.bridge;

public class Blue implements ShapeColor {
    @Override
    public void applyColor() {
        System.out.println("Applying blue.");
    }
}
