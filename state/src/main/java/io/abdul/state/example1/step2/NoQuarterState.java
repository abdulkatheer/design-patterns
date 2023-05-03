package io.abdul.state.example1.step2;

public class NoQuarterState implements GumballMachineState {
    private final GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        gumballMachine.setCurrentState(gumballMachine.getHasQuarterState());
        System.out.println("You inserted a quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("You turned but there's no quarter");
        return false;
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

    @Override
    public String toString() {
        return "waiting for quarter";
    }
}
