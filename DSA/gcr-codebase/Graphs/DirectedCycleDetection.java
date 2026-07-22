import java.util.*;

public class DirectedCycleDetection {

    public static boolean hasCycle(Map<Integer, List<Integer>> graph, int n) {
        int[] state = new int[n];

        for (int i = 0; i < n; i++) {
            if (state[i] == 0) {
                if (dfs(graph, i, state)) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean dfs(Map<Integer, List<Integer>> graph, int node, int[] state) {
        state[node] = 1;

        for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {
            if (state[neighbor] == 1) {
                return true;
            }

            if (state[neighbor] == 0 && dfs(graph, neighbor, state)) {
                return true;
            }
        }

        state[node] = 2;
        return false;
    }

    private static void addEdge(Map<Integer, List<Integer>> graph, int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        addEdge(graph, 0, 1);
        addEdge(graph, 1, 2);
        addEdge(graph, 2, 0);

        System.out.println(hasCycle(graph, 3));
    }
}