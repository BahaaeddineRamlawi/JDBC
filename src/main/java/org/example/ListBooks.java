package org.example;

// List titles from BOOKS table
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class ListBooks {
    public static void main(String[] args) throws Exception {
        RowSetFactory factory = RowSetProvider.newFactory();
        CachedRowSet crs = factory.createCachedRowSet();

        crs.setUrl("jdbc:derby:C:\\Users\\bobra\\Documents\\USJ\\App Dist\\NewDatabase");
        crs.setCommand("select * from app.books");
        crs.execute();

        while(crs.next()){
            String title = crs.getString("title");
            int price = crs.getInt("price");
            System.out.println( title + " for " + price + " $" );
        }
        crs.close();
    }
}