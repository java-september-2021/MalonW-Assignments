public class GiantBat extends Mammal {
    public GiantBat(){
        setEnergyLevel(300);
    }

    public void fly(){
        int energyUsed = -50;
        System.out.println("Woosh, The Bat takes off deducting "+ energyUsed *-1 +" points!");
        changeEnergyLevel(energyUsed);
    }

    public void eatHumans(){
        int energyGained = 25;
        System.out.println("Well, nevermind. Energy increased by "+ energyGained + "points.");
        changeEnergyLevel(energyGained);
    }

    public void attackTown(){
        int energyUsed = -100;
        System.out.println("Giant Bat attacks a town, decreasing energy by :" +energyUsed*-1 +"points");
        changeEnergyLevel(energyUsed);

    }


}
