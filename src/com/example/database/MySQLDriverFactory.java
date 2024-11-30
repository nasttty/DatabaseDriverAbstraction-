package com.example.database;

public class MySQLDriverFactory extends DriverFactory {
    @Override
    public DatabaseConnection createConnection() {
        return new MySQLDatabaseConnection();
    }
}

class MySQLDatabaseConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connected to MySQL database.");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from MySQL database.");
    }
}
