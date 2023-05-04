package io.abdul.proxy.example1.server;

import java.io.Serializable;

public interface GumballMachineState extends Serializable {
    void insertQuarter();

    void ejectQuarter();

    boolean turnCrank();

    void dispense();
}
