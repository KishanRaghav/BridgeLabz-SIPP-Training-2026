public class FixedWindowCPUSpikeDetection {

    public static int maxSubarrayOfSizeK(int[] cpuLoad, int k) {

        int start = 0;
        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int end = 0; end < cpuLoad.length; end++) {

            windowSum += cpuLoad[end];

            if (end >= k - 1) {

                maxSum = Math.max(maxSum, windowSum);

                windowSum -= cpuLoad[start];

                start++;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] cpu = {30, 40, 20, 60, 70, 10, 50};

        System.out.println(maxSubarrayOfSizeK(cpu, 3));
    }
}