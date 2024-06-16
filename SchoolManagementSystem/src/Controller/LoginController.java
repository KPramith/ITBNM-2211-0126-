/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DBSearch;
import View.Home;
import View.Login;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author saran
 */
public class LoginController {
    ResultSet rs = null;
    
    
    public void adminLogin(String adminName, String password, JFrame frame){
        String passWord = "", username="";
        if(adminName.equals("") || password.equals("")){
            new Login().errormsg.setText("Empty fields!");
        }else{
            rs = new DBSearch().searchAllAdmin();
            try {
                while(rs.next()){
                    passWord = rs.getString("password");
                    username = rs.getString("username");
                }
                if(passWord.equals(password) && adminName.equals(username)){
                    new Home().setVisible(true);
                    frame.setVisible(false);
                }else{
                    new Login().errormsg.setText("Invalid Username or Password!");
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
