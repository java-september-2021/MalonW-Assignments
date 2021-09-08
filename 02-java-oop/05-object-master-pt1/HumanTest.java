public class HumanTest {
    public static void main(String[] args) {

        Human h1 = new Human("Gandolf");
        Human h2 = new Human("Dritzz");
        Human h3 = new Human("Noih");


        h1.CharacterSheet();
        h1.attack(h2);
        h2.attack(h3);
        h3.attack(h1);
        h1.displayHealth();
        h2.displayHealth();
        h3.displayHealth();
        h1.CharacterSheet();
        h2.CharacterSheet();
        h3.CharacterSheet();
    }  
}
