public class Wizard extends Human {
    public Wizard (){
        this.setName("Wizard");
        this.health = 50;
        this.intelligence = 8;
    }

    public Wizard(String name){
        super(name);
        this.health = 50;
        this.intelligence = 8;
    }
    
    public void heal(Human human){
        human.health += this.intelligence;
    System.out.println(this.name + "cast heal on " + human.name + " raising his health by : "+this.intelligence +" points.");

    }

    public void fireball(Human human){
        human.health -= this.intelligence * 3;
        System.out.println(this.name + " casts Fireball at " +human.name + " hitting them.  Causing "+human.name + " to lose "+ human.health + " points in health");

    }
    public void displayHealth(){
        System.out.println("Your wizard:" +this.name+ " Health is at: "+getHealth());
    }
    //print character sheet stats
    public void CharacterSheet(){
        System.out.println("Your wizard "+getName()+ " stats are as follows: \nStrength: "+getStrength() +"\nIntelligence: "+getIntelligence()+"\nStealth: "+getStealth()+"\nHealth: "+getHealth() );
    }
}

