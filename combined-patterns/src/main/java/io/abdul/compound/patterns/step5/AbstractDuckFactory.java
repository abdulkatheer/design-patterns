package io.abdul.compound.patterns.step5;

public interface AbstractDuckFactory {

    Quackable createMallardDuck();

    Quackable createRedheadDuck();

    Quackable createDuckCall();

    Quackable createRubberDuck();

    Quackable createDecoyDuck();

    Quackable createGooseDuck();
}