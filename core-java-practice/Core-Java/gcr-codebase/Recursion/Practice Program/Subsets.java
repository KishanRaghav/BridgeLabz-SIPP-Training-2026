import java.util.*;

public class Subsets {
    static void generateSubsets(int[] arr, int index, List<Integer> current) {
        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        generateSubsets(arr, index + 1, current);
        current.add(arr[index]);
        generateSubsets(arr, index + 1, current);
        current.remove(current.size() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        generateSubsets(arr, 0, new ArrayList<>());
    }
}
