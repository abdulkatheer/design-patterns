package io.abdul.observer.structure2;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        System.out.println("Registered observer..!");
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        System.out.println("Removed observer..!");
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Notifying observers");
        observers.forEach(observer -> observer.update("Subject's state"));
    }
}
