import java.util.*;

public class FewestFlights {

    public static List<Integer> shortestPath(Map<Integer, List<Integer>> graph,
                                             int source,
                                             int destination) {

        Queue<Integer> queue = new LinkedList<>();

        Map<Integer, Integer> parent = new HashMap<>();

        Set<Integer> visited = new HashSet<>();

        queue.offer(source);

        visited.add(source);

        parent.put(source, null);

        while (!queue.isEmpty()) {

            int node = queue.poll();

            if (node == destination) {
                break;
            }

            for (int next : graph.getOrDefault(node, Collections.emptyList())) {

                if (!visited.contains(next)) {

                    visited.add(next);

                    parent.put(next, node);

                    queue.offer(next);
                }
            }
        }

        if (!visited.contains(destination)) {
            return new ArrayList<>();
        }

        LinkedList<Integer> path = new LinkedList<>();

        Integer current = destination;

        while (current != null) {

            path.addFirst(current);

            current = parent.get(current);
        }

        return path;
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

        List<Integer> path = shortestPath(graph, source, destination);

        if (path.isEmpty()) {

            System.out.println("No Path");

        } else {

            for (int city : path) {
                System.out.print(city + " ");
            }
        }

        sc.close();
    }
}