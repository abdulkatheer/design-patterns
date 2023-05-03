package io.abdul.state.example1.step2;

public class GumballMachineTestDrive {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(2);

        System.out.println(gumballMachine);

        System.out.println("### Success");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        System.out.println("### Success");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("### Failure");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("### Refilling...");
        gumballMachine.refill(5);
        System.out.println(gumballMachine);

        System.out.println("### Success");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}
