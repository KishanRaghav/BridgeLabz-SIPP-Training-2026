import java.util.Scanner;

public class PatientRegistrationIdsMergeSort {

    static void merge(int[] ids, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = ids[left + i];
        }

        for (int i = 0; i < n2; i++) {
            rightArray[i] = ids[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                ids[k] = leftArray[i];
                i++;
            } else {
                ids[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            ids[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            ids[k] = rightArray[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int[] ids, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(ids, left, mid);
            mergeSort(ids, mid + 1, right);

            merge(ids, left, mid, right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ids = new int[n];

        for (int i = 0; i < n; i++) {
            ids[i] = sc.nextInt();
        }

        mergeSort(ids, 0, n - 1);

        for (int id : ids) {
            System.out.print(id + " ");
        }
    }
}