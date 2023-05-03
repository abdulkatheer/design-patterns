package io.abdul.state.structure1;

public class Context {
    private State currentState;

    public Context() {
        this.currentState = new ConcreteStateA(this);
    }

    public void request() {
        currentState.handle();
    }

    public void setCurrentState(State currentState) {
        System.out.println("Changing state..");
        this.currentState = currentState;
    }

    public void updateContext() {
        System.out.println("Updating context..");
    }
}
