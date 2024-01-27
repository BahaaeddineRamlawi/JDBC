package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:derby:C:\\Users\\bobra\\Documents\\USJ\\App Dist\\NewDatabase;create=true");
        System.out.println("Connected To Derby DataBase!");
        con.close();
    }
}