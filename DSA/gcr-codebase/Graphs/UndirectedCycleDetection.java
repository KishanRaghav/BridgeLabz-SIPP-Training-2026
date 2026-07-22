import java.util.*;

public class UndirectedCycleDetection {

    public static boolean hasCycle(Map<Integer, List<Integer>> graph, int n) {
        Set<Integer> visited = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (!visited.contains(i)) {
                if (dfs(graph, i, -1, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean dfs(Map<Integer, List<Integer>> graph, int node, int parent, Set<Integer> visited) {
        visited.add(node);

        for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {
            if (!visited.contains(neighbor)) {
                if (dfs(graph, neighbor, node, visited)) {
                    return true;
                }
            } else if (neighbor != parent) {
                return true;
            }
        }

        return false;
    }

    private static void addEdge(Map<Integer, List<Integer>> graph, int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        addEdge(graph, 0, 1);
        addEdge(graph, 1, 2);
        addEdge(graph, 2, 0);

        System.out.println(hasCycle(graph, 3));
    }
}