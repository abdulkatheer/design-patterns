package io.abdul.proxy.example1.client;

import io.abdul.proxy.example1.server.GumballMachineRemote;

import java.rmi.Naming;

public class GumballMonitorTestDrive {

    public static void main(String[] args) {
        String[] location = {"rmi://santafe.mightygumball.com/gumball-machine",
                "rmi://boulder.mightygumball.com/gumball-machine",
                "rmi://austin.mightygumball.com/gumball-machine"};

        if (args.length >= 0) {
            location = new String[1];
            location[0] = "rmi://" + args[0] + "/gumball-machine";
        }

        GumballMonitor[] monitor = new GumballMonitor[location.length];

        for (int i = 0; i < location.length; i++) {
            try {
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballMonitor(machine);
                System.out.println(monitor[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (GumballMonitor gumballMonitor : monitor) {
            gumballMonitor.report();
        }
    }
}
