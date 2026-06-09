import java.util.Scanner;

public class NaturalNumberSumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num > 0) {
            int sum = 0;
            int i = 1;

            while (i <= num) {
                sum += i;
                i++;
            }

            int formula = num * (num + 1) / 2;

            System.out.println("Sum using while loop = " + sum);
            System.out.println("Sum using formula = " + formula);

            if (sum == formula) {
                System.out.println("Both results are correct");
            }
        } else {
            System.out.println("Not a natural number");
        }
    }
}