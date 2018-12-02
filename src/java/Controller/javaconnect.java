/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ankit
 */
public class javaconnect {
    private javaconnect(){}
    static Connection conn;
    public static Connection connectDb(){
    
        try {
            //step 1:
            Class.forName("com.mysql.cj.jdbc.Driver");
          conn=DriverManager.getConnection ("jdbc:mysql://localhost:3306/hotel?useSSL=false","root","Parentslobe1");
        } catch (Exception ex) {
            System.out.print(ex);
        }
        return conn;
      		//
}
  
}


