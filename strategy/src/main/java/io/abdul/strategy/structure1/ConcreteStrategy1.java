package io.abdul.strategy.structure1;

public class ConcreteStrategy1 implements Strategy {
    @Override
    public void execute() {
        System.out.println("ConcreteStrategy1 calculating");
    }
}
