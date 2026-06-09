import java.util.Scanner;

public class NaturalNumberSumFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num > 0) {
            int sum = 0;

            for (int i = 1; i <= num; i++) {
                sum += i;
            }

            int formula = num * (num + 1) / 2;

            System.out.println("Sum using for loop = " + sum);
            System.out.println("Sum using formula = " + formula);

            if (sum == formula) {
                System.out.println("Both results are correct");
            }
        } else {
            System.out.println("Not a natural number");
        }
    }
}