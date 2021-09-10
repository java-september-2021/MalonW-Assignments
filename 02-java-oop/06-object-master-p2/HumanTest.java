public class HumanTest {
    public static void main(String[] args) {

        // Human h1 = new Human("Gandolf");
        // Human h2 = new Human("Dritzz");
        // Human h3 = new Human("Noih");
        Wizard wiz1 = new Wizard("Gandolf");
        Samurai sam1 = new Samurai("Super Sam");
        Ninja nin1 = new Ninja("Dritzz");
        Samurai sam2 = new Samurai("Sammy");


        wiz1.fireball(sam1);
        sam1.displayHealth();
        nin1.runAway();
        nin1.displayHealth();
        nin1.CharacterSheet();
        System.out.println("There are " + sam1.howMany() +" Samarai");
        sam1.deathBlow(sam2);
        sam2.displayHealth();
        wiz1.heal(sam2);
        sam2.displayHealth();
        wiz1.displayHealth();
        sam1.meditate();
        sam1.displayHealth();

        wiz1.CharacterSheet();
        nin1.CharacterSheet();
        sam1.CharacterSheet();
        sam2.CharacterSheet();


        

        // h1.CharacterSheet();
        // h1.attack(h2);
        // h2.attack(h3);
        // h3.attack(h1);
        // h1.displayHealth();
        // h2.displayHealth();
        // h3.displayHealth();
        // h1.CharacterSheet();
        // h2.CharacterSheet();
        // h3.CharacterSheet();





    }

}
