package com.example.database;

public class PostgreSQLDriverFactory extends DriverFactory {
    @Override
    public DatabaseConnection createConnection() {
        return new PostgreSQLDatabaseConnection();
    }
}

class PostgreSQLDatabaseConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL database.");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from PostgreSQL database.");
    }
}
