package mainhub.sealifeapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ruzel
 */
import javax.swing.JOptionPane;
public class SeaLifeUI {//start SeaLifeUI
    SeaLife water = new SeaLife();
    
    public void mainMenu(){//start mainMenu
        //try-catch statement to handle errorrs (ref:https://www.w3schools.com/java/java_try_catch.asp)
        try {//start try
            int option = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                        =CHOOSE A SEA LIFE= 
                                                                        1: Blue Whale
                                                                        2: Leatherback Turtle
                                                                        3: Scalloped Hammerhead
                                                                        4: White Abalone"""));
        switch(option) {//start switch
            case 1:
                water.displayInfo1();
                break;
            case 2:
                water.displayInfo2();
                break;
            case 3:
                water.displayInfo3();
                break;
            case 4:
                water.displayInfo4();
                break;
            default:
                JOptionPane.showMessageDialog(null, "ERROR! PLEASE TRY AGAIN");
            
            }//end switch
  
        }//end try
        
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "ERROR! ENTER A VALID NUMBER");}
        
    }//end mainMenu
    
    
    
}//end SeaLifeUI

