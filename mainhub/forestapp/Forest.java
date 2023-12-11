/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainhub.forestapp;

import java.io.Serializable;

/**
 *
 * @author Fred Banda
 */
public class  Forest  implements Serializable {
    private String category, name, location, species, status;
    private int population;

    public Forest() {
    }

    public Forest(String category, String name, String location, String species, String status, int population) {
        this.category = category;
        this.name = name;
        this.location = location;
        this.species = species;
        this.status = status;
        this.population = population;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Forest{" + "category=" + category + ", name=" + name + ", location=" + location + ", species=" + species + ", status=" + status + ", population=" + population + '}';
    }
    
    
    
    
}
