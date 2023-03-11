package io.abdul.factorymethod.structure1;

public class Client {
    public static void main(String[] args) {
        Creator creator1 = new ConcreteCreatorA();
        creator1.doSomething();

        Creator creator2 = new ConcreteCreatorB();
        creator2.doSomething();
    }
}
