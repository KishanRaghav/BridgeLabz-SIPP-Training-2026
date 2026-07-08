import java.util.Scanner;

public class HospitalEmergency {

    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low;

        for (int j = low; j < high; j++) {

            if (arr[j] > pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }

    static int quickSelect(int[] arr, int low, int high, int k) {

        if (low <= high) {

            int p = partition(arr, low, high);

            if (p == k) {
                return arr[p];
            }

            if (p > k) {
                return quickSelect(arr, low, p - 1, k);
            }

            return quickSelect(arr, p + 1, high, k);
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] priority = new int[n];

        for (int i = 0; i < n; i++) {
            priority[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(quickSelect(priority, 0, n - 1, k - 1));
    }
}