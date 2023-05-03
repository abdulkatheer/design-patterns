package io.abdul.state.structure1;

public class ConcreteStateA implements State {
    private final Context context;

    public ConcreteStateA(Context context) {
        this.context = context;
    }

    @Override
    public void handle() {
        System.out.println("State A");
        context.updateContext();
        context.setCurrentState(new ConcreteStateB(context));
    }
}
