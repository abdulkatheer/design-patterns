package io.abdul.state.example1.step2;

public class SoldOutState implements GumballMachineState {
    private final GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("You turned, but there are no gumballs");
        return false;
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public String toString() {
        return "sold out";
    }
}
