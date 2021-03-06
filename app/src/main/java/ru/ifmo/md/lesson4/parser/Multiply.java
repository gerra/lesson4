package ru.ifmo.md.lesson4.parser;

import ru.ifmo.md.lesson4.CalculationException;

/**
 * Created by german on 04.10.14.
 */
public class Multiply extends BinaryOperation {
    Multiply(Expression first, Expression second) {
        super(first, second);
    }

    @Override
    public double evaluate() throws CalculationException {
        return first.evaluate() * second.evaluate();
    }
}
