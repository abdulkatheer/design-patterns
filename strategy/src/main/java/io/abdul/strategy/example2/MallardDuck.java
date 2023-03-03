package io.abdul.strategy.example2;

import io.abdul.strategy.example2.behaviours.FlyWithWings;
import io.abdul.strategy.example2.behaviours.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {

		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();

	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}