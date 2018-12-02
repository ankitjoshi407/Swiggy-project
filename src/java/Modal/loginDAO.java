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

/**
 *
 * @author Ankit
 */
public class loginDAO {
    String name;
    public boolean searchuser(String m_no,String pwd)
    {
       
           boolean flag=false;
         try{
             Class.forName("com.mysql.cj.jdbc.Driver");
          
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel?useSSL=false","root","Parentslobe1");
          
          Statement stmt = con.createStatement();
          
          String query = "select * from login where m_no='"+m_no+"' and pwd='"+pwd+"'";
          
          System.out.println(query);
       
          ResultSet rs = stmt.executeQuery(query);
          if(rs.next())
          {
            name=rs.getString(3);
              flag=true;
          }
         }
         catch(Exception e)
         {
             System.out.print(e);
         }
         return flag;
    }
   public boolean saveuser(login l)
   {
       boolean flag=false;
       try{
            Class.forName("com.mysql.cj.jdbc.Driver");
          
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel?useSSL=false","root","Parentslobe1");
          
          Statement stmt = con.createStatement();
            String query = "insert into login values('"+l.getM_no()+"','"+l.getPwd_get()+"','"+l.getName()+"','"+l.getEmail()+"');";
             System.out.println(query);
       
         int i = stmt.executeUpdate(query);
         
          if(i != 0)
          {
              flag=true;
          }
       }
       catch(Exception e)
       {
           System.out.print(e);
       }
       return flag;
   }
   public String getName()
   {
       return name;
   }
}
