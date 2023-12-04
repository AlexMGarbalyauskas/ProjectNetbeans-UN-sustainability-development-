/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainhub;

import Jframe.MainHubGUI;

/**
 *
 * @author Alex
 */
public class MainHubApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainHubGUI frame = new MainHubGUI();
                frame.setVisible(true);
            }
        });
        
    }
    
}
