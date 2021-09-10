public class BankAccountTest {
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        System.out.println("Account #1: Account Number::"+account.acctNumGen());
        account.depositMoney(true, 500.00);
        account.depositMoney(false, 10000.00);
        System.out.println("Account #2:: Account Number::"+account2.acctNumGen());
        account2.depositMoney(true, 25000.00);
        account2.depositMoney(false, 50000.00);
        System.out.println("Account #3:: Account Number::"+account3.acctNumGen());
        account3.depositMoney(true,1000000.00);
        account3.depositMoney(false,5000000.00);
        account.withdrawMoney(true,150.00);
        account2.withdrawMoney(false, 5000.00);
        account3.withdrawMoney(true, 15000.00);
        account.withdrawMoney(true, 15000.00);
        System.out.println("Total Accounts::"+account2.getAccountTotal());
        System.out.println("Savings Account Balance for Account #1 ::"+account.getSavingsAccountBalance());
        System.out.println("Checking Account Balance for Account #1 ::"+account.getCheckingAccountBalance());
        System.out.println("Savings Account Balance for Account #2 ::"+account2.getSavingsAccountBalance());
        System.out.println("Checking Account Balance for Account #2 ::"+account2.getCheckingAccountBalance());
        System.out.println("Savings Account Balance for Account #3 ::"+account3.getSavingsAccountBalance());
        System.out.println("Checking Account Balance for Account #3 ::"+account3.getCheckingAccountBalance());


    }
}
