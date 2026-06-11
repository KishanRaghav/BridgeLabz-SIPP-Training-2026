import java.util.*;
public class NumberClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        for (int n : arr) {
            if (n > 0) {
                if (n % 2 == 0) System.out.println(n + " is Positive Even");
                else System.out.println(n + " is Positive Odd");
            } else if (n < 0) {
                System.out.println(n + " is Negative");
            } else {
                System.out.println("Zero");
            }
        }
        if (arr[0] == arr[4]) System.out.println("First and Last elements are Equal");
        else if (arr[0] > arr[4]) System.out.println("First element is Greater");
        else System.out.println("First element is Less");
    }
}