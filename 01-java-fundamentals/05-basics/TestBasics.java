import java.util.Scanner;
public class TestBasics {
    
    public static void main(String[] args){

        //Creation of input for an array to be used in methods

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array that is to be created::");
        int size = sc.nextInt();
        int [] myArray = new int[size];
        System.out.println("Enter the elements of the array(Enter after each Number)5 ::");
        System.out.println("-----");

        for (int i=0; i < size; i++){
            myArray[i] =sc.nextInt();
        }
        
        Basics tester = new Basics();
            //these work

        // tester.count();
        // System.out.println("-----");
        // tester.odd();
        // System.out.println("-----");
        // System.out.println(tester.sigma());
        // System.out.println("-----");

        // tester.array();
        // System.out.println("-----");

        // tester.Oddarray();
        // System.out.println("-----");

        // tester.greaterThan(4);
        // System.out.println("-----");
        // System.out.println("Maximum value in the array is::"+tester.max(myArray));

        // System.out.println("-----");
        // tester.Square(myArray);
        // System.out.println("-----");
    

        // tester.MaxMinAvg(myArray);
        // System.out.println("-----");

        tester.Shifting(myArray);
        System.out.println("-----");
    }
}
