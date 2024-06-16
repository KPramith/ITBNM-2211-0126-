/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author saran
 */
public class DBSearch {
    ResultSet rs = null;
    Statement stmt = null;
    Connection con = null;
    
    public ResultSet searchAllAdmin(){
        String query = "SELECT * FROM admin";
        con = new databaseConnection().connection();
            
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(DBSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
        public ResultSet searchStudents(){
         String query = "SELECT * FROM student";
         con = new databaseConnection().connection();
            
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(DBSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
            
    }
     
         public ResultSet searchTeachers(){
         String query = "SELECT * FROM teacher";
         con = new databaseConnection().connection();
            
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(DBSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
            
    }
         public ResultSet searchPrincipals(){
         String query = "SELECT * FROM principal";
         con = new databaseConnection().connection();
            
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(DBSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
            
    }
}
