package io.abdul.command.structure1;

public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void onExecuteTrigger() {
        command.execute();
    }

    public void onUndoTrigger() {
        command.undo();
    }
}
