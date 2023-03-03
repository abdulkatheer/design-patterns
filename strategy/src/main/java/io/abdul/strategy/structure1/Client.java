package io.abdul.strategy.structure1;

public class Client {
    public static void main(String[] args) {
        Context c1 = new Context(new ConcreteStrategy1());
        c1.runBusinessLogic();
        c1.setStrategy(new ConcreteStrategy2());
        c1.runBusinessLogic();
    }
}
