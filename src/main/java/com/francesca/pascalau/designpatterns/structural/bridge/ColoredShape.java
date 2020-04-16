package com.francesca.pascalau.designpatterns.structural.bridge;

public abstract class ColoredShape {

    private ShapeColor shapeColor;

    public ColoredShape(ShapeColor shapeColor) {
        this.shapeColor = shapeColor;
    }

    public abstract void applyColor();
}