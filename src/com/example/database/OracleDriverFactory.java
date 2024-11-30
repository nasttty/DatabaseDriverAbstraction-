package com.example.database;

public class OracleDriverFactory extends DriverFactory {
    @Override
    public DatabaseConnection createConnection() {
        return new OracleDatabaseConnection();
    }
}

class OracleDatabaseConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connected to Oracle database.");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from Oracle database.");
    }
}
