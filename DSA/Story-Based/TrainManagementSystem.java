public class TrainManagementSystem {

    static class Node {
        int coachNumber;
        Node next;

        Node(int coachNumber) {
            this.coachNumber = coachNumber;
        }
    }

    static Node head;

    static void addCoach(int coachNumber) {
        Node newNode = new Node(coachNumber);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    static void removeCoach(int coachNumber) {
        if (head == null) {
            return;
        }

        if (head.coachNumber == coachNumber) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.coachNumber != coachNumber) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.coachNumber + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    static Node reverse(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    static boolean hasCycle(Node head) {
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

    static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    static Node mergeSortedLists(Node first, Node second) {

        Node dummy = new Node(0);
        Node tail = dummy;

        while (first != null && second != null) {

            if (first.coachNumber <= second.coachNumber) {
                tail.next = first;
                first = first.next;
            } else {
                tail.next = second;
                second = second.next;
            }

            tail = tail.next;
        }

        if (first != null) {
            tail.next = first;
        }

        if (second != null) {
            tail.next = second;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        addCoach(101);
        addCoach(102);
        addCoach(103);
        addCoach(104);

        System.out.println("Train Coaches:");
        display(head);

        removeCoach(102);
        System.out.println("After Removing Coach 102:");
        display(head);

        head = reverse(head);
        System.out.println("After Reversing:");
        display(head);

        System.out.println("Middle Coach: " + findMiddle(head).coachNumber);

        System.out.println("Cycle Present: " + hasCycle(head));

        Node first = new Node(1);
        first.next = new Node(3);
        first.next.next = new Node(5);

        Node second = new Node(2);
        second.next = new Node(4);
        second.next.next = new Node(6);

        Node merged = mergeSortedLists(first, second);

        System.out.println("Merged Sorted Schedule:");
        display(merged);
    }
}