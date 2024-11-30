package com.example.database;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the database type (Oracle, MySQL, PostgreSQL): ");
        String dbType = scanner.nextLine();

        DriverFactory factory;

        switch (dbType) {
            case "Oracle":
                factory = new OracleDriverFactory();
                break;
            case "MySQL":
                factory = new MySQLDriverFactory();
                break;
            case "PostgreSQL":
                factory = new PostgreSQLDriverFactory();
                break;
            default:
                System.out.println("Unsupported database type: " + dbType);
                return;
        }

        DatabaseConnection connection = factory.createConnection();
        connection.connect();
        connection.disconnect();
    }
}
