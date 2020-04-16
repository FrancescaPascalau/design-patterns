package com.francesca.pascalau.designpatterns.behavioral.interpreter;

public class Interpreter {

    public static Expression buildInterpreterTree() {
        Expression terminal = new TerminalExpression("Lions");
        Expression terminal2 = new TerminalExpression("Tigers");
        Expression terminal3 = new TerminalExpression("Bears");
        Expression or = new OrExpression(terminal, terminal2);
        Expression and = new AndExpression(terminal2,terminal3);
        return terminal;
    }
}
