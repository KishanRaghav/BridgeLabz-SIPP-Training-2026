import java.util.*;

public class BMIArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight: ");
            weight[i] = sc.nextDouble();

            System.out.print("Enter height in meters: ");
            height[i] = sc.nextDouble();

            if (weight[i] <= 0 || height[i] <= 0) {
                System.out.println("Invalid input");
                i--;
            }
        }

        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(weight[i] + " " + height[i] + " " + bmi[i] + " " + status[i]);
        }
    }
}