package com.stefjen07.commands;

import com.stefjen07.exceptions.ZeroDivideException;

public class DivideCommand extends Command {
    double divider;

    public DivideCommand(double divider) throws ZeroDivideException {
        if(divider == 0)
            throw new ZeroDivideException();

        this.divider = divider;
    }

    @Override
    public void execute() {
        setResult(getResult() / divider);
    }

    @Override
    public void undo() {
        setResult(getResult() * divider);
    }
}
