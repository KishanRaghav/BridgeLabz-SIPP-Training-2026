import java.util.Scanner;

public class CustomerOrderValuesMergeSort {

    static void merge(int[] orders, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftPart = new int[n1];
        int[] rightPart = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftPart[i] = orders[left + i];
        }

        for (int i = 0; i < n2; i++) {
            rightPart[i] = orders[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftPart[i] <= rightPart[j]) {
                orders[k] = leftPart[i];
                i++;
            } else {
                orders[k] = rightPart[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            orders[k] = leftPart[i];
            i++;
            k++;
        }

        while (j < n2) {
            orders[k] = rightPart[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int[] orders, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(orders, left, mid);
            mergeSort(orders, mid + 1, right);

            merge(orders, left, mid, right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] orders = new int[n];

        for (int i = 0; i < n; i++) {
            orders[i] = sc.nextInt();
        }

        mergeSort(orders, 0, n - 1);

        for (int value : orders) {
            System.out.print(value + " ");
        }
    }
}