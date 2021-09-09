public class Samurai extends Human {
    public Samurai (){
        this.setName("Samurai");
        this.health = 200;
        numberOfSamurai++;
    }

    private static int numberOfSamurai;

    public Samurai(String name){
        super(name);
        this.health = 200;
        numberOfSamurai++;
    }
    public int howMany(){
        return numberOfSamurai;
    }
    
    public void deathBlow(Human human){
        human.health=0;
        this.health = this.health /2;
        System.out.println(this.name + "performs a death Blow and kills " + human.name );
        System.out.println("After performing the death blow"+ this.name +" health is now at:: "+this.health);
    }

    public void meditate(){
        this.health = this.health*2;
        System.out.println(this.name + "meditates raising his health back to::" +this.health );

    }
    public void displayHealth(){
        System.out.println("Your Samurai:" +this.name+ " Health is at: "+getHealth());
    }
    //print character sheet stats
    public void CharacterSheet(){
        System.out.println("Your Samurai "+getName()+ " stats are as follows: \nStrength: "+getStrength() +"\nIntelligence: "+getIntelligence()+"\nStealth: "+getStealth()+"\nHealth: "+getHealth() );
    }
}
