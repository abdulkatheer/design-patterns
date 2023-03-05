package io.abdul.decorator.structure1;

public class ConcreteComponent implements Component {
    @Override
    public void methodA() {
        System.out.println("methodA - Concrete Component");
    }

    @Override
    public void methodB() {
        System.out.println("methodB - Concrete Component");
    }
}
