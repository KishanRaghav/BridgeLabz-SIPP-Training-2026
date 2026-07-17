import java.util.*;

class Node {
    int val;
    Node left;
    Node right;
    Node(int val) {
        this.val = val;
    }
}

public class CategoryTreeHeight {
    static int height(Node node) {
        if (node == null) return -1;
        return Math.max(height(node.left), height(node.right)) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);

        int threshold = 1;
        int h = height(root);
        System.out.println("Height: " + h);
        System.out.println(h > threshold);
    }
}
