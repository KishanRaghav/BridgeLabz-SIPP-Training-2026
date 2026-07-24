import java.util.*;

public class OnCallRotationScheduling {

    public static List<List<String>> generateSchedules(String[] engineers) {

        List<List<String>> result = new ArrayList<>();

        boolean[] used = new boolean[engineers.length];

        backtrack(engineers, used, new ArrayList<>(), result);

        return result;
    }

    private static void backtrack(String[] engineers,
                                  boolean[] used,
                                  List<String> current,
                                  List<List<String>> result) {

        if (current.size() == engineers.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < engineers.length; i++) {

            if (used[i]) {
                continue;
            }

            used[i] = true;

            current.add(engineers[i]);

            backtrack(engineers, used, current, result);

            current.remove(current.size() - 1);

            used[i] = false;
        }
    }

    public static void main(String[] args) {

        String[] engineers = {
                "Alice",
                "Bob",
                "Charlie"
        };

        List<List<String>> schedules = generateSchedules(engineers);

        for (List<String> schedule : schedules) {
            System.out.println(schedule);
        }
    }
}