public class Human {
    // classes Wizard, Ninja, Samurai
    //Properties: Strength, Intelligence, Stealth, and Health
    // starting values for all except health is 3, health is 100
    // Actions: Attack == object decreases by value of strength
    protected int health;
    protected int strength;
    protected int intelligence;
    protected int stealth;
    protected String name;

    public Human(){
        this.health = 100;
        this.strength = 3;
        this.intelligence = 3;
        this.stealth = 3;
        this.name = "Default Human";

    }
    public Human(String name){
        this.health = 100;
        this.strength = 3;
        this.intelligence = 3;
        this.stealth = 3;
        this.name = name;
        
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.health;
    }

    public int setHealth(int health){
        this.health = health;
        return health;
    }

    public int getStrength(){
        return this.strength;
    }
    public int setStrength(int strength){
        this.strength = strength;
        return this.strength;
    }

    public int getIntelligence(){
        return this.intelligence;
    }
    public int setIntelligence(int intelligence){
        this.intelligence = intelligence;
        return this.intelligence;
    
    }
    public int getStealth(){
        return this.stealth;
    }
    public int setStealth(int stealth){
        this.stealth = stealth;
        return stealth;
    }

    public int changeHealth(int healthLost){
        this.health += healthLost;
        return health;
    }
    
    public void attack(Human human){
        human.health -= this.strength;
        System.out.println(this.name +"attacks " +human.name);
        System.out.println(human.name +" takes damage from " +this.name + ". Health now at "+human.getHealth());

        //print
    }
    
    public void displayHealth(){
        System.out.println("Your Human:" +this.name+ " Health is at: "+getHealth());
    }
    //print character sheet stats
    public void CharacterSheet(){
        System.out.println("Your Human "+getName()+ "stats are as follows: \nStrength: "+getStrength() +"\nIntelligence: "+getIntelligence()+"\nStealth: "+getStealth()+"\nHealth: "+getHealth() );

    }





}
