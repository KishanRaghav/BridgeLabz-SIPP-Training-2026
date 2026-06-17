public class MathWizard {
    int instanceVariable = 100;
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public double factorial(double n) {
        double fact = 1;
        for (int i = 1; i <= (int) n; i++) {
            fact *= i;
        }

        return fact;
    }

    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int first = 0;
        int second = 1;
        for (int i = 2; i <= n; i++) {
            int next = first + second;
            first = second;
            second = next;
        }
        return second;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    public long power(int base, int exp) {
        long result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }

    public void showScopeDifference() {
        int localVariable = 50;

        System.out.println("Local Variable: " + localVariable);
        System.out.println("Instance Variable: " + instanceVariable);
    }

    public static void main(String[] args) {
        MathWizard wizard = new MathWizard();

        System.out.println("Is Prime (17): " + wizard.isPrime(17));
        System.out.println("Factorial (5): " + wizard.factorial(5));
        System.out.println("Factorial (5.0): " + wizard.factorial(5.0));
        System.out.println("Fibonacci (7): " + wizard.fibonacci(7));
        System.out.println("GCD (24, 36): " + wizard.gcd(24, 36));
        System.out.println("LCM (24, 36): " + wizard.lcm(24, 36));
        System.out.println("Power (2^5): " + wizard.power(2, 5));

        wizard.showScopeDifference();
    }
}