package io.abdul.strategy.example2.behaviours;

import io.abdul.strategy.example2.behaviours.QuackBehavior;

public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
