package io.abdul.strategy.example2;

import io.abdul.strategy.example2.behaviours.FlyNoWay;
import io.abdul.strategy.example2.behaviours.MuteQuack;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}