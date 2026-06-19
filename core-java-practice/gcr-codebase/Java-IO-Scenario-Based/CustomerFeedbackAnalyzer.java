import java.io.*;
import java.util.*;

public class CustomerFeedbackAnalyzer {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;

        for (int i = 0; i < 5; i++) {
            String feedback = br.readLine().toLowerCase();

            if (feedback.contains("good")) {
                count++;
            }
        }

        System.out.println("Good Feedback Count = " + count);
    }
}