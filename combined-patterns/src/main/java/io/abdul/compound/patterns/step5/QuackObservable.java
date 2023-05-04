package io.abdul.compound.patterns.step5;

public interface QuackObservable {
    void registerObserver(Observer observer);

    void notifyObservers();
}