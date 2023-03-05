package io.abdul.decorator.example1.decorator;

import io.abdul.decorator.example1.component.Beverage;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public abstract String getDescription();
}