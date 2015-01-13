package com.bdb.rmiclient.compute;

/**
 * Created by benjamin.beasley on 12/16/14.
 */
public interface Task<T> {
    T execute();
}
