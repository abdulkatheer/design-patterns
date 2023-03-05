package io.abdul.decorator.structure1;

public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void methodA() {
        System.out.println("methodA - ConcreteDecoratorA Component");
        component.methodA();
    }

    @Override
    public void methodB() {
        System.out.println("methodB - ConcreteDecoratorA Component");
        component.methodB();
    }
}
