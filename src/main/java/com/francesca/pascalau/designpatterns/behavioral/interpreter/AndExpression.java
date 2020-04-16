package com.francesca.pascalau.designpatterns.behavioral.interpreter;

public class AndExpression implements Expression {

    private Expression firstWord = null;
    private Expression secondWord = null;

    public AndExpression(Expression firstWord, Expression secondWord) {
        this.firstWord = firstWord;
        this.secondWord = secondWord;
    }

    @Override
    public boolean interpret(String word) {
        return firstWord.interpret(word) && secondWord.interpret(word);
    }
}
