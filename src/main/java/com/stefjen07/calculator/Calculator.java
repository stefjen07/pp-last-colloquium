package com.stefjen07.calculator;

import com.stefjen07.commands.Command;

import java.util.Stack;

public class Calculator {
    private final Stack<Command> commandHistory = new Stack<>();
    private CalculatorState calculatorState;

    public Calculator() {
        this(new CalculatorStateImpl(0));
    }

    public Calculator(CalculatorState calculatorState) {
        this.calculatorState = calculatorState;
        this.calculatorState.setCalculator(this);
    }

    public void executeCommand(Command command) {
        command.setCalculator(this);
        command.execute();
        commandHistory.add(command);
    }

    public void undo() {
        commandHistory.pop().undo();
    }

    public void setState(CalculatorState calculatorState) {
        this.calculatorState = calculatorState;
    }

    public CalculatorState getState() {
        return calculatorState;
    }

    public double getResult() {
        return getState().get();
    }
}
