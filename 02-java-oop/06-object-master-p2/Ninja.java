public class Ninja extends Human {
    public Ninja (){
        this.setName("Ninja");
        this.stealth = 10;
    }

    public Ninja(String name){
        super(name);
        this.stealth = 10;
        
    }
    
    public void steal(Human human){
        human.health -= this.stealth;
        this.health += this.stealth;
    System.out.println(getName() + " steals from  " + human.name + " lowering his health by : "+this.stealth +" points.");

    }

    public void runAway(){
        this.health -= 10;
        System.out.println(this.name + " sneaks away. "+ this.name + " health lowers by 10 and is now at::" +this.health );

    }
    public void displayHealth(){
        System.out.println("Your ninja:" +this.name+ " Health is at: "+getHealth());
    }
    //print character sheet stats
    public void CharacterSheet(){
        System.out.println("Your ninja "+getName()+ " stats are as follows: \nStrength: "+getStrength() +"\nIntelligence: "+getIntelligence()+"\nStealth: "+getStealth()+"\nHealth: "+getHealth() );
    }

}
