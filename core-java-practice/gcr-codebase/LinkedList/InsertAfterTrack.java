class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class InsertAfterTrack {

    public Node insertAfter(Node current, int trackId) {
        if (current == null) {
            return null;
        }

        Node newNode = new Node(trackId);
        newNode.next = current.next;
        current.next = newNode;

        return newNode;
    }
}