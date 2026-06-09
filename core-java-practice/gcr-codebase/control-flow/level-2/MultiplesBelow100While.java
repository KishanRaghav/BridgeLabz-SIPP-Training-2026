import java.util.*;

public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int i = num;

        while (i < 100) {
            System.out.println(i);
            i += num;
        }
    }
}