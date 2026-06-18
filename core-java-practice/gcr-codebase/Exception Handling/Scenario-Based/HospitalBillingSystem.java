import java.util.*;
import java.io.*;

class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    public static void main(String[] args) {

        try {
            int totalBill = 100;
            int items = 0;
            System.out.println(totalBill / items);
        } catch (ArithmeticException e) {
            System.out.println("Bills cannot have zero items");
        }

        try {
            int[] patients = {1, 2, 3};
            System.out.println(patients[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid patient index");
        }

        try {
            Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number input");
        }
    }
}