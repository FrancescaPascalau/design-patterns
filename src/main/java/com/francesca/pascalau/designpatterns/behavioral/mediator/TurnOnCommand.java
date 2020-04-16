package com.francesca.pascalau.designpatterns.behavioral.mediator;

import com.francesca.pascalau.designpatterns.behavioral.command.Command;

public class TurnOnCommand implements Command {

    public Mediator mediator;

    public TurnOnCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOnAllLights();
    }
}
