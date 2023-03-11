package io.abdul.factorymethod.structure1;

public class ConcreteCreatorB extends Creator {
    @Override
    protected Product createProduct() {
        return new ConcreteProductB();
    }
}
