package io.abdul.proxy.example1.server;

import java.util.Random;

public class HasQuarterState implements GumballMachineState {
    private static final long serialVersionUID = 8963828610326137961L;

    private final Random randomWinner = new Random(System.currentTimeMillis());

    private transient final GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
    }

    @Override
    public boolean turnCrank() {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setCurrentState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setCurrentState(gumballMachine.getSoldState());
        }
        return true;
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public String toString() {
        return "waiting for turn of crank";
    }
}
