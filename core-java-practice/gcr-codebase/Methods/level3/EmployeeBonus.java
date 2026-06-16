import java.util.*;

class EmployeeBonus {
    public int[][] generateSalaryAndService() {
        int[][] data = new int[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = (int) (Math.random() * 90000) + 10000;
            data[i][1] = (int) (Math.random() * 10) + 1;
        }
        return data;
    }

    public double[][] calculateNewSalaryAndBonus(int[][] data) {
        double[][] financialDetails = new double[10][2];
        for (int i = 0; i < 10; i++) {
            int oldSalary = data[i][0];
            int service = data[i][1];
            double bonusPercent = (service > 5) ? 0.05 : 0.02;
            double bonus = oldSalary * bonusPercent;
            double newSalary = oldSalary + bonus;
            financialDetails[i][0] = newSalary;
            financialDetails[i][1] = bonus;
        }
        return financialDetails;
    }

    public void processAndDisplayResults(int[][] data, double[][] finances) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Emp\tOld_Sal\tService\tNew_Sal\tBonus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%d\t%d\t%.2f\t%.2f\n", (i + 1), data[i][0], data[i][1], finances[i][0], finances[i][1], data[i][0]);
            totalOldSalary += data[i][0];
            totalNewSalary += finances[i][0];
            totalBonus += finances[i][1];
        }
        System.out.println("-------------------------------------------");
        System.out.printf("Total\t%.2f\t-\t%.2f\t%.2f\n", totalOldSalary, totalNewSalary, totalBonus);
    }

    public static void main(String[] args) {
        EmployeeBonus eb = new EmployeeBonus();
        int[][] rawData = eb.generateSalaryAndService();
        double[][] updates = eb.calculateNewSalaryAndBonus(rawData);
        eb.processAndDisplayResults(rawData, updates);
    }
}