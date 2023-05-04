package io.abdul.compound.patterns.step5;

public class RubberDuck implements Quackable {
    private final Observable observable;

    public RubberDuck() {
        this.observable = new Observable(this);
    }

    public void quack() {
        System.out.println("Squeak");
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
