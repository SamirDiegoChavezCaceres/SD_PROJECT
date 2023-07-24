
package com.assignment.bank;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.security.*;
 
public class MainA extends Policy{
     
    private void startServer(){ 
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("BankA", new BankImpl("A"));
            System.out.println("system A is ready");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     
    public static void main(String[] args) throws RemoteException {
        MainA main = new MainA();
        System.setProperty("java.rmi.server.hostname","127.0.0.1");// sets the RMI service to start on local host
        main.startServer();
    }
}
