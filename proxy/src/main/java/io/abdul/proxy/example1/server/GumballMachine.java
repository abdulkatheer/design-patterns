package io.abdul.proxy.example1.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    private static final long serialVersionUID = -1263719567916558433L;

    private final GumballMachineState soldOutState;
    private final GumballMachineState noQuarterState;
    private final GumballMachineState hasQuarterState;
    private final GumballMachineState soldState;
    private final GumballMachineState winnerState;
    private final String location;

    private GumballMachineState currentState;
    private int count;

    public GumballMachine(String location, int count) throws RemoteException {
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.winnerState = new WinnerState(this);
        this.location = location;

        this.count = count;
        if (count > 0) {
            currentState = noQuarterState;
        } else {
            currentState = soldOutState;
        }
    }

    public void insertQuarter() {
        currentState.insertQuarter();
    }

    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    public void turnCrank() {
        if (currentState.turnCrank()) {
            currentState.dispense();
        }
    }

    private void dispense() {
        currentState.dispense();
    }

    public void refill(int numGumBalls) {
        this.count = numGumBalls;
        currentState = noQuarterState;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count > 0) {
            count = count - 1;
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder()
                .append("\nMighty Gumball, Inc.")
                .append("\nJava-enabled Standing Gumball Model #2004\n")
                .append("Inventory: ")
                .append(count)
                .append(" gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\nMachine is ");
        result.append(currentState.toString());
        result.append("\n");
        return result.toString();
    }

    public GumballMachineState getSoldOutState() {
        return soldOutState;
    }

    public GumballMachineState getNoQuarterState() {
        return noQuarterState;
    }

    public GumballMachineState getHasQuarterState() {
        return hasQuarterState;
    }

    public GumballMachineState getSoldState() {
        return soldState;
    }

    public GumballMachineState getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        System.out.println("Returning count");
        return count;
    }

    @Override
    public String getLocation() throws RemoteException {
        System.out.println("Returning location");
        return location;
    }

    @Override
    public GumballMachineState getState() throws RemoteException {
        System.out.println("Returning currentState");
        return currentState;
    }

    public void setCurrentState(GumballMachineState currentState) {
        this.currentState = currentState;
    }
}