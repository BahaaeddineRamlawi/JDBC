package org.example;

// Insert a row into BOOKS table
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AddBook {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:derby:C:\\Users\\bobra\\Documents\\USJ\\App Dist\\NewDatabase");
        PreparedStatement ps = con.prepareStatement("insert into app.books(title,price) values(?,?)");
        ps.setString(1,"Harry Potter");
        ps.setInt(2,430);
        ps.executeUpdate();
        ps.setString(1,"Java Comp. Ref");
        ps.setInt(2,500);
        ps.executeUpdate();
        ps.close();
        con.close();
    }
}