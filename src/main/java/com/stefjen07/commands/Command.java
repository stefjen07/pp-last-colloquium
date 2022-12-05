package com.stefjen07.commands;

import com.stefjen07.calculator.Calculator;
import com.stefjen07.calculator.CalculatorState;

public abstract class Command {
    Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public CalculatorState getCalculatorState() {
        return calculator.getState();
    }

    public void setResult(double result) {
        getCalculatorState().set(result);
    }

    public double getResult() {
        return getCalculatorState().get();
    }

    public void execute() {

    }

    public void undo() {

    }
}
