import java.util.Scanner;

public class EmployeeSalariesMergeSort {

    static void merge(int[] salaries, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = salaries[left + i];
        }

        for (int i = 0; i < n2; i++) {
            rightArray[i] = salaries[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                salaries[k] = leftArray[i];
                i++;
            } else {
                salaries[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            salaries[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            salaries[k] = rightArray[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int[] salaries, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(salaries, left, mid);
            mergeSort(salaries, mid + 1, right);

            merge(salaries, left, mid, right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] salaries = new int[n];

        for (int i = 0; i < n; i++) {
            salaries[i] = sc.nextInt();
        }

        mergeSort(salaries, 0, n - 1);

        for (int salary : salaries) {
            System.out.print(salary + " ");
        }
    }
}