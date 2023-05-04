package io.abdul.proxy.example1.server;

import io.abdul.proxy.example1.server.GumballMachine;
import io.abdul.proxy.example1.server.GumballMachineState;

public class SoldState implements GumballMachineState {
    private static final long serialVersionUID = -2757860393050800294L;

    private final GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
        return false;
    }

    @Override
    public void dispense() {
        System.out.println("A gumball comes rolling out the slot");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() <= 0) {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setCurrentState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());

        }
    }

    @Override
    public String toString() {
        return "delivering a gumball";
    }
}
