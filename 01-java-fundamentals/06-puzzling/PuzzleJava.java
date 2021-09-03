import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class PuzzleJava {
    // Generates 10 random numbers in an array
    public void getTenRolls(){
        ArrayList<Integer> randomRolls = new ArrayList<Integer>(); 
        Random numberRandom = new Random();
        for (int i= 0; i < 10; i++){
            int randomNumber = numberRandom.nextInt(21);
            randomRolls.add(randomNumber);
        }
        System.out.println(randomRolls);
    }
    // Generates a random letter from the alphabet
    public char getRandomLetter(){
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Random randomchar = new Random();
            int indexchar = randomchar.nextInt(27);
        return alphabet[indexchar];
    }
    // Generates a random 8 charater password from alphapbet
    public String generatePassword(){
        StringBuilder sb = new StringBuilder(8);
        for( int i = 0; i < 9; i++){
            sb.append(getRandomLetter());
            
        }
        return sb.toString(); 
    }
    // Generates a random password from the alphabet
    public String getNewPasswordSet(int n){
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++){
            sb.append(getRandomLetter());
        }
        return sb.toString();
    }

    //Sensei Bonus shuffles a give array
    public String shuffleArray(int array [], int n){
        Random index = new Random();
        for (int i = n -1; i > 0; i--){
            int j = index.nextInt(i+1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return Arrays.toString(array);
    }
}
