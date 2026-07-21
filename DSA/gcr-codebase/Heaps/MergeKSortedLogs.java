import java.util.*;

class HeapNode {

    int value;
    int listIndex;
    int elementIndex;

    HeapNode(int value, int listIndex, int elementIndex) {
        this.value = value;
        this.listIndex = listIndex;
        this.elementIndex = elementIndex;
    }
}

public class MergeKSortedLogs {

    public static List<Integer> merge(List<List<Integer>> lists) {

        PriorityQueue<HeapNode> minHeap = new PriorityQueue<>(
                (a, b) -> a.value - b.value
        );

        for (int i = 0; i < lists.size(); i++) {
            if (!lists.get(i).isEmpty()) {
                minHeap.offer(new HeapNode(lists.get(i).get(0), i, 0));
            }
        }

        List<Integer> merged = new ArrayList<>();

        while (!minHeap.isEmpty()) {

            HeapNode current = minHeap.poll();

            merged.add(current.value);

            int nextIndex = current.elementIndex + 1;

            if (nextIndex < lists.get(current.listIndex).size()) {

                minHeap.offer(
                        new HeapNode(
                                lists.get(current.listIndex).get(nextIndex),
                                current.listIndex,
                                nextIndex
                        )
                );
            }
        }

        return merged;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        List<List<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < k; i++) {

            int size = sc.nextInt();

            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < size; j++) {
                list.add(sc.nextInt());
            }

            lists.add(list);
        }

        List<Integer> result = merge(lists);

        for (int value : result) {
            System.out.print(value + " ");
        }

    
    }
}