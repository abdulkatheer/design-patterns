package io.abdul.proxy.example1.server;

import java.rmi.Naming;

public class GumballMachineTestDrive {

    public static void main(String[] args) {
        GumballMachineRemote gumballMachine;
        int count;

        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine(args[0], count);
            String serviceLocation = "//" + args[0] + "/gumball-machine";
            Naming.rebind(serviceLocation, gumballMachine);
            System.out.println("Service successfully exposed via RMI.. Access it at rmi" + serviceLocation);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
