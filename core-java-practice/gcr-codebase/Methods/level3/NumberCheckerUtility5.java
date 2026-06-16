import java.util.*;

class NumberCheckerUtility5 {
    public static int sumProperDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPerfectNumber(int number) {
        return sumProperDivisors(number) == number;
    }

    public static boolean isAbundantNumber(int number) {
        return sumProperDivisors(number) > number;
    }

    public static boolean isDeficientNumber(int number) {
        return sumProperDivisors(number) < number;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Is Perfect: " + isPerfectNumber(number));
        System.out.println("Is Abundant: " + isAbundantNumber(number));
        System.out.println("Is Deficient: " + isDeficientNumber(number));
        System.out.println("Is Strong: " + isStrongNumber(number));
    }
}