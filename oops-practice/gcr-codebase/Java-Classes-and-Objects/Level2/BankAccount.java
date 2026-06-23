class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    void deposit(double amt) {
        balance = balance + amt;
    }

    void withdraw(double amt) {
        if (balance >= amt) balance = balance - amt;
    }

    void display() {
        System.out.println(balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.accountHolder = "Aman";
        b.accountNumber = 12345;
        b.balance = 1000;
        b.deposit(500);
        b.withdraw(300);
        b.display();
    }
}