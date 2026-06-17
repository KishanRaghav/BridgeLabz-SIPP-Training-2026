import java.util.*;

public class WarehouseManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        int[] stock = new int[n];

        System.out.println("Enter stock quantities:");
        for (int i = 0; i < n; i++) {
            stock[i] = sc.nextInt();
        }

        int max = stock[0];
        int min = stock[0];
        int total = 0;
        for (int i = 0; i < n; i++) {
            if (stock[i] > max) {
                max = stock[i];
            }
            if (stock[i] < min) {
                min = stock[i];
            }
            total += stock[i];
        }
        System.out.println("Maximum Stock = " + max);
        System.out.println("Minimum Stock = " + min);
        System.out.println("Total Stock = " + total);
        boolean duplicateFound = false;
        System.out.print("Duplicate Values: ");

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (stock[i] == stock[j]) {
                    System.out.print(stock[i] + " ");
                    duplicateFound = true;
                    break;
                }
            }
        }

        if (!duplicateFound) {
            System.out.print("No Duplicates");
        }
        System.out.println();
        System.out.print("Enter k positions to rotate: ");
        int k = sc.nextInt();

        k = k % n;
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = stock[i];
        }

        System.out.println("Rotated Array:");
        for (int num : rotated) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.print("Enter rows of shelf grid: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns of shelf grid: ");
        int cols = sc.nextInt();
        int[][] grid = new int[rows][cols];
        System.out.println("Enter shelf grid elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = grid[i][j];
            }
        }
        System.out.println("Transpose Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}