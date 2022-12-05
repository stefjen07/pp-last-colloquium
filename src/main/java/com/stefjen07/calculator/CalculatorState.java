package com.stefjen07.calculator;

public interface CalculatorState {
    void setCalculator(Calculator calculator);

    void set(double result);
    double get();
}
