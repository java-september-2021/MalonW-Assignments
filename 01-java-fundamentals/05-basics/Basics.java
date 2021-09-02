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

    // prints the max of any array ??
    public Integer max(int [] arr){

        int maxNum = arr[0];
        for (int i : arr){
            if (i < maxNum)
                maxNum = i;
        }
        return maxNum;
        }
        // generates only the odd numbers of an array
    public void Oddarray(){
        ArrayList<Integer> y = new ArrayList<Integer>();
        
        for (int i = 0; i < 266; i++){
            if (i % 2 != 0){
                y.add(i);
            }
        }
        System.out.println(y);
    }

    //Average of an array
    public void arrayAvg(int [] arr1){
        double sum = 0.0;
        double avg = 0.0;
        // calculates sum of array numbers
        for (int i = 0; i < arr1.length; i++){
            sum += arr1[i];
        }
        // calculates the average of the array
        avg = sum / arr1.length;

        System.out.println(avg);
    }
    // find numbers greater than a given number in an array
    public void greaterThan(int y){
        int [] array1 = {1,2,5,7,3};
        for (int i : array1){
            if (array1[i] > y){
                System.out.println(array1[i]);
            }
        }
    }
    // Square all values in a given array
    public void Square(){
        int [] arrayx = ArrayList(1,5,10,-2);
        intArrayList [] arrayy = {};
        for (int i : arrayx){
            double z = pow(arrayx[i],2 );
            arrayy.add(z);
        }
        System.out.println(arrayy);
    }
    // Eliminate Negative Numbers
    public void NoNegatives(){
        intArrayList [] noNegs = ArrayList(1,5,10,-6,-3);
        intArrayList [] onlypos = {};
        for (int i : noNegs){
            if(noNegs[i] > 0){
                onlypos.add(noNegs[i]);
            }
        }
        System.out.println(onlypos);
    }
    public void MaxMinAvg(int [] array3){
        intArrayList [] maxminavg = {};
        double sum = 0;
        double avg = 0;
        double maxNum = array3[0];
        double minNum = array3[0];
        for (int i = o; i < array3.length; i++){
            sum += array3[i];
            if(i < maxNum){
                maxNum = i;
            }
            if (i > minNum){
                minNum = i;
            }
        }
        avg = sum / array3.length;
        maxminavg.add(maxNum,minNum,avg);
        System.out.println(maxminavg);
        }
    
    public void Shifting(int [] array4) {
        intArrayList [] shifted = {};
        for(int i = 0; i < array4.length; i ++){
            array4[i] = array4[i+1];
            shifted.add(array4[i]);
            array4[array4.length-1] = 0;
            shifted.add(array4[array4.length-1]);
        }
        System.out.println(shifted);
    }

}
