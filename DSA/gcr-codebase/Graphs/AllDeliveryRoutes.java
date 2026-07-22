import java.util.*;

public class AllDeliveryRoutes {

    public static void dfs(Map<Integer, List<Integer>> graph,
                           int current,
                           int destination,
                           List<Integer> path,
                           Set<Integer> visited,
                           List<List<Integer>> answer) {

        path.add(current);

        visited.add(current);

        if (current == destination) {

            answer.add(new ArrayList<>(path));

        } else {

            for (int next : graph.getOrDefault(current, Collections.emptyList())) {

                if (!visited.contains(next)) {

                    dfs(graph, next, destination, path, visited, answer);
                }
            }
        }

        path.remove(path.size() - 1);

        visited.remove(current);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vertices = sc.nextInt();

        int edges = sc.nextInt();

        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int i = 0; i < edges; i++) {

            int u = sc.nextInt();

            int v = sc.nextInt();

            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);

            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }

        int source = sc.nextInt();

        int destination = sc.nextInt();

        List<List<Integer>> answer = new ArrayList<>();

        dfs(graph,
                source,
                destination,
                new ArrayList<>(),
                new HashSet<>(),
                answer);

        for (List<Integer> path : answer) {

            for (int node : path) {
                System.out.print(node + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}