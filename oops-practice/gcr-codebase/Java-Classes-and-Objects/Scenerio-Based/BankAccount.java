public class BankAccount {
    private String accountNumber;
    private String holder;
    private double balance;
    private static int totalAccounts = 0;

    public BankAccount(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(holder + " deposited " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(holder + " withdrew " + amount);
        } else {
            System.out.println("Insufficient balance for " + holder);
        }
    }

    public void getStatement() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder: " + holder);
        System.out.println("Balance: " + balance);
        System.out.println();
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("A101", "Rahul", 10000);
        BankAccount a2 = new BankAccount("A102", "Aman", 12000);
        BankAccount a3 = new BankAccount("A103", "Priya", 15000);

        a1.deposit(1000);
        a1.withdraw(500);
        a1.deposit(2000);
        a1.withdraw(1000);
        a1.deposit(500);

        a2.deposit(1500);
        a2.withdraw(1000);
        a2.deposit(2500);
        a2.withdraw(500);
        a2.deposit(700);

        a3.deposit(3000);
        a3.withdraw(2000);
        a3.deposit(1000);
        a3.withdraw(500);
        a3.deposit(1500);

        a1.getStatement();
        a2.getStatement();
        a3.getStatement();

        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
}