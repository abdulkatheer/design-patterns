package io.abdul.command.structure1;

public class ConcreteCommand implements Command {
    private final Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action1();
    }

    @Override
    public void undo() {
        receiver.action2();
    }
}
