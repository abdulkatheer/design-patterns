package io.abdul.state.example1.step3;

public interface GumballMachineState {
    void insertQuarter();

    void ejectQuarter();

    boolean turnCrank();

    void dispense();
}
