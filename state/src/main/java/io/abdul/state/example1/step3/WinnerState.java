package io.abdul.state.example1.step3;

public class WinnerState implements GumballMachineState {
    private final GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
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
            gumballMachine.releaseBall();
            System.out.println("YOU'RE A WINNER! You got two gumballs for your quarter");
            if (gumballMachine.getCount() <= 0) {
                gumballMachine.setCurrentState(gumballMachine.getSoldOutState());
                System.out.println("Oops, out of gumballs!");
            } else {
                gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
            }
        }
    }

    @Override
    public String toString() {
        return "delivering a gumball";
    }
}
