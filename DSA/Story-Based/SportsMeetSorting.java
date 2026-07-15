import java.util.Arrays;

public class SportsMeetSorting {

    static int bubbleSort(int[] arr) {
        int swaps = 0;
        boolean sorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                    swapped = true;
                    sorted = false;
                }
            }

            System.out.println("Pass " + (i + 1) + ": " + Arrays.toString(arr));

            if (!swapped) {
                break;
            }
        }

        if (sorted) {
            System.out.println("Array was already sorted.");
        }

        System.out.println("Total Swaps: " + swaps);
        return swaps;
    }

    static void insertionSort(int[] arr) {
        int shifts = 0;
        boolean sorted = true;

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                shifts++;
                sorted = false;
            }

            arr[j + 1] = key;

            System.out.println("Pass " + i + ": " + Arrays.toString(arr));
        }

        if (sorted) {
            System.out.println("Array was already sorted.");
        }

        System.out.println("Total Shifts: " + shifts);
    }

    static void topThree(int[] arr) {
        int[] copy = arr.clone();
        Arrays.sort(copy);

        System.out.println("Gold Medal: " + copy[copy.length - 1]);
        System.out.println("Silver Medal: " + copy[copy.length - 2]);
        System.out.println("Bronze Medal: " + copy[copy.length - 3]);
    }

    public static void main(String[] args) {

        int[] athleteScores = {
                78, 56, 92, 45, 88, 67, 54, 99, 81, 73,
                64, 58, 91, 49, 77, 84, 69, 95, 62, 87,
                53, 71, 90, 66, 82, 60, 74, 98, 57, 80,
                63, 89, 52, 76, 94, 68, 83, 59, 72, 97,
                55, 79, 61, 86, 70, 93, 65, 85, 75, 96
        };

        int[] bubbleArray = athleteScores.clone();
        int[] insertionArray = athleteScores.clone();

        System.out.println("Bubble Sort");
        bubbleSort(bubbleArray);

        System.out.println();

        System.out.println("Insertion Sort");
        insertionSort(insertionArray);

        System.out.println();

        System.out.println("Top 3 Medalists");
        topThree(athleteScores);

        System.out.println();

        int[] traceBubble = {64, 25, 12, 22, 11};
        int[] traceInsertion = {64, 25, 12, 22, 11};

        System.out.println("Bubble Sort Trace");
        bubbleSort(traceBubble);

        System.out.println();

        System.out.println("Insertion Sort Trace");
        insertionSort(traceInsertion);
    }
}