import java.util.*;

class NumberCheckerUtility2 {
    public static int countDigits(int number) {
        if (number == 0) return 1;
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int[] getDigits(int number, int count) {
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumDigits(digits);
        return sum != 0 && number % sum == 0;
    }

    public static int[][] findDigitFrequency(int[] digits) {
        int[] freqMap = new int[10];
        int uniqueCount = 0;
        for (int d : digits) {
            if (freqMap[d] == 0) {
                uniqueCount++;
            }
            freqMap[d]++;
        }
        int[][] result = new int[uniqueCount][2];
        int idx = 0;
        for (int i = 0; i < 10; i++) {
            if (freqMap[i] > 0) {
                result[idx][0] = i;
                result[idx][1] = freqMap[i];
                idx++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = countDigits(number);
        int[] digits = getDigits(number, count);
        System.out.println("Sum of digits: " + sumDigits(digits));
        System.out.println("Sum of squares: " + sumOfSquares(digits));
        System.out.println("Is Harshad: " + isHarshadNumber(number, digits));
        int[][] frequencies = findDigitFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int[] row : frequencies) {
            System.out.println(row[0] + " -> " + row[1]);
        }
    }
}