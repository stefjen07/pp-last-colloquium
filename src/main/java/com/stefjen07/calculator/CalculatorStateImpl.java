package com.stefjen07.calculator;

public class CalculatorStateImpl implements CalculatorState {
    private Calculator calculator;

    private final double result;

    CalculatorStateImpl(double result) {
        this.result = result;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public void set(double result) {
        CalculatorState newState = new CalculatorStateImpl(result);
        newState.setCalculator(calculator);
        calculator.setState(newState);
    }

    public double get() {
        return result;
    }
}
