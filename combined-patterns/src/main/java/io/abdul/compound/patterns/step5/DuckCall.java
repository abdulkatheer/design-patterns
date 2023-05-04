package io.abdul.compound.patterns.step5;

public class DuckCall implements Quackable {
    private final Observable observable;

    public DuckCall() {
        this.observable = new Observable(this);
    }

    public void quack() {
        System.out.println("Kwak");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}