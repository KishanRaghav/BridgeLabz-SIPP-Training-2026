import java.util.*;
public class VendingMachineChangeMaking {

    public static List<List<Integer>> makeChange(int[] coins, int target) {

        Arrays.sort(coins);

        List<List<Integer>> result = new ArrayList<>();

        backtrack(coins, target, 0, 0, new ArrayList<>(), result);

        return result;
    }

    private static void backtrack(int[] coins,
                                  int target,
                                  int start,
                                  int sum,
                                  List<Integer> current,
                                  List<List<Integer>> result) {

        if (sum == target) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < coins.length; i++) {

            if (sum + coins[i] > target) {
                break;
            }

            current.add(coins[i]);

            backtrack(coins, target, i, sum + coins[i], current, result);

            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {

        int[] coins = {1, 2, 5};
        int target = 5;

        List<List<Integer>> answer = makeChange(coins, target);

        for (List<Integer> list : answer) {
            System.out.println(list);
        }
    }
}