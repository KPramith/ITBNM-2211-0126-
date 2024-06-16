/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static Model.databaseConnection.con;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class DeleteInfo {
    
    Statement stmt;
    
    public void DeleteStudent(String sId){
     try
        {
            stmt = con.createStatement();
                   
            String query = "DELETE FROM student WHERE id ='"+sId+"' ";
            
            stmt.executeUpdate(query);
                           
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    } 
    public void DeletePrincipal(String sId){
          try
        {
            stmt = con.createStatement();
                   
            String query = "DELETE FROM principal WHERE id ='"+sId+"' ";
            
            stmt.executeUpdate(query);
                        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
        public void DeleteTeacher(String sId){
          try
        {
            stmt = con.createStatement();
                   
            String query = "DELETE FROM teacher WHERE id ='"+sId+"' ";
            
            stmt.executeUpdate(query);
            
               
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
