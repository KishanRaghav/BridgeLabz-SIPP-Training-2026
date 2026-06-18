import java.util.*;
import java.io.*;

public class OnlineQuizApplication {

    public static void main(String[] args) {

        String[] answers = {"A", "B", "C", "D"};

        for (int i = 0; i < 6; i++) {

            try {

                if (answers[i].equals("A")) {
                    System.out.println("Correct");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid answer index");
            } catch (NullPointerException e) {
                System.out.println("Answer is null");
            }
        }
    }
}