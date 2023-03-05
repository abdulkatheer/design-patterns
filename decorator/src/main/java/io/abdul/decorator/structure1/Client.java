package io.abdul.decorator.structure1;

public class Client {
    public static void main(String[] args) {
        Component concreteComponent = new ConcreteComponent();
        concreteComponent.methodA();
        concreteComponent.methodB();

        Component decorated =
                new ConcreteDecoratorB(
                        new ConcreteDecoratorA(
                                new ConcreteComponent()));
        decorated.methodA();
        decorated.methodB();
    }
}
