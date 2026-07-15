import java.util.Random;

public class LibrarySortingComparison {

    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }

        for (int i = 0; i < n2; i++) {
            rightArray[i] = arr[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }

        while (i < n1) {
            arr[k++] = leftArray[i++];
        }

        while (j < n2) {
            arr[k++] = rightArray[j++];
        }
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int[] pivot = partition3Way(arr, low, high);
            quickSort(arr, low, pivot[0] - 1);
            quickSort(arr, pivot[1] + 1, high);
        }
    }

    static int[] partition3Way(int[] arr, int low, int high) {
        int pivot = arr[high];

        int smaller = low;
        int current = low;
        int greater = high;

        while (current <= greater) {
            if (arr[current] < pivot) {
                swap(arr, smaller, current);
                smaller++;
                current++;
            } else if (arr[current] > pivot) {
                swap(arr, current, greater);
                greater--;
            } else {
                current++;
            }
        }

        return new int[]{smaller, greater};
    }

    static void countingSort(int[] arr, int maxValue) {
        int[] count = new int[maxValue + 1];

        for (int value : arr) {
            count[value]++;
        }

        int index = 0;

        for (int i = 1; i <= maxValue; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int[] generateRandomArray(int size, int maxValue) {
        Random random = new Random();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(maxValue) + 1;
        }

        return arr;
    }

    static void compareRuntime(int size) {
        int[] mergeArray = generateRandomArray(size, 1000000);
        int[] quickArray = mergeArray.clone();
        int[] countArray = generateRandomArray(size, 20);

        long start;
        long end;

        start = System.nanoTime();
        mergeSort(mergeArray, 0, mergeArray.length - 1);
        end = System.nanoTime();
        System.out.println("Merge Sort (" + size + ") : " + (end - start) / 1000000.0 + " ms");

        start = System.nanoTime();
        quickSort(quickArray, 0, quickArray.length - 1);
        end = System.nanoTime();
        System.out.println("Quick Sort (" + size + ") : " + (end - start) / 1000000.0 + " ms");

        start = System.nanoTime();
        countingSort(countArray, 20);
        end = System.nanoTime();
        System.out.println("Counting Sort (" + size + ") : " + (end - start) / 1000000.0 + " ms");

        System.out.println();
    }

    public static void main(String[] args) {

        int[] mergeExample = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Merge Sort Example");
        mergeSort(mergeExample, 0, mergeExample.length - 1);

        for (int value : mergeExample) {
            System.out.print(value + " ");
        }

        System.out.println("\n");

        compareRuntime(100);
        compareRuntime(1000);
        compareRuntime(10000);

        System.out.println("Library can also sort 1,000,000 books using Merge Sort in O(n log n).");
    }
}