import java.util.*;

public class SensorReadings {
    static boolean isIncreasing(int[] arr, int index) {
        if (index == arr.length - 1) return true;
        if (arr[index] >= arr[index + 1]) return false;
        return isIncreasing(arr, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(isIncreasing(arr, 0));
    }
}
