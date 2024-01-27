package org.example;

// Create BOOKS table in APP schema
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class CreateTable {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:derby:C:\\Users\\bobra\\Documents\\USJ\\App Dist\\NewDatabase");
        Statement st = con.createStatement();
        st.executeUpdate("create table app.books (id int primary key GENERATED ALWAYS AS IDENTITY, title varchar(50),  price int)");
        st.close();
        con.close();
    }
}