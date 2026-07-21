import java.util.Scanner;

public class BuildMinHeap {

    public static void siftDown(int[] arr, int index, int size) {

        int smallest = index;

        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < size && arr[left] < arr[smallest]) {
            smallest = left;
        }

        if (right < size && arr[right] < arr[smallest]) {
            smallest = right;
        }

        if (smallest != index) {

            int temp = arr[index];
            arr[index] = arr[smallest];
            arr[smallest] = temp;

            siftDown(arr, smallest, size);
        }
    }

    public static void buildHeap(int[] arr) {

        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            siftDown(arr, i, n);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        buildHeap(arr);

        for (int value : arr) {
            System.out.print(value + " ");
        }

    }
}