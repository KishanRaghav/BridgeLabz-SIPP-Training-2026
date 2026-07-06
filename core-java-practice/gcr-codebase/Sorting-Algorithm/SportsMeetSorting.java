import java.util.Scanner;

public class SportsMeetSorting {

    static int bubbleSort(int[] arr) {
        int swaps = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                    swapped = true;
                }
            }

            if (!swapped) {
                System.out.println("Already Sorted");
                break;
            }
        }

        return swaps;
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    static void topThree(int[] arr) {
        System.out.println("Top 3 Medalists:");

        for (int i = arr.length - 1; i >= arr.length - 3; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    static void traceBubbleSort() {
        int[] arr = {64, 25, 12, 22, 11};

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        int[] bubble = scores.clone();
        int[] insertion = scores.clone();

        int swaps = bubbleSort(bubble);
        System.out.println("Total Swaps = " + swaps);

        insertionSort(insertion);

        topThree(insertion);

        System.out.println();
        System.out.println("Pass Wise Bubble Sort:");

        traceBubbleSort();
    }
}