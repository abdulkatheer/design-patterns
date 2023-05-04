package io.abdul.compound.patterns.step3;

public class QuackCounter implements Quackable {
    private static int numberOfQuacks;

    private final Quackable quackable;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        numberOfQuacks++;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }
}
