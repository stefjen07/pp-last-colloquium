package com.stefjen07.commands;

public class SubtractCommand extends Command {
    double subtrahend;

    public SubtractCommand(double subtrahend) {
        this.subtrahend = subtrahend;
    }

    @Override
    public void execute() {
        setResult(getResult() - subtrahend);
    }

    @Override
    public void undo() {
        setResult(getResult() + subtrahend);
    }
}
