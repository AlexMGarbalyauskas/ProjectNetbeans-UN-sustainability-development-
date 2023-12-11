package mainhub.sealifeapp;



/**
 *
 * @author ruzel
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;

public final class SeaLife {//start class
    String name, Species, habitat, diet, population;
    int lifespan;
    double length;
    
    //declare arrays for sea life animals
    private ArrayList<String> blueWhaleInfo;
    private ArrayList<String> leatherBackTurleInfo;
    private ArrayList<String> scallopedHammerHeadInfo;
    private ArrayList<String> whiteAbaloneInfo;
    
    //*****************************constructors********************************************
    public SeaLife(String name, String Species, String habitat, String diet, String population, int lifespan, double length) {//start constructor
        this.name = name;
        this.Species = Species;
        this.habitat = habitat;
        this.diet = diet;
        this.lifespan = lifespan;
        this.length = length;
        this.population = population;
        
        //call seaLifeInfo's methods to initialise arrays
        seaLifeInfo1();
        seaLifeInfo2();
        seaLifeInfo3();
        seaLifeInfo4();
    }//end constructor

    // SeaLife constructor
    public SeaLife() {
        //call the seaLifeInfo's method to initialise arrays
        seaLifeInfo1();
        seaLifeInfo2();
        seaLifeInfo3();
        seaLifeInfo4();
    }
  
    
   //******************GET METHODS**************
    public String getName() {
        return name;
    }

    public String getSpecies() {
        return Species;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getDiet() {
        return diet;
    }

    public int getLifespan() {
        return lifespan;
    }

    public double getLength() {
        return length;
    }
    
    public String getPopulation() {
        return population;
    }
    
    //**********************INFO METHODS***********************

    public void seaLifeInfo1(){//start seaLifeInfo1
        blueWhaleInfo = new ArrayList<>();
        blueWhaleInfo.add("Name: Blue Whale");
        blueWhaleInfo.add("Species: Balaenoptera musculus");
        blueWhaleInfo.add("Habitat: Oceans worldwide");
        blueWhaleInfo.add("Lifespan: Up to 90 years");
        blueWhaleInfo.add("Length: Up to 100 feet in length");
        blueWhaleInfo.add("Diet: Mostly small shrimp-like animals called krill");
        blueWhaleInfo.add("Population: 10,000 to 25,000");

    }//end seaLifeInfo1
    
    public void seaLifeInfo2(){//start seaLifeInfo2
        leatherBackTurleInfo = new ArrayList<>();
        leatherBackTurleInfo.add("Name: Leatherback Turtle");
        leatherBackTurleInfo.add("Species: Dermochelys coriacea");
        leatherBackTurleInfo.add("Habitat: Oceans worldwide");
        leatherBackTurleInfo.add("Lifespan: Up to 100 years");
        leatherBackTurleInfo.add("Length: Up to 8.5 feet");
        leatherBackTurleInfo.add("Diet: Jellyfish and other soft-bodied organsims");
        leatherBackTurleInfo.add("Population: 30,000 to 40,000");
    }//end seaLifeInfo2
    
    public void seaLifeInfo3(){//start seaLifeInfo3
        scallopedHammerHeadInfo = new ArrayList<>();
        scallopedHammerHeadInfo.add("Name: Scalloped Hammerhead");
        scallopedHammerHeadInfo.add("Species: Syphyrna lewini");
        scallopedHammerHeadInfo.add("Habitat: Warm coastal waters");
        scallopedHammerHeadInfo.add("Lifespan: Up to 30 years");
        scallopedHammerHeadInfo.add("Length: Up to 8.5 feet");
        scallopedHammerHeadInfo.add("Diet: Fish and Rays");
        scallopedHammerHeadInfo.add("Population: 80% declined");
    }//end seaLifeInfo3
    
    public void seaLifeInfo4(){//start seaLifeInfo4
        whiteAbaloneInfo = new ArrayList<>();
        whiteAbaloneInfo.add("Name: White Abalone");
        whiteAbaloneInfo.add("Species: Haliotis sorensi");
        whiteAbaloneInfo.add("Habitat: Subtidal rocky reefs");
        whiteAbaloneInfo.add("Lifespan: Up to 30 years");
        whiteAbaloneInfo.add("Length: Up to 12 inches");
        whiteAbaloneInfo.add("Diet: detritus and algae");
        whiteAbaloneInfo.add("Population: 1,600 to 2,500");
    }//end seaLifeInfo4
    
    //**********************DISPLAY METHODS*********************
    
    public void displayInfo1(){//start displayInfo1
        //use String Builder to append various parts together (ref:https://www.javatpoint.com/StringBuilder-class)
        StringBuilder infoBuild = new StringBuilder();
        infoBuild.append("BLUE WHALE INFORMATION\n");
        for(String info: blueWhaleInfo){//start for
            infoBuild.append(info).append("\n");
        }//end for
        
        //display blue whale information
        JOptionPane.showMessageDialog(null, infoBuild.toString(), "Blue Whale Information", JOptionPane.INFORMATION_MESSAGE);
    }//end displayInfo1
    
    public void displayInfo2(){//start displayInfo2
        //use String Builder to append various parts together 
        StringBuilder infoBuild = new StringBuilder();
        infoBuild.append("=LEATHERBACK TURTLE INFORMATION=\n");
        for(String info: leatherBackTurleInfo){//start for
            infoBuild.append(info).append("\n");
        }//end for
        
        //display leatherback turtle information
        JOptionPane.showMessageDialog(null, infoBuild.toString(), "LEATHERBACK TURTLE INFORMATION", JOptionPane.INFORMATION_MESSAGE);
    }//end displayInfo2
    
    public void displayInfo3(){//start displayInfo3
        //use String Builder to append various parts together
        StringBuilder infoBuild = new StringBuilder();
        infoBuild.append("SCALLOPED HAMMERHEAD INFORMATION\n");
        for(String info: scallopedHammerHeadInfo){//start for
            infoBuild.append(info).append("\n");
        }//end for
        
        //display scalloped hammerhead information
        JOptionPane.showMessageDialog(null, infoBuild.toString(), "SCALLOPED HAMMERHEAD INFORMATION", JOptionPane.INFORMATION_MESSAGE);
    }//end displayInfo3
    
    public void displayInfo4(){//start displayInfo4
        //use String Builder to append various parts together
        StringBuilder infoBuild = new StringBuilder();
        infoBuild.append("WHITE ABALONE INFORMATION\n");
        for(String info: whiteAbaloneInfo){//start for
            infoBuild.append(info).append("\n");
        }//end for
        
        //display WHITE ABALONE information
        JOptionPane.showMessageDialog(null, infoBuild.toString(), "WHITE ABALONE INFORMATION", JOptionPane.INFORMATION_MESSAGE);
    }//end displayInfo4
    
    
}//end class
