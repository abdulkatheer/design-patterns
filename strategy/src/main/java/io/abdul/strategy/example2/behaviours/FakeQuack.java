package io.abdul.strategy.example2.behaviours;

import io.abdul.strategy.example2.behaviours.QuackBehavior;

public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}