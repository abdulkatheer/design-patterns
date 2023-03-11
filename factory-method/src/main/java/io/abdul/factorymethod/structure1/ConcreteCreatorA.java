package io.abdul.factorymethod.structure1;

public class ConcreteCreatorA extends Creator {
    @Override
    protected Product createProduct() {
        return new ConcreteProductA();
    }
}
