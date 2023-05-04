package io.abdul.compound.patterns.step5;

public class RedheadDuck implements Quackable {
    private final Observable observable;

    public RedheadDuck() {
        this.observable = new Observable(this);
    }

    public void quack() {
        System.out.println("Quack");
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