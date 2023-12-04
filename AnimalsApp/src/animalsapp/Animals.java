/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalsapp;
/**
 *
 * @author Alex
 */
public abstract class Animals {
    //variables info for each animal
    String animalName; 
    String species; 
    String habitat;
    String location; 
    String status; 
    int id; 
    int population; 
    
    //constructor
    public Animals(String animalName,String species, String habitat,String location, String status, int population, int id){
        this.animalName = animalName;
        this.species = species; 
        this.habitat = habitat;
        this.location = location; 
        this.status = status; 
        this.population = population; 
        this.id = id; 
        
    }
    
    
    public abstract double Charity();

    //getters
    public String getHabitat() {
        return habitat;
    }

    public String getStatus() {
        return status;
    }

    public int getPopulation() {
        return population;
    }

    public String getSpecies() {
        return species;
    }

    public int getId() {
        return id;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getLocation() {
        return location;
    }
    
   
}
