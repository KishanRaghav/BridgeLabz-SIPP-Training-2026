import java.util.Scanner;

public class EmployeeIdsInsertionSort {

    public static void insertionSort(int[] ids) {
        for (int i = 1; i < ids.length; i++) {
            int key = ids[i];
            int j = i - 1;

            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }

            ids[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ids = new int[n];

        for (int i = 0; i < n; i++) {
            ids[i] = sc.nextInt();
        }

        insertionSort(ids);

        for (int id : ids) {
            System.out.print(id + " ");
        }
    }
}