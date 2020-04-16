package com.francesca.pascalau.designpatterns.structural.composite;

import java.util.Iterator;

public class Menu extends MenuComponent {

    public Menu(String name) {
        this.name = name;
    }

    public MenuComponent add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
        return menuComponent;
    }

    public MenuComponent remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
        return menuComponent;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(print(this));
        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            stringBuilder.append(menuComponent.toString());
        }
        return stringBuilder.toString();
    }
}
