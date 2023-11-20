package com.connection;

public interface Connection {
    void commit();
    void rollback();
    void close();

}
