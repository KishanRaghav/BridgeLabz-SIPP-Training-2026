import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayAtMostNDistinct {

    public static int longestSubarrayWithAtMostNDistinct(int[] keyIds, int n) {

        Map<Integer, Integer> frequency = new HashMap<>();

        int start = 0;
        int maxLength = 0;

        for (int end = 0; end < keyIds.length; end++) {

            frequency.put(keyIds[end],
                    frequency.getOrDefault(keyIds[end], 0) + 1);

            while (frequency.size() > n) {

                int left = keyIds[start];

                frequency.put(left, frequency.get(left) - 1);

                if (frequency.get(left) == 0) {
                    frequency.remove(left);
                }

                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] keys = {1, 2, 1, 3, 4, 2, 3};

        System.out.println(longestSubarrayWithAtMostNDistinct(keys, 2));
    }
}