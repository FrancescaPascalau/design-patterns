package com.francesca.pascalau.designpatterns.creational;

import com.francesca.pascalau.designpatterns.creational.abstractfactory.AbstractFactory;
import com.francesca.pascalau.designpatterns.creational.abstractfactory.FactoryProducer;
import com.francesca.pascalau.designpatterns.creational.abstractfactory.Shape;
import com.francesca.pascalau.designpatterns.creational.factory.Website;
import com.francesca.pascalau.designpatterns.creational.factory.WebsiteFactory;

public class Demo {

    public static void main(String[] args) {

        System.out.println("SINGLETON - Db connection, Logger, RunTime...");
        SingletonDemo instance1 = SingletonDemo.getInstance();
        System.out.println(instance1);
        SingletonDemo instance2 = SingletonDemo.getInstance();
        System.out.println(instance2);

        System.out.println("BUILDER - (immutability) StringBuilder");
        BuilderDemo.Builder builder = new BuilderDemo.Builder();
        builder.field1("Field1");
        //.field2("Field2").field3("Field3");
        BuilderDemo builderDemo = builder.build();
        System.out.println(builderDemo.getField1());

        System.out.println("PROTOTYPE - Clone, Object.clone(), interface, shallow vs. deep copy ...");
        PrototypeDemo prototype = new PrototypeDemo("1");
        System.out.println(prototype);
        PrototypeDemo prototypeClone = (PrototypeDemo) prototype.clone();
        System.out.println(prototypeClone);

        System.out.println("FACTORY - Interface method to create objects, opposite of Singleton");
        Website website = WebsiteFactory.getWebsite("blog");
        System.out.println(website);
        Website site = WebsiteFactory.getWebsite("site");
        System.out.println(site);

        System.out.println("ABSTRACT FACTORY - Factory of Factories, common interface, Frameworks");
        AbstractFactory shapeFactory = FactoryProducer.getFactory("square");
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

    }
}