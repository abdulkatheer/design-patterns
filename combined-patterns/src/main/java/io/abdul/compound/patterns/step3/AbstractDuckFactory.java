package io.abdul.compound.patterns.step3;

public interface AbstractDuckFactory {

    Quackable createMallardDuck();

    Quackable createRedheadDuck();

    Quackable createDuckCall();

    Quackable createRubberDuck();

    Quackable createDecoyDuck();

    Quackable createGooseDuck();
}