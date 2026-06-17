import java.util.*;

public class UsernameValidator {
    static boolean isValid(String str, int index) {
        if (index == str.length()) return true;

        char ch = str.charAt(index);

        if (ch < 'a' || ch > 'z') return false;

        return isValid(str, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        System.out.println(isValid(username, 0));
    }
}
