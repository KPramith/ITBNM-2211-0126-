/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class DeleteController {
       public static void DeleteStudent(String id){
        new Model.DeleteInfo().DeleteStudent(id);
        JOptionPane.showMessageDialog(null, "Student details has been deleted :", "Successfull", JOptionPane.INFORMATION_MESSAGE);
    }
public static void DeletePrincipal(String id){
    
    new Model.DeleteInfo().DeletePrincipal(id);
        JOptionPane.showMessageDialog(null, "Head Master details has been deleted :", "Successfull", JOptionPane.INFORMATION_MESSAGE);
    
}
    public static void DeleteTeacher(String id){
    
    new Model.DeleteInfo().DeleteTeacher(id);
        JOptionPane.showMessageDialog(null, "Teacher details has been deleted :", "Successfull", JOptionPane.INFORMATION_MESSAGE);
    
}
}
