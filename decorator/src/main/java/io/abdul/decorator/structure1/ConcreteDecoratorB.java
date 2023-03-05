package io.abdul.decorator.structure1;

public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void methodA() {
        System.out.println("methodA - ConcreteDecoratorB Component");
        component.methodA();
    }

    @Override
    public void methodB() {
        System.out.println("methodB - ConcreteDecoratorA Component");
        component.methodB();
    }
}
