/**
 * Created by benjamin.beasley on 12/16/14.
 */
package com.bdb.rmiclient.compute;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Compute extends Remote {
    <T> T executeTask(Task<T> t) throws RemoteException;
}
