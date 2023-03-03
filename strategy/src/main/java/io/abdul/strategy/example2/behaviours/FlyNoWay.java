package io.abdul.strategy.example2.behaviours;

import io.abdul.strategy.example2.behaviours.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("I can't fly");
	}
}