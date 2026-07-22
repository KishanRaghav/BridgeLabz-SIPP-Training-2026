import java.util.*;

public class ConnectedComponentsInNetwork {

    public static int countNetworkSegments(Map<Integer, List<Integer>> network, int n) {
        Set<Integer> visited = new HashSet<>();
        int segments = 0;

        for (int server = 0; server < n; server++) {
            if (!visited.contains(server)) {
                segments++;
                dfs(network, server, visited);
            }
        }

        return segments;
    }

    private static void dfs(Map<Integer, List<Integer>> network, int node, Set<Integer> visited) {
        visited.add(node);

        for (int neighbor : network.getOrDefault(node, Collections.emptyList())) {
            if (!visited.contains(neighbor)) {
                dfs(network, neighbor, visited);
            }
        }
    }

    private static void addEdge(Map<Integer, List<Integer>> graph, int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> network = new HashMap<>();

        addEdge(network, 0, 1);
        addEdge(network, 1, 2);
        addEdge(network, 3, 4);

        int totalServers = 5;

        int connectedComponents = countNetworkSegments(network, totalServers);

        System.out.println("Connected Components: " + connectedComponents);
        System.out.println("Is Fully Connected: " + (connectedComponents == 1));
    }
}