import java.io.*;
import java.util.*;

public class DailyExpenseLogger {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String category = sc.nextLine();
        int amount = sc.nextInt();

        BufferedWriter bw = new BufferedWriter(new FileWriter("expenses.txt", true));

        bw.write(category + " - " + amount);
        bw.newLine();

        bw.close();

        System.out.println("Expense Saved");
    }
}