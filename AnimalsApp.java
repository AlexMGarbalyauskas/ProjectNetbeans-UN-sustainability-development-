/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animalsapp;


public class AnimalsApp {
public static void main(String[] args) {
     // Create and display the Menu JFrame
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Menu frame = new Menu();
                frame.setVisible(true);
            }
        });
    
        AnimalUI ui = new AnimalUI();
        ui.menu();
    }
}



    






