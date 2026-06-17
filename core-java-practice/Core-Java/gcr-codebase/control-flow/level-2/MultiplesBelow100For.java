import java.util.*;

public class MultiplesBelow100For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = num; i < 100; i += num) {
            System.out.println(i);
        }
    }
}