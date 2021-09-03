public class TestPuzzleJava {

    public static void main(String[] args){
        PuzzleJava generator = new PuzzleJava();

        generator.getTenRolls();
        generator.getRandomLetter();

        System.out.println("Random character is ::" +generator.getRandomLetter());
        System.out.println("Random generated password is ::" +generator.generatePassword());
        System.out.println("New Random generated password is ::" +generator.getNewPasswordSet(15));
        // Sensei Bonus

        int [] array = {1,2,3,4,5,6,7,8};
        int n = array.length;
        
        System.out.println("Shuffled Array :: "+generator.shuffleArray(array, n));

    }
}