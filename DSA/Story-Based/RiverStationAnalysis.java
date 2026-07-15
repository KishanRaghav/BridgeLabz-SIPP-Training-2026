import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RiverStationAnalysis {

    static int longestStablePeriod(int[] levels, int limit) {
        int left = 0;
        int maxLength = 0;
        int min = levels[0];
        int max = levels[0];

        for (int right = 0; right < levels.length; right++) {

            min = levels[left];
            max = levels[left];

            for (int i = left; i <= right; i++) {
                min = Math.min(min, levels[i]);
                max = Math.max(max, levels[i]);
            }

            while (max - min > limit) {
                left++;

                min = levels[left];
                max = levels[left];

                for (int i = left; i <= right; i++) {
                    min = Math.min(min, levels[i]);
                    max = Math.max(max, levels[i]);
                }
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    static List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < arr.length - 2; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));

                    while (left < right && arr[left] == arr[left + 1]) {
                        left++;
                    }

                    while (left < right && arr[right] == arr[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    static double maxAverageSubarray(int[] arr, int k) {

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxSum = sum;

        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }

    public static void main(String[] args) {

        int[] waterLevels = {12, 13, 15, 14, 16, 18, 17, 16, 15, 14};

        int range = 4;

        System.out.println("Longest Stable Period: " + longestStablePeriod(waterLevels, range));

        int[] pollutionIndex = {-4, -1, -1, 0, 1, 2, -2, 3};

        System.out.println("Triplets with Sum Zero:");

        List<List<Integer>> triplets = threeSum(pollutionIndex);

        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }

        int[] hourlyLevels = {10, 15, 18, 12, 20, 25, 16, 14};

        int k = 3;

        System.out.println("Maximum Average of Subarray: " + maxAverageSubarray(hourlyLevels, k));
    }
}