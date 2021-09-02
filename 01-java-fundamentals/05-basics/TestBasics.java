public class TestBasics {
    
    public static void main(String[] args){

        Basics tester = new Basics();
        tester.count();
        tester.odd();
        System.out.println(tester.sigma());
        tester.array(-1,6,3,23,10,0,-14);
        System.out.println(tester.maxNum());
        tester.Oddarray();
        tester.arrayAvg(-1,2,4,5,9);
        tester.greaterThan(4);
        tester.Square();
        tester.NoNegatives();
        tester.MaxMinAvg(1,5,10,-2);
        tester.Shifting(1,5,10,7,-2);


    }
}
