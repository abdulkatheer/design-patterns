package io.abdul.command.structure1;

public class Client {
    public static void main(String[] args) {
        Command command = new ConcreteCommand(new Receiver());
        Invoker invoker = new Invoker();
        invoker.setCommand(command);

        invoker.onExecuteTrigger();
        invoker.onUndoTrigger();
    }
}
