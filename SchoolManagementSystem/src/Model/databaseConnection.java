package Model;


import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class databaseConnection {
    static Connection con;
    public static Connection connection ()
    {
      try
      {
         Class.forName("com.mysql.jdbc.Driver");
         con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/schoolmanagement","root","");
         
      }
      catch(ClassNotFoundException | SQLException e)
      {
          System.out.println(e);
          return null;
      }
      return con;
    }
    
}
