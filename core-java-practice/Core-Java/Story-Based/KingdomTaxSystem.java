import java.util.*;

public class KingdomTaxSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] incomes = new double[10];
        double totalTax = 0;
        System.out.println("=== Kingdom Tax System ===");
        for (int i = 0; i < incomes.length; i++) {
            System.out.print("Enter income of Citizen " + (i + 1) + ": ");
            incomes[i] = sc.nextDouble();
            double tax;
            if (incomes[i] < 10000) {
                tax = incomes[i] * 0.05;
                System.out.println("Tax Bracket : 5%");
            } else if (incomes[i] <= 50000) {
                tax = incomes[i] * 0.15;
                System.out.println("Tax Bracket : 15%");
            } else {
                tax = incomes[i] * 0.30;
                System.out.println("Tax Bracket : 30%");
            }
            System.out.printf("Tax Amount  : %.2f%n%n", tax);
            totalTax += tax;
        }
        System.out.printf("Total Tax Collected from 10 Citizens : %.2f%n", totalTax);

    }
}