import java.util.*;

public class FraudPairDetection {

    public static int[] findPair(int[] amounts, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < amounts.length; i++) {

            int complement = target - amounts[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(amounts[i], i);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] amounts = new int[n];

        for (int i = 0; i < n; i++) {
            amounts[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int[] result = findPair(amounts, target);

        System.out.println(result[0] + " " + result[1]);

        sc.close();
    }
}