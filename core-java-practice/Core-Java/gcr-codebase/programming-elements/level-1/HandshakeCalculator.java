import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt();

        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("Maximum number of handshakes is " + handshakes);
    }
}