import java.util.*;
import java.io.*;

class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(double balance, double amount) {
        super("Balance: " + balance + ", Requested: " + amount);
    }
}

public class ATMWithdrawalSystem {

    static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }

        System.out.println("Withdrawal Successful");
    }

    public static void main(String[] args) {

        try {
            withdraw(5000, 8000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}