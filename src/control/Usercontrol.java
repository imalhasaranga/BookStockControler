/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author Gihan
 */
public class Usercontrol {
    User user;
    
    
    
    public void newUserControl(){
        user = new User();
        if(user.addNewUser()){
            JOptionPane.showMessageDialog(null, "Done! Successfully Added New User!", "Done!", 1); 
        }else{
            JOptionPane.showMessageDialog(null, "Error! fromcontrol, Try again", "Error!", 0);
        }
    }
    
}
