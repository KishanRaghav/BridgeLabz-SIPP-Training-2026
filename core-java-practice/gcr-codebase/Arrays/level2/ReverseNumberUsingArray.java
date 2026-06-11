import java.util.*;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int temp = num;
        int count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];

        temp = num;

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        System.out.print("Reversed Number: ");

        for (int i = count - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
    }
}