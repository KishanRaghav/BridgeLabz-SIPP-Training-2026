import java.util.*;

class Patient {

    int severity;

    Patient(int severity) {
        this.severity = severity;
    }
}

public class EmergencyRoomTriageQueue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PriorityQueue<Patient> queue = new PriorityQueue<>(
                (a, b) -> b.severity - a.severity
        );

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            queue.offer(new Patient(sc.nextInt()));
        }

        while (!queue.isEmpty()) {
            System.out.print(queue.poll().severity + " ");
        }

        
    }
}