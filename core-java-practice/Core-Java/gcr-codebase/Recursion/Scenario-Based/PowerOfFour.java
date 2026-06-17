import java.util.*;

public class PowerOfFour {
    static boolean isPowerOfFour(int n) {
        if (n == 1) return true;
        if (n <= 0 || n % 4 != 0) return false;
        return isPowerOfFour(n / 4);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPowerOfFour(n));
    }
}
