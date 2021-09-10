import java.util.Random;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
public class BankAccount {
   //display Account number
   //display checking Account and savings account balances
   // deposit method
   // withdraw method
   //checking balance
    private int accountNumber = 0;
    private double checkingBalance = 0.00;
    private double savingsBalance = 0.00;
    private static int numberOfAccounts = 0;
    private double totalCash = 0.00;

    //Constructor for a BankAccount
    public BankAccount(){
        numberOfAccounts ++;
        this.checkingBalance = 0.00;
        this.savingsBalance = 0.00;
        totalCash += this.checkingBalance + this.savingsBalance;
        this.accountNumber = acctNumGen();

    }
    // returns a random 10 digit account number
    public int NumGen (){
        Random an = new Random();

        Integer acctnum = an.nextInt(10);
        return acctnum;
    }


    public int acctNumGen(){
        for(int i =0; i <11; i++){
        this.accountNumber = accountNumber + NumGen();
        }
        return accountNumber;
    }
    public int getAccountTotal(){
        return numberOfAccounts;
    }

    public double getTotalCash(){
        return totalCash;
    }

    public double getCheckingAccountBalance(){
        
        return checkingBalance;
    }
    public double getSavingsAccountBalance(){
        return savingsBalance;
    }

    public void depositMoney(boolean checking, double amount){
        if(checking == true) {
            checkingBalance += amount;
            totalCash += amount;
            System.out.print("\n$"+ amount + " deposited into checking.\nBalance of checking account is now $"+checkingBalance);
            } else {
                savingsBalance += amount;
                totalCash += amount;
                System.out.println("\n$"+amount+" deposited into savings.\nBalance of savings account is now $"+savingsBalance);
            }
    }
    public void withdrawMoney(boolean checking, double amount){
        if (checking == true){
            if (amount < checkingBalance){
            checkingBalance -= amount;
            totalCash -= amount;
            System.out.println("\n$"+amount+" was withdrawn from checking account.\nBalance of checking account is now $"+checkingBalance);
            }else{
                System.out.println("Insufficeint Funds!");
            }
        } else {
            if (amount < savingsBalance){
            savingsBalance -= amount;
            totalCash -= amount;
            System.out.print("\n$"+amount+" was withdrawn from savings account.\nBalance of savings account is now $"+savingsBalance);
            }else {
                System.out.println("Insufficeint Funds!");

            }
        }
    }
    public void viewTotalCash(){
        totalCash = checkingBalance + savingsBalance;
        System.out.println("\nThe total Cash between Checking and Savings available for withdraw is ::"+totalCash);
    }



}
