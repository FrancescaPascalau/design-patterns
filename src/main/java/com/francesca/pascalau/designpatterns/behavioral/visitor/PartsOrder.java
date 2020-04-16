package com.francesca.pascalau.designpatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrder implements CarPart {

    List<CarPart> parts = new ArrayList<>();

    public void addPart(CarPart carPart) {
        parts.add(carPart);
    }

    public List<CarPart> getParts() {
        return Collections.unmodifiableList(parts);
    }

    @Override
    public void acceptPart(CarPartVisitor visitor) {
        for (CarPart part : parts) {
            part.acceptPart(visitor);
        }
        visitor.visit(this);
    }
}
