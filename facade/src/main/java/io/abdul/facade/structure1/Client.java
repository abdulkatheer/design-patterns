package io.abdul.facade.structure1;

public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade(new Component1(), new Component2(), new Component3(), new Subsystem1());

        facade.process();
    }
}
