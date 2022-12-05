package com.stefjen07;

import com.stefjen07.commands.Command;

import java.util.Stack;

public class Calculator {
    private Stack<Command> commandHistory = new Stack<>();
    private CalculatorState calculatorState = new CalculatorState();

    void executeCommand(Command command) {
        command.setCalculator(this);
        command.execute();
        commandHistory.add(command);
    }

    void undo() {
        commandHistory.pop().undo();
    }
}
