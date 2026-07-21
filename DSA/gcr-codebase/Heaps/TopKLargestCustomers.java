import java.util.*;

public class TopKLargestCustomers {

    public static List<Integer> topKLargest(int[] transactions, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int amount : transactions) {

            if (minHeap.size() < k) {
                minHeap.offer(amount);
            } else if (amount > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(amount);
            }
        }

        List<Integer> result = new ArrayList<>(minHeap);
        Collections.sort(result, Collections.reverseOrder());

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] transactions = new int[n];

        for (int i = 0; i < n; i++) {
            transactions[i] = sc.nextInt();
        }

        List<Integer> answer = topKLargest(transactions, k);

        for (int value : answer) {
            System.out.print(value + " ");
        }

       
    }
}