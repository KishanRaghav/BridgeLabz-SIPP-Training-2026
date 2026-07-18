import java.util.Scanner;

class Node {

    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class DeleteNodeFromBST {

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

    public static Node delete(Node root, int key) {

        if (root == null) {
            return null;
        }

        if (key < root.val) {

            root.left = delete(root.left, key);

        } else if (key > root.val) {

            root.right = delete(root.right, key);

        } else {

            if (root.left == null && root.right == null) {
                return null;
            }

            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }

            Node successor = root.right;

            while (successor.left != null) {
                successor = successor.left;
            }

            root.val = successor.val;

            root.right = delete(root.right, successor.val);
        }

        return root;
    }

    public static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node root = null;

        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        int key = sc.nextInt();

        root = delete(root, key);

        inorder(root);

        sc.close();
    }
}