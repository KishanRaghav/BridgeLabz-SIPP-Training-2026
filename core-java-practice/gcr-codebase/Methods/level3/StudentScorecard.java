import java.util.*;

class StudentScorecard {
    public int[][] generateScores(int studentCount) {
        int[][] scores = new int[studentCount][3];
        for (int i = 0; i < studentCount; i++) {
            scores[i][0] = (int) (Math.random() * 90) + 10;
            scores[i][1] = (int) (Math.random() * 90) + 10;
            scores[i][2] = (int) (Math.random() * 90) + 10;
        }
        return scores;
    }

    public double[][] calculateMetrics(int[][] scores) {
        double[][] metrics = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            metrics[i][0] = Math.round(total * 100.0) / 100.0;
            metrics[i][1] = Math.round(average * 100.0) / 100.0;
            metrics[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return metrics;
    }

    public void displayScorecard(int[][] scores, double[][] metrics) {
        System.out.println("Roll\tPhy\tChem\tMath\tTotal\tAvg\tPerc%");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%.2f\t%.2f%%\n", 
                (i + 1), scores[i][0], scores[i][1], scores[i][2], metrics[i][0], metrics[i][1], metrics[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentCount = sc.nextInt();
        StudentScorecard ss = new StudentScorecard();
        int[][] scores = ss.generateScores(studentCount);
        double[][] metrics = ss.calculateMetrics(scores);
        ss.displayScorecard(scores, metrics);
    }
}