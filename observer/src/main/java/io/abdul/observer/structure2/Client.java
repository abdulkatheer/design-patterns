package io.abdul.observer.structure2;

public class Client {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver(subject);


        subject.notifyObservers();
        subject.notifyObservers();

        subject.removeObserver(observer);

        subject.notifyObservers();
    }
}
