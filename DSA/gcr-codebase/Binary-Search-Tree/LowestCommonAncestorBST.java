import java.util.Scanner;

class Node {

    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class LowestCommonAncestorBST {

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

    public static Node lowestCommonAncestor(Node root, int p, int q) {

        Node current = root;

        while (current != null) {

            if (p < current.val && q < current.val) {
                current = current.left;
            } else if (p > current.val && q > current.val) {
                current = current.right;
            } else {
                return current;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node root = null;

        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        int first = sc.nextInt();
        int second = sc.nextInt();

        Node answer = lowestCommonAncestor(root, first, second);

        if (answer != null) {
            System.out.println(answer.val);
        }

        sc.close();
    }
}