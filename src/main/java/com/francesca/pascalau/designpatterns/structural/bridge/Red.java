package com.francesca.pascalau.designpatterns.structural.bridge;

public class Red implements ShapeColor {
    @Override
    public void applyColor() {
        System.out.println("Applying red.");
    }
}
