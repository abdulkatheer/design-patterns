package io.abdul.compound.patterns.step5;

public class DecoyDuck implements Quackable {
    private final Observable observable;

    public DecoyDuck() {
        this.observable = new Observable(this);
    }

    public void quack() {
        System.out.println("<< Silence >>");
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