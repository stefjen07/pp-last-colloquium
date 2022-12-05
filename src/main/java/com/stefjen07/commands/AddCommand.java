package com.stefjen07.commands;

public class AddCommand extends Command {
    double addition;

    public AddCommand(double addition) {
        this.addition = addition;
    }

    @Override
    public void execute() {
        setResult(getResult() + addition);
    }

    @Override
    public void undo() {
        setResult(getResult() - addition);
    }
}
