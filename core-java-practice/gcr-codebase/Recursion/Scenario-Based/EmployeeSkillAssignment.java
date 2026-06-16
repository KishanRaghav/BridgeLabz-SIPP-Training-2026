import java.util.*;

public class EmployeeSkillAssignment {
    static void findTeams(int[] arr, int index, int target, List<Integer> current, int sum) {
        if (sum == target) {
            System.out.println(current);
            return;
        }

        if (index == arr.length || sum > target) return;

        current.add(arr[index]);
        findTeams(arr, index + 1, target, current, sum + arr[index]);

        current.remove(current.size() - 1);
        findTeams(arr, index + 1, target, current, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        findTeams(arr, 0, target, new ArrayList<>(), 0);
    }
}
