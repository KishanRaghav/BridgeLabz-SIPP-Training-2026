import java.util.*;

class LineGeometry {
    public double findEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        LineGeometry lg = new LineGeometry();
        System.out.printf("Euclidean Distance: %.2f\n", lg.findEuclideanDistance(x1, y1, x2, y2));
        double[] lineParams = lg.findLineEquation(x1, y1, x2, y2);
        System.out.printf("Equation Parameters -> Slope (m): %.2f, Y-Intercept (b): %.2f\n", lineParams[0], lineParams[1]);
        System.out.printf("Equation of line: y = %.2fx + %.2f\n", lineParams[0], lineParams[1]);
    }
}