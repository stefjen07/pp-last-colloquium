package com.stefjen07.calculator;

public class CalculatorStateImpl {
    private Calculator calculator;

    private final double result;

    CalculatorState(double result) {
        this.result = result;
    }

    public void set(double result) {

        calculator.setState()
    }

    public double get() {
        return result;
    }
}
