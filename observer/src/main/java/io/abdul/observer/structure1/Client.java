package io.abdul.observer.structure1;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver(subject);


        subject.notifyObservers();
        subject.notifyObservers();

        subject.removeObserver(observer);

        subject.notifyObservers();
    }
}
