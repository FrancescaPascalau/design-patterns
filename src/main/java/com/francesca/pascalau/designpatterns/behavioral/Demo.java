package com.francesca.pascalau.designpatterns.behavioral;

import com.francesca.pascalau.designpatterns.behavioral.chain.CEO;
import com.francesca.pascalau.designpatterns.behavioral.chain.Director;
import com.francesca.pascalau.designpatterns.behavioral.chain.Request;
import com.francesca.pascalau.designpatterns.behavioral.chain.VP;
import com.francesca.pascalau.designpatterns.behavioral.command.Command;
import com.francesca.pascalau.designpatterns.behavioral.command.Light;
import com.francesca.pascalau.designpatterns.behavioral.command.Switch;
import com.francesca.pascalau.designpatterns.behavioral.command.ToggleCommand;
import com.francesca.pascalau.designpatterns.behavioral.interpreter.Expression;
import com.francesca.pascalau.designpatterns.behavioral.iterator.BikeRepository;
import com.francesca.pascalau.designpatterns.behavioral.mediator.Mediator;
import com.francesca.pascalau.designpatterns.behavioral.mediator.TurnOnCommand;
import com.francesca.pascalau.designpatterns.behavioral.memento.Caretaker;
import com.francesca.pascalau.designpatterns.behavioral.memento.Employee;
import com.francesca.pascalau.designpatterns.behavioral.observer.MessageStream;
import com.francesca.pascalau.designpatterns.behavioral.observer.PhoneClient;
import com.francesca.pascalau.designpatterns.behavioral.observer.Subject;
import com.francesca.pascalau.designpatterns.behavioral.state.Fan;
import com.francesca.pascalau.designpatterns.behavioral.strategy.AmexStrategy;
import com.francesca.pascalau.designpatterns.behavioral.strategy.CreditCard;
import com.francesca.pascalau.designpatterns.behavioral.template.OrderTemplate;
import com.francesca.pascalau.designpatterns.behavioral.template.StoreOrder;
import com.francesca.pascalau.designpatterns.behavioral.template.WebOrder;
import com.francesca.pascalau.designpatterns.behavioral.visitor.CarPartShippingVisitor;
import com.francesca.pascalau.designpatterns.behavioral.visitor.PartsOrder;
import com.francesca.pascalau.designpatterns.behavioral.visitor.Wheel;

import java.util.Iterator;

import static com.francesca.pascalau.designpatterns.behavioral.interpreter.Interpreter.buildInterpreterTree;

public class Demo {

    public static void main(String[] args) {
        System.out.println("CHAIN OF RESPONSABILITY - Decoupling of sender and receiver, Interface handlers, Logger");
        Director john = new Director();
        VP mark = new VP();
        CEO flavius = new CEO();

        john.setSuccessor(mark);
        mark.setSuccessor(flavius);

        Request request = new Request(Request.RequestType.CONFERENCE, 500);
        john.handleRequest(request);
        request = new Request(Request.RequestType.PURCHASE, 1000);
        john.handleRequest(request);
        request = new Request(Request.RequestType.PURCHASE, 1501);
        john.handleRequest(request);

        System.out.println("COMMAND - Encapsulate each request as object, undo, Runnable, Actions");
        Light light = new Light();
        Switch lightSwitch = new Switch();
        Command onCommand = new ToggleCommand(light);
        lightSwitch.storeAndExecute(onCommand);
        lightSwitch.storeAndExecute(onCommand);
        lightSwitch.storeAndExecute(onCommand);

        System.out.println("INTERPRETER - Grammar, Map a domain, Pattern");
        String context = "Lions";
//        String context = "Bears";
//        String context = "Lions Tigers";
        Expression define = buildInterpreterTree();
        System.out.println(context + " is " + define.interpret(context));

        System.out.println("ITERATOR - Traverse a collection, interface based");
        BikeRepository repo = new BikeRepository();
        repo.addBike("Cervelo");
        repo.addBike("Fuji");
        Iterator<String> iteratorDemo = repo.iterator();
        while (iteratorDemo.hasNext()) {
            System.out.println(iteratorDemo.next());
        }

        System.out.println("MEDIATOR - Loose coupling, hub, router, Timer");
        Mediator mediator = new Mediator();
        mediator.registerLight(light);
        Command turnOnLights = new TurnOnCommand(mediator);
        turnOnLights.execute();

        System.out.println("MEMENTO - Externalize internal state, restore object to previous state, Rollback, Serializable");
        Caretaker caretaker = new Caretaker();
        Employee employee = new Employee();
        employee.setName("Francesca");
        caretaker.save(employee);
        System.out.println(employee);
        employee.setName("Francesca Pascalau");
        System.out.println(employee);
        caretaker.revert(employee);
        System.out.println(employee);

        System.out.println("OBSERVER - Decoupling, one to many, event handling, publisher - subscriber, MVC, EventListener, Topic");
        Subject subject = new MessageStream();
        PhoneClient phoneClient = new PhoneClient(subject);
        phoneClient.addMessagge("Hey!!!");

        System.out.println("STATE - State behavior, separate what from where, context unaware, if/else");
        Fan fan = new Fan();
        fan.pullChain();
        System.out.println(false);
        fan.pullChain();
        System.out.println(false);

        System.out.println("STRATEGY - Eliminate conditional statements, behaviour per class, Comparator");
        CreditCard creditCard = new CreditCard(new AmexStrategy());
        creditCard.setNumber(123);
        System.out.println("Is the credit card valid: " + creditCard.isValid());

        System.out.println("TEMPLATE - Code reuse, frameworks, IoC, Collections.sort()");
        OrderTemplate webOrder = new WebOrder();
        webOrder.processOrder();
        OrderTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder();

        System.out.println("VISITOR - Separate algorithm from object, open-closed principle, Element, ElementVisitor");
        PartsOrder order = new PartsOrder();
        order.addPart(new Wheel());
        order.acceptPart(new CarPartShippingVisitor());
    }
}