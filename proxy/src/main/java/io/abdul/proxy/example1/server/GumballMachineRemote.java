package io.abdul.proxy.example1.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {
    int getCount() throws RemoteException;
    String getLocation() throws RemoteException;
    GumballMachineState getState() throws RemoteException;
}
