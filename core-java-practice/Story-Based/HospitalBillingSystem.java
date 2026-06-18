public class HospitalBillingSystem {

    static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }

    public static void processPayment(double balance, double amount)
            throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Payment failed: Insufficient funds.");
        }
        System.out.println("Payment successful. Remaining balance: " + (balance - amount));
    }

    public static void main(String[] args) {

        try {
            int totalBill = 5000;
            int items = 0;
            double billPerItem = totalBill / items;
            System.out.println(billPerItem);
        } catch (ArithmeticException e) {
            System.out.println("Error: Number of items cannot be zero.");
        }

        try {
            String[] patients = {"Amit", "Rahul", "Priya"};
            System.out.println(patients[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        }

        try {
            String input = "ABC123";
            int amount = Integer.parseInt(input);
            System.out.println(amount);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
        }

        try {
            processPayment(1000, 1500);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}