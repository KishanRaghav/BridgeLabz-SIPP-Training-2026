import java.util.*;

class FactorsAnalysis {
    public int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[idx++] = i;
            }
        }
        return factors;
    }

    public int findGreatestFactor(int[] factors) {
        if (factors.length <= 1) return 1;
        return factors[factors.length - 2];
    }

    public int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    public long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    public double findProductOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        FactorsAnalysis fa = new FactorsAnalysis();
        int[] factors = fa.findFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest Factor (excluding self): " + fa.findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + fa.findSumOfFactors(factors));
        System.out.println("Product of Factors: " + fa.findProductOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + fa.findProductOfCubeOfFactors(factors));
    }
}