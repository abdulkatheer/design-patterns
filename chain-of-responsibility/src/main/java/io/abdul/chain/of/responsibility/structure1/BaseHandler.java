package io.abdul.chain.of.responsibility.structure1;

public abstract class BaseHandler implements Handler {
    protected Handler successor;

    public BaseHandler() {
        this.successor = new NoOpHandler();
    }

    @Override
    public void setNext(Handler successor) {
        this.successor = successor;
    }
}
