import java.util.*;

public class FeatureFlagCombinations {

    public static List<List<String>> generateFlagCombinations(String[] flags) {
        List<List<String>> result = new ArrayList<>();
        backtrack(flags, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(String[] flags, int index, List<String> current, List<List<String>> result) {

        if (index == flags.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(flags[index]);
        backtrack(flags, index + 1, current, result);

        current.remove(current.size() - 1);

        backtrack(flags, index + 1, current, result);
    }

    public static void main(String[] args) {

        String[] flags = {
                "Dark Mode",
                "New Checkout",
                "Beta Search"
        };

        List<List<String>> combinations = generateFlagCombinations(flags);

        for (List<String> list : combinations) {
            System.out.println(list);
        }
    }
}