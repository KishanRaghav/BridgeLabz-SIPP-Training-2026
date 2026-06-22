import java.io.*;
import java.util.*;

public class StudentGradeManager {

    static String getGrade(int total) {
        int avg = total / 5;

        if (avg >= 90)
            return "A";
        else if (avg >= 80)
            return "B";
        else if (avg >= 70)
            return "C";
        else if (avg >= 60)
            return "D";
        else
            return "F";
    }

    static void sortData(String names[], int totals[], String grades[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (totals[j] < totals[j + 1]) {

                    int t = totals[j];
                    totals[j] = totals[j + 1];
                    totals[j + 1] = t;

                    String s = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = s;

                    s = grades[j];
                    grades[j] = grades[j + 1];
                    grades[j + 1] = s;
                }
            }
        }
    }

    static int searchStudent(String names[], int n, String key) {
        for (int i = 0; i < n; i++) {
            if (names[i].equalsIgnoreCase(key))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String names[] = new String[100];
        int totals[] = new int[100];
        String grades[] = new String[100];

        int count = 0;
        try {

            BufferedReader br = new BufferedReader(
                    new FileReader("students.txt"));

            String line;
            while ((line = br.readLine()) != null) {

                String data[] = line.split(",");
                String name = data[0];
                int total = 0;
                for (int i = 1; i <= 5; i++) {
                    total += Integer.parseInt(data[i]);
                }

                names[count] = name;
                totals[count] = total;
                grades[count] = getGrade(total);

                count++;
            }

            br.close();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter student name to search: ");
            String key = sc.nextLine();

            int pos = searchStudent(names, count, key);

            if (pos != -1) {
                System.out.println("Name : " + names[pos]);
                System.out.println("Total Marks : " + totals[pos]);
                System.out.println("Grade : " + grades[pos]);
            } else {
                System.out.println("Student not found");
            }

            sortData(names, totals, grades, count);

            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("report.txt"));

            bw.write("Name\tTotal\tGrade");
            bw.newLine();

            for (int i = 0; i < count; i++) {
                bw.write(names[i] + "\t" + totals[i] + "\t" + grades[i]);
                bw.newLine();
            }

            bw.close();
            System.out.println("Report written to report.txt");

        } catch (FileNotFoundException e) {
            System.out.println("students.txt file not found");
        } catch (NumberFormatException e) {
            System.out.println("Invalid marks in file");
        } catch (IOException e) {
            System.out.println("File Error");
        }
    }
}