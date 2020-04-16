package com.francesca.pascalau.designpatterns.structural.bridge;

public class RedSquare extends Square {

    public RedSquare(ShapeColor shapeColor) {
        super(shapeColor);
    }

    @Override
    public void applyColor() {
        System.out.println("Applying red");
    }
}
