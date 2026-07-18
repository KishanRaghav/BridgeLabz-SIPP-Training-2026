import java.util.Scanner;

class Node {

    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class SearchBST {

    public static boolean search(Node root, int target) {

        Node current = root;

        while (current != null) {

            if (current.val == target) {
                return true;
            }

            if (target < current.val) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return false;
    }

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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node root = null;

        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        int target = sc.nextInt();

        System.out.println(search(root, target));

        sc.close();
    }
}