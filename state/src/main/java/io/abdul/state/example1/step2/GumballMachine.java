package io.abdul.state.example1.step2;

public class GumballMachine {
    private final GumballMachineState soldOutState;
    private final GumballMachineState noQuarterState;
    private final GumballMachineState hasQuarterState;
    private final GumballMachineState soldState;

    private GumballMachineState currentState;
    private int count = 0;

    public GumballMachine(int count) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

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

    public int getCount() {
        return count;
    }

    public void setCurrentState(GumballMachineState currentState) {
        this.currentState = currentState;
    }
}