package com.bdb.rmiclient.compute;

import org.junit.Assert;
import org.junit.Test;
import java.lang.System;
import java.lang.SecurityManager;

import java.rmi.AccessException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by benjamin.beasley on 12/16/14.
 */
public class ComputeEngineTest {

    /**
     * Asserts that RMI can connect.
     * Fails if exception thrown during RMI binding.
     */
    @Test
    public void testRMIConnectivity() throws AccessException, RemoteException {
        String name = "Compute1234";
        Compute engine = new ComputeEngine();
        Compute stub = (Compute) UnicastRemoteObject.exportObject(engine, 0);
        Registry registry = LocateRegistry.getRegistry();
        registry.rebind(name, stub);
        System.out.println("ComputeEngine bound");
    }
}
