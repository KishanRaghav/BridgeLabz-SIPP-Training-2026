import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Node {

    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class KthSmallestInBST {

    public static Node insert(Node root, int value) {

        if (root == null) {
            return new Node(value);
        }

        if (value < root.val) {
            root.left = insert(root.left, value);
        } else if (value > root.val) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    public static int kthSmallest(Node root, int k) {

        Deque<Node> stack = new ArrayDeque<>();

        Node current = root;

        int count = 0;

        while (current != null || !stack.isEmpty()) {

            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();

            count++;

            if (count == k) {
                return current.val;
            }

            current = current.right;
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node root = null;

        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        int k = sc.nextInt();

        System.out.println(kthSmallest(root, k));

        sc.close();
    }
}