public class BankAccount {
   //display Account number
   //display checking Account and savings account balances
   // deposit method
   // withdraw method
   //checking balance
    private int accountNumber = 0;
    private static double checkingBalance = 0.00;
    private static double savingsBalance = 0.00;
    private static int numberOfAccounts = 0;
    private static double totalCash = 0.00;


    public BankAccount(){
        numberOfAccounts ++;
        BankAccount.checkingBalance = 0.00;
        BankAccount.savingsBalance = 0.00;
        totalCash += BankAccount.checkingBalance + BankAccount.savingsBalance;
        this.accountNumber = accountNumber;

    }

    public static int getAccountTotal(){
        return numberOfAccounts;
    }

    public static double getTotalCash(){
        return totalCash;
    }

    private static getCheckingAccountBalance(int accountNumber){
        
        return checkingBalance;
    }
    private static getSavingsAccountBalance(int accountNumber){
        
        return savingsBalance;
    }

    public static depositMoney(boolean checking, double amount){
        if(checking == true) {
            checkingBalance += amount;
            totalCash += amount;
            System.out.print("$"+ amount + " deposited into checking. Balance of checking account is now $"+checkingBalance);
            } else {
                savingsBalance += amount;
                totalCash += amount;
                System.out.println("$"+amount+" deposited into savings. Balance of savings account is now $"+savingsBalance);
            }
    }
    public static withdrawMoney(boolean checking, double amount){
        if (checking == true){
            if (amount < checkingBalance){
            checkingBalance -= amount;
            totalCash -= amount;
            System.out.println("$"+amount+" was withdrawn from checking account. Balance of checking account is now $"+checkingBalance);
            }else{
                System.out.println("Insufficeint Funds!");
            }
        } else {
            if (amount < savingsBalance){
            savingsBalance -= amount;
            totalCash -= amount;
            System.out.print("$"+amount+" was withdrawn from savings account. Balance of savings account is now $"+savingsBalance);
            }else {
                System.out.println("Insufficeint Funds!");

            }
        }
    }
    public void viewTotalCash(){
        double totalBalance = checkingBalance + savingsBalance;
    }



}
