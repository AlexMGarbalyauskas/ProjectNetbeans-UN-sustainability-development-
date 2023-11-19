/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalsapp;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class AnimalUI {
    private final Animals[] animalList;

    public AnimalUI() {
        // an array of Animals
        animalList = new Animals[]{
                new SiberianTiger("Siberian Tiger", "Panthera tigris altaica", "Forest", "Russia", "Endangered", 500, 1),
                new BlackRhino("Black Rhino", "Diceros bicornis", "Grassland", "Africa", "Critically Endangered", 2500, 2),
                new SnowLeopard("Snow Leopard", "Panthera uncia", "Snowy Mountain", "Nepal, Himalayas", "Vulnerable", 1000, 3),
                new GiantPanda("Giant Panda", "", "Forest", "China", "Vulnerable", 2400, 4),
                new AfricanElephant("African Elephant", "", "Savanna", "Africa", "Critically Endangered", 415000, 5 ),
                new CrossRiverGorilla("Cross River Gorilla","", "", "Jungle Rivers","Critically Endangered",  300, 6),
        };
    }
    
    

    public void menu() {
        // menu options
        int ans = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Select an animal:\n"+
                        "1. Siberian Tiger\n" +
                        "2. Black Rhino\n" +
                        "3. Snow Leopard\n" +
                        "4. Giant Panda\n" +
                        "5. African Elephant\n" +
                        "6. Cross River Gorilla"));

     //information about the selected animal
        displayAnimalInfo(animalList[ans - 1]);
    }

    private void displayAnimalInfo(Animals animal) {
        // Display information about the selected animal
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
    

