package com.francesca.pascalau.designpatterns.structural.bridge;

public class BlueCircle extends Circle {

    public BlueCircle(ShapeColor shapeColor) {
        super(shapeColor);
    }

    @Override
    public void applyColor() {
        System.out.println("Applying blue");
    }
}
