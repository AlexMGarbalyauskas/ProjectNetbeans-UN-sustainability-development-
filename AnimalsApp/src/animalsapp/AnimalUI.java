/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalsapp;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Alex
 */
public class AnimalUI extends JFrame {
    private final Animals[] animalList;

    public AnimalUI() {
        // an object of arrays for each animal
        animalList = new Animals[]{
                new SiberianTiger("Siberian Tiger", "Panthera tigris altaica", "Northern Forests", "Russia, China ", "Endangered", 500, 1),
                new BlackRhino("Black Rhino", "Diceros bicornis", "Grasslands", "Africa", "Critically Endangered", 5600, 2),
                new SnowLeopard("Snow Leopard", "Panthera uncia", "Snowy Mountains", "Nepal, Tibet", "Vulnerable", 2700, 3),
                new GiantPanda("Giant Panda", "Ailuropoda melanoleuca", "Bamboo Forest", "China", "Vulnerable", 2400, 4),
                new AfricanElephant("African Elephant", "Loxodonta", "Savannas", "Africa", "Critically Endangered", 415000, 5 ),
                new CrossRiverGorilla("Cross River Gorilla","Gorilla gorilla diehli", "Jungle", "Africa,Congo","Critically Endangered",  300, 6),
        };
    }
    
    public void menu() {
        // menu options selects animals
       int selection;
    try {
        selection = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Select an animal:\n" +
                        "1. Siberian Tiger\n" +
                        "2. Black Rhino\n" +
                        "3. Snow Leopard\n" +
                        "4. Giant Panda\n" +
                        "5. African Elephant\n" +
                        "6. Cross River Gorilla"));

        //display info 
        displayAnimalInfo(animalList[selection - 1]);
    } catch (NumberFormatException ignored) {
       
    }
    }

    private void displayAnimalInfo(Animals animal) {
        // Displays information about the selected animal
        JOptionPane.showMessageDialog(null,
                "Animal Name: " + animal.getAnimalName()  
                        + "\n" +
                        "Species: " + animal.getSpecies() 
                        + "\n" +
                        "Habitat: " + animal.getHabitat()
                        + "\n" +
                        "Location: " + animal.getLocation()
                        + "\n" +
                        "Status: " + animal.getStatus()
                        + "\n" +
                        "Population: " + animal.getPopulation()
                        + "\n" +
                        "ID: " + animal.getId());
    }
}
    

