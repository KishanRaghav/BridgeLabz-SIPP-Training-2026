import java.util.*;

class NumberCheckerUtility1 {
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

    public static boolean isDuckNumber(int[] digits) {
        if (digits[0] == 0) return false;
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrongNumber(int number, int[] digits) {
        int sum = 0;
        int power = digits.length;
        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == number;
    }

    public static void findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        System.out.println("Largest: " + (largest == Integer.MIN_VALUE ? "N/A" : largest));
        System.out.println("Second Largest: " + (secondLargest == Integer.MIN_VALUE ? "N/A" : secondLargest));
    }

    public static void findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        System.out.println("Smallest: " + (smallest == Integer.MAX_VALUE ? "N/A" : smallest));
        System.out.println("Second Smallest: " + (secondSmallest == Integer.MAX_VALUE ? "N/A" : secondSmallest));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = countDigits(number);
        int[] digits = getDigits(number, count);
        System.out.println("Is Duck: " + isDuckNumber(digits));
        System.out.println("Is Armstrong: " + isArmstrongNumber(number, digits));
        findLargestAndSecondLargest(digits);
        findSmallestAndSecondSmallest(digits);
    }
}