package io.abdul.strategy.example2;

import io.abdul.strategy.example2.behaviours.FlyWithWings;
import io.abdul.strategy.example2.behaviours.Quack;

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}