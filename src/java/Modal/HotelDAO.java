/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Ankit
 */
public class HotelDAO {
    
    public ArrayList<Hotel> searchHotels(String state) {
    
        ArrayList<Hotel> l = new ArrayList<>();
        
        try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel?useSSL=false","root","Parentslobe1");
          
          Statement stmt = con.createStatement();
          
          String query = "select * from hotellist where state='"+state+"'";
          
          System.out.println(query);
          
          ResultSet rs = stmt.executeQuery(query);
          
          while(rs.next()) {
          
              Hotel h = new Hotel();
              
              h.setAddress(rs.getString(3));
              
              h.setMno(rs.getString(4));
              
              h.setName(rs.getString(1));
              
              h.setState(rs.getString(2));
              
              l.add(h);
              
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
