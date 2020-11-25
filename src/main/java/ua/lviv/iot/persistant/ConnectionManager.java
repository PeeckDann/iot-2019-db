package ua.lviv.iot.persistant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    private static final String url = "jdbc:mysql://localhost:3306/office_tech?useUnicode"
            + "=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";

    private static final String username = "user3";

    private static final String password = "new_password_3";

    private static Connection connection = null;

    private ConnectionManager() {
    }

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                try {
                    connection = DriverManager.getConnection(url, username, password);
                } catch (SQLException exeption) {
                    printExeption(exeption);
                }
            }
        } catch (SQLException exeption) {
            printExeption(exeption);
        }
        return connection;
    }

    private static void printExeption(SQLException exeption) {
        System.out.println("SQL Exeption: " + exeption.getMessage());
        System.out.println("SQL State: " + exeption.getSQLState());
        System.out.println("SQL Error Code: " + exeption.getErrorCode());
    }
}