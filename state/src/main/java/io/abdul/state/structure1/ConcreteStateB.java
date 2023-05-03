package io.abdul.state.structure1;

public class ConcreteStateB implements State {
    private final Context context;

    public ConcreteStateB(Context context) {
        this.context = context;
    }

    @Override
    public void handle() {
        System.out.println("State B");
        context.updateContext();
        context.setCurrentState(new ConcreteStateA(context));
    }
}
