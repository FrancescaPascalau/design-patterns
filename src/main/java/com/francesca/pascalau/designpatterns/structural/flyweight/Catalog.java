package com.francesca.pascalau.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Catalog {

    private Map<String, Item> items = new HashMap<>();

    //Factory method
    public Item lookUp(String itemName) {
        if (!items.containsKey(itemName)) {
            items.put(itemName, new Item(itemName));
        }
        return items.get(itemName);
    }

    public int numberOfItems() {
        return items.size();
    }
}
