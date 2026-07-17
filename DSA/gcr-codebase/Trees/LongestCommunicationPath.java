import java.util.*;

class Node {
    int val;
    Node left;
    Node right;
    Node(int val) {
        this.val = val;
    }
}

public class LongestCommunicationPath {
    static int diameter = 0;

    static int height(Node node) {
        if (node == null) return -1;

        int left = height(node.left);
        int right = height(node.right);

        diameter = Math.max(diameter, left + right + 2);
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        height(root);
        System.out.println(diameter);
    }
}
