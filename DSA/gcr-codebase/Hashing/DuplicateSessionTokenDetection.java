import java.util.*;

public class DuplicateSessionTokenDetection {

    public static boolean hasDuplicate(String[] tokens) {
        HashSet<String> seen = new HashSet<>();

        for (String token : tokens) {
            if (!seen.add(token)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] tokens = new String[n];

        for (int i = 0; i < n; i++) {
            tokens[i] = sc.next();
        }

        System.out.println(hasDuplicate(tokens));

        sc.close();
    }
}