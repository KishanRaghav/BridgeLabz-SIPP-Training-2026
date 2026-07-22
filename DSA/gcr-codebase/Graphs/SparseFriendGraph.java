import java.util.*;

public class SparseFriendGraph {

    private static final Map<Integer, Set<Integer>> friendGraph = new HashMap<>();

    public static void addFriendship(int u, int v) {

        friendGraph.computeIfAbsent(u, k -> new HashSet<>()).add(v);
        friendGraph.computeIfAbsent(v, k -> new HashSet<>()).add(u);
    }

    public static boolean isFriend(int u, int v) {

        return friendGraph.getOrDefault(u, Collections.emptySet()).contains(v);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int edges = sc.nextInt();

        for (int i = 0; i < edges; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();

            addFriendship(u, v);
        }

        int u = sc.nextInt();
        int v = sc.nextInt();

        System.out.println(isFriend(u, v));

        sc.close();
    }
}