import java.util.*;

public class StudentGradeReport {

    public static int[][] generateMarks(int students) {
        int[][] marks = new int[students][3];

        for (int i = 0; i < students; i++) {
            marks[i][0] = (int) (Math.random() * 90) + 10;
            marks[i][1] = (int) (Math.random() * 90) + 10;
            marks[i][2] = (int) (Math.random() * 90) + 10;
        }

        return marks;
    }

    public static double[][] calculateResult(int[][] marks) {
        double[][] result = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];

            double average = total / 3.0;
            double percentage = (total * 100.0) / 300;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }

        return result;
    }

    public static String[] findGrades(double[][] result) {
        String[] grades = new String[result.length];

        for (int i = 0; i < result.length; i++) {

            double percentage = result[i][2];
            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        return grades;
    }

    public static void displayReport(int[][] marks, double[][] result, String[] grades) {

        System.out.println("\nStudent Report Card");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-8s %-10s %-10s %-10s %-8s %-10s %-10s %-8s%n",
                "ID", "Physics", "Chem", "Maths", "Total",
                "Average", "Percent", "Grade");

        for (int i = 0; i < marks.length; i++) {

            System.out.printf("%-8d %-10d %-10d %-10d %-8.0f %-10.2f %-10.2f %-8s%n",
                    i + 1,
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    result[i][0],
                    result[i][1],
                    result[i][2],
                    grades[i]);
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        int[][] marks = generateMarks(students);
        double[][] result = calculateResult(marks);
        String[] grades = findGrades(result);
        displayReport(marks, result, grades);

    }
}