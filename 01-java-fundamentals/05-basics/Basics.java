import java.util.ArrayList;
public class Basics {
    public void count(){  //prints numbers 1 - 255
    for (int i = 0; i < 256; i++){
        System.out.println(i); 
    }
    }
    // prints odd numbers between 1 -255
    public void odd(){ 
        for (int i=0; i < 256; i++){
            if((i % 2) != 0) {
                System.out.println(i);
            }
        }
    }
    // returns the sum of 1 though 255
    public Integer sigma(){
        int sum = 0;
        for (int i=0; i < 256; i++){
            sum += i;
        }
        return sum;
    }
    // prints out array by index
    public void array(){
        int [] numbers = {1,3,5,7,9,13};
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }

        // generates only the odd numbers of an array
    public void Oddarray(){
        ArrayList<Integer> y = new ArrayList<Integer>();
        
        for (int i = 0; i < 256; i++){
            if (i % 2 != 0){
                y.add(i);
            }
        }
        System.out.println(y);
    }


        // find numbers greater than a given number in an array
        public void greaterThan(int y){
            int [] array1 = {1,2,5,7,3};
            for (int i = 0; i < array1.length; i++){
                if (array1[i] > y){
                    System.out.println(array1[i]);
                }
            }
        }
    
    // prints the max of any array ??
    public  int max(int [] myarray){

        int max= 0;
        for (int i = 0; i < myarray.length; i++){
            if (myarray[i] > max)
                max = myarray[i];
        }
        return max;
        }

    //Average of an array
    public int arrayAvg(int [] myArray){
        int sum = 0;
        int avg = 0;
        // calculates sum of myArray numbers
        for (int i = 0; i < myArray.length; i++){
            sum += myArray[i];
        }
        // calculates the average of the array
        avg = sum / myArray.length;

        return avg;
    }
    // Square all values in a given Array
    public void Square(int [] myArray){
        ArrayList<Double> myArray2 = new ArrayList<Double>();
        for (int i = 0; i < myArray.length; i++){
            double z = Math.pow(myArray[i],2);
            myArray2.add(z);
        }
        System.out.println(myArray2);
    }
    // Eliminate Negative Numbers
    public void NoNegatives(int [] myArray){
        ArrayList<Integer> myArray3 = new ArrayList<Integer>();

        for (int i = 0; i < myArray.length; i++){
            if ( myArray[i] > 0){ 
                myArray3.add(myArray[i]);
            }
        }
        System.out.println(myArray3); 

        }


    public void MaxMinAvg(int [] myArray){
        
        int sum = 0;
        int maxNum = myArray[0];
        int minNum = myArray[0];
        ArrayList<Integer> maxminavg = new ArrayList<Integer>();

        for (int i = 0; i < myArray.length; i++){
            sum += myArray[i];
            if (myArray[i] > maxNum){
                    maxNum = myArray[i];
            } else if( myArray[i] < maxNum){
                minNum = myArray[i];
        }
    }
        int avg = sum / myArray.length;
        maxminavg.add(maxNum);
        maxminavg.add(minNum);
        maxminavg.add(avg);
        System.out.println(maxminavg);
        }
    
    public void Shifting(int [] myArray) {

//         int z = myArray.length - 1;
//         for(int i = 0; i < myArray.length; i ++){
//             if (i+1 == myArray.length){
//                 break;
//             } else {
//             myArray[i] = myArray[i+1];
//             } 
//         }
//         myArray[z]=0;

//         System.out.println(myArray);
//     }
// }
    // Below works if you want to create a new array

        ArrayList<Integer> shifted = new ArrayList<Integer>();
        int z = myArray.length - 1;
        for(int i = 0; i < myArray.length; i ++){
            if (i+1 == myArray.length){
                break;
            } else {
            myArray[i] = myArray[i+1];
            shifted.add(myArray[i]);
            } 
        }
        myArray[z]=0;
        shifted.add(myArray[z]);
        System.out.println("Shifted Array ::"+shifted);
    }

}
