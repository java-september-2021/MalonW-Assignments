public class Mammal {
    //energyLevel
    // displayEnergy method
    // starting energy level default 100

    private int energyLevel;
    
    public Mammal(){
        this.energyLevel = 100;
    }

    public int getEnergyLevel(){
        return this.energyLevel;
    }

    public int setEnergyLevel(int energyUsed){
        this.energyLevel = energyUsed;
        return energyLevel;
    }
    
    public int changeEnergyLevel(int energyGained){
        this.energyLevel += energyGained;
        return energyLevel;
    }

    

    public void displayEnergy(){
        System.out.println("This is the energy level of the Mammal is:"+ this.energyLevel);
    }
}
