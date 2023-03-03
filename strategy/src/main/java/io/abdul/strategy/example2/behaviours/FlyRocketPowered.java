package io.abdul.strategy.example2.behaviours;

import io.abdul.strategy.example2.behaviours.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
	public void fly() {
		System.out.println("I'm flying with a rocket");
	}
}