package io.abdul.chain.of.responsibility.structure1;

public class NoOpHandler implements Handler {
    @Override
    public void setNext(Handler successor) {
    }

    @Override
    public void handle(Request request) {
        System.out.println("Chain reached an end..!");
    }
}
