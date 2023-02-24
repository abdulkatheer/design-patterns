package io.abdul.observer.structure2;

public class ConcreteObserver implements Observer {
    public ConcreteObserver(Subject concreteSubject) {
        concreteSubject.registerObserver(this);
    }

    @Override
    public void update(String data) {
        System.out.println("Processing updates ===> " + data);
    }
}
