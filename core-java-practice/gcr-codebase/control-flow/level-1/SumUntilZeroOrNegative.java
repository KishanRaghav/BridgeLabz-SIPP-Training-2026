import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0;

        while (true) {
            double num = sc.nextDouble();

            if (num <= 0) {
                break;
            }

            sum += num;
        }

        System.out.println("Total = " + sum);
    }
}