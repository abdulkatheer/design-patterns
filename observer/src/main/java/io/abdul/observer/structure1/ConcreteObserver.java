package io.abdul.observer.structure1;

public class ConcreteObserver implements Observer {
    private final ConcreteSubject concreteSubject;

    public ConcreteObserver(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
        concreteSubject.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println(concreteSubject.getState());
        concreteSubject.doSomething();
    }
}
