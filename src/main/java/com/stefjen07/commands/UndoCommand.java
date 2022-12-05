package com.stefjen07.commands;

public class UndoCommand extends Command {

    @Override
    public void execute() {
        calculator.undo();
    }

    @Override
    public void undo() {

    }
}
