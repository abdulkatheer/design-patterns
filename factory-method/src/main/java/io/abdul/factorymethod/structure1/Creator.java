package io.abdul.factorymethod.structure1;

public abstract class Creator {
    public void doSomething() {
        Product product = createProduct();
        System.out.println(product + " created");
    }

    protected abstract Product createProduct();
}
