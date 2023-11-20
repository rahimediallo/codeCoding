package com.connection;

public interface Service {
    void execute() throws Exception;
    void setConnection(Connection c);
}
