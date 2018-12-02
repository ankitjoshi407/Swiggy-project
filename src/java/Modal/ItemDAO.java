/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Ankit
 */
public class ItemDAO {
      public ArrayList<Item> searchItems(String itemname) {
      ArrayList<Item> l = new ArrayList<>();
        
        try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel?useSSL=false","root","Parentslobe1");
          
          Statement stmt = con.createStatement();
          
          String query = "select * from itemlist where itemname='"+itemname+"'";
          
          System.out.println(query);
          
          ResultSet rs = stmt.executeQuery(query);
          
          while(rs.next()) {
          
              Item i = new Item();
              
              i.setItemname(rs.getString(2));
              i.setPrice(rs.getString(3));
              
              
              l.add(i);
              
          }
//          System.out.println("t");
      }
      catch(Exception e)
      {
         // flag=false;
          
          System.out.println(e);
          
         // e.printStackTrace();
      }
        
        return l;
    }
      
      public ArrayList<Item> showItems() {
      ArrayList<Item> l = new ArrayList<>();
        
        try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel?useSSL=false","root","Parentslobe1");
          
          Statement stmt = con.createStatement();
          
          String query = "select * from itemlist;";
          
          System.out.println(query);
          
          ResultSet rs = stmt.executeQuery(query);
          
          while(rs.next()) {
          
              Item i = new Item();
              i.setId(rs.getInt(1));
              i.setItemname(rs.getString(2));
              i.setPrice(rs.getString(3));
              
              
              l.add(i);
              
          }
//          System.out.println("t");
      }
      catch(Exception e)
      {
         // flag=false;
          
          System.out.println(e);
          
         // e.printStackTrace();
      }
        
        return l;
    }
}
