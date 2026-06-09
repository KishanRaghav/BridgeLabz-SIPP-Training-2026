import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amarAge = sc.nextInt();
        int akbarAge = sc.nextInt();
        int anthonyAge = sc.nextInt();

        double amarHeight = sc.nextDouble();
        double akbarHeight = sc.nextDouble();
        double anthonyHeight = sc.nextDouble();

        if (amarAge < akbarAge && amarAge < anthonyAge) {
            System.out.println("Amar is youngest");
        } else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            System.out.println("Akbar is youngest");
        } else {
            System.out.println("Anthony is youngest");
        }

        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            System.out.println("Amar is tallest");
        } else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            System.out.println("Akbar is tallest");
        } else {
            System.out.println("Anthony is tallest");
        }
    }
}