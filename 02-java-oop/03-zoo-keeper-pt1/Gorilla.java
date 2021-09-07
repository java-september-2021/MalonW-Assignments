public class Gorilla extends Mammal {

    int energyLevel = 100;

    public void throwSomething(){
        int energyUsed = -5;
        System.out.println("The Gorilla has thrown something and reduced his energy by " + energyUsed*-1 +" points.");
        changeEnergyLevel(energyUsed);
    }

    public void eatBananas(){
        int energyGained = 10;
        System.out.println("The Gorilla ate a Banana and gained "+ energyGained + " points of energy");
        changeEnergyLevel(energyGained);
    }

    public void climb(){
        int energyUsed = -10;
        System.out.println("The Gorilla climbs and uses " + energyUsed*-1 +" points of energy.");
        changeEnergyLevel(energyUsed);
    }

}
