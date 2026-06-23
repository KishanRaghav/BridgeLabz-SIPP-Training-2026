class BankAccount {
    private String accountNumber;
    private String holder;
    private double balance;
    private String statement = "";
    private static int totalAccounts = 0;

    public BankAccount(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    public void deposit(double amount) {
        balance += amount;
        statement += "Deposited: " + amount + "\n";
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            statement += "Withdrawn: " + amount + "\n";
        } else {
            statement += "Withdrawal Failed: " + amount + " (Insufficient Balance)\n";
        }
    }

    public void getStatement() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder: " + holder);
        System.out.println("Current Balance: " + balance);
        System.out.println("Transactions:");
        System.out.println(statement);
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("A101", "Kishan Raghav", 10000);
        BankAccount acc2 = new BankAccount("A102", "Rahul Sharma", 15000);
        BankAccount acc3 = new BankAccount("A103", "Priya Singh", 20000);

        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.deposit(500);
        acc1.withdraw(3000);
        acc1.withdraw(12000);

        acc2.deposit(3000);
        acc2.withdraw(2000);
        acc2.deposit(1000);
        acc2.withdraw(5000);
        acc2.deposit(2500);

        acc3.withdraw(4000);
        acc3.deposit(6000);
        acc3.withdraw(3000);
        acc3.deposit(2000);
        acc3.withdraw(25000);

        acc1.getStatement();
        System.out.println("----------------------");

        acc2.getStatement();
        System.out.println("----------------------");

        acc3.getStatement();
        System.out.println("----------------------");

        System.out.println("Total Accounts Created: " + BankAccount.getTotalAccounts());
    }
}