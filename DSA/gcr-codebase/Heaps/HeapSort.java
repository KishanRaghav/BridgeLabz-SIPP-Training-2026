import java.util.Scanner;

public class HeapSort {

    public static void heapify(int[] arr, int index, int size) {

        int largest = index;

        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < size && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != index) {

            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;

            heapify(arr, largest, size);
        }
    }

    public static void heapSort(int[] arr) {

        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }

        for (int end = n - 1; end > 0; end--) {

            int temp = arr[0];
            arr[0] = arr[end];
            arr[end] = temp;

            heapify(arr, 0, end);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        heapSort(arr);

        for (int value : arr) {
            System.out.print(value + " ");
        }

      
    }
}