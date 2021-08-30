public class FizzBuzz {
    public String fizzBuzz(int number) {
        
        boolean divby3 = (number % 3) == 0;
        boolean divby5 = (number % 5) == 0;
        String tostring = String.valueOf(number);

        if (divby3 && divby5) {
            return "FizzBuzz";
        } else if (divby3) {
            return "Fizz";
        } else if(divby5){
            return "Buzz";
        } else {
            return tostring;
        }
    }

    // NINJA BONUS:
    // Create an overloaded method for fizzBuzz
public String fizzBuzz(
        int number,
        String multOf3Word,
        String multOf5Word,
        String multOf15Word
        ){
        boolean divby3 = (number % 3) == 0;
        boolean divby5 = (number % 5) == 0;

        String tostring = String.valueOf(number);

        
        if (divby3 && divby5) {
            return multOf15Word;
        } else if (divby3) {
            return multOf3Word;
        } else if(divby5){
            return multOf5Word;
        } else {
            return tostring;
        }
        }
    }
    
