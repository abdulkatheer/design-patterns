package io.abdul.proxy.structure1;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("Real subject processing the request");
    }
}
