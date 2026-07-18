import java.util.Scanner;

class Node {

    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class ValidateBST {

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

    public static boolean isValidBST(Node root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean validate(Node node, long min, long max) {

        if (node == null) {
            return true;
        }

        if (node.val <= min || node.val >= max) {
            return false;
        }

        return validate(node.left, min, node.val)
                && validate(node.right, node.val, max);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node root = null;

        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        System.out.println(isValidBST(root));

        sc.close();
    }
}