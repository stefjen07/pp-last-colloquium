package com.stefjen07.commands;

public class MultiplyCommand extends Command {
    double multiplier;

    public MultiplyCommand(double multiplier) {
        this.multiplier = multiplier;
    }

    @Override
    public void execute() {
        setResult(getResult() * multiplier);
    }

    @Override
    public void undo() {
        setResult(getResult() / multiplier);
    }
}
