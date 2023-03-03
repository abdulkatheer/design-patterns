package io.abdul.strategy.example2;

import io.abdul.strategy.example2.behaviours.FlyNoWay;
import io.abdul.strategy.example2.behaviours.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}