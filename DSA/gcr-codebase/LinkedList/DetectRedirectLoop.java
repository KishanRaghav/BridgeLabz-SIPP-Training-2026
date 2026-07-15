class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class DetectRedirectLoop {

    public boolean hasRedirectLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
