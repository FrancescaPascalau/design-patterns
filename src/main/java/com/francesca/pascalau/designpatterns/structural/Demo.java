package com.francesca.pascalau.designpatterns.structural;

import com.francesca.pascalau.designpatterns.structural.adapter.Employee;
import com.francesca.pascalau.designpatterns.structural.adapter.EmployeeClient;
import com.francesca.pascalau.designpatterns.structural.bridge.ColoredShape;
import com.francesca.pascalau.designpatterns.structural.bridge.Red;
import com.francesca.pascalau.designpatterns.structural.bridge.RedSquare;
import com.francesca.pascalau.designpatterns.structural.bridge.ShapeColor;
import com.francesca.pascalau.designpatterns.structural.composite.Menu;
import com.francesca.pascalau.designpatterns.structural.composite.MenuItem;
import com.francesca.pascalau.designpatterns.structural.decorator.MeatDecorator;
import com.francesca.pascalau.designpatterns.structural.decorator.Sandwich;
import com.francesca.pascalau.designpatterns.structural.decorator.SimpleSandwich;
import com.francesca.pascalau.designpatterns.structural.facade.Address;
import com.francesca.pascalau.designpatterns.structural.facade.JdbcFacade;
import com.francesca.pascalau.designpatterns.structural.flyweight.Inventory;
import com.francesca.pascalau.designpatterns.structural.proxy.SecurityProxy;
import com.francesca.pascalau.designpatterns.structural.proxy.TwitterService;
import com.francesca.pascalau.designpatterns.structural.proxy.TwitterServiceStub;

import java.util.List;

public class Demo {

    public static void main(String[] args) {

        System.out.println("ADAPTER - Legacy -> Translates interface -> Client, integrate with legacy code, Collections, Streams");
        EmployeeClient client = new EmployeeClient();
        List<Employee> employees = client.getEmployeeList();
        System.out.println(employees);

        System.out.println("BRIDGE - Decouple abstraction and implementation, driver, JDBC");
//        Circle circle = new BlueCircle();
//        Square square = new RedSquare();
//        circle.applyColor();
//        square.applyColor();

        ShapeColor red = new Red();
        ColoredShape square = new RedSquare(red);
        square.applyColor();

        System.out.println("COMPOSITE - Individual objects, components as whole, JSF, REST, Component, Tree structure, Collections");
        Menu menu = new Menu("Kid's Menu");
        MenuItem menuItem = new MenuItem("Fries");
        menu.add(menuItem);
        System.out.println(menu.toString());

        System.out.println("DECORATOR - Inheritance based, Adds new behavior, UI, InputStream, CheckedList");
        Sandwich sandwich = new MeatDecorator(new SimpleSandwich());
        System.out.println(sandwich.make());

        System.out.println("FACADE - Structural Singleton, Make API easier, Reduce extern dependencies, URL, FacesContext");
//        JdbcFacade jdbcFacade = new JdbcFacade();
//        jdbcFacade.createTable();
//        jdbcFacade.insertIntoTable();
//        List<Address> addresses = jdbcFacade.getAddresses();
//        for (Address address : addresses) {
//            System.out.println(address.getCity());
//        }

        System.out.println("FLYWEIGHT - Pattern of patterns, uses Factory, Creation + Structural, Memory optimization, immutability, String");
        Inventory inventory = new Inventory();
        inventory.takeOrder("Upheaval", 123);
        inventory.takeOrder("Concurrency in practice", 435);
        inventory.takeOrder("Upheaval", 989);
        inventory.takeOrder("Upheaval", 111);
        inventory.takeOrder("Effective Java", 242);
        inventory.process();
        System.out.println(inventory.report());

        System.out.println("PROXY - Interface wrapping, adds functionality, security");
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());
        System.out.println(service.getTimeline("test"));

    }
}
