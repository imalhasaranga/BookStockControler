/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import View.LoginUI;
import View.MainUI;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author Gihan
 */
public class Pos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel()); 
            MainUI mainwin = new MainUI();
            LoginUI login = new LoginUI(mainwin);
            login.setVisible(true);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Pos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
