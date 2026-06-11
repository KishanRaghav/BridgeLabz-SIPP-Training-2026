import java.util.*;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();

        int count = String.valueOf(num).length();
        int[] digits = new int[count];
        int index = 0;

        while (num != 0) {
            digits[index] = (int)(num % 10);
            num /= 10;
            index++;
        }

        int[] frequency = new int[10];

        for (int i = 0; i < index; i++) {
            frequency[digits[i]]++;
        }

        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " -> " + frequency[i]);
            }
        }
    }
}