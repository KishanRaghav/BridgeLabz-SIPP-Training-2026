import java.util.*;

class CollinearPoints {
    public boolean checkCollinearSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        return slopeAB == slopeBC;
    }

    public boolean checkCollinearArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        CollinearPoints cp = new CollinearPoints();
        System.out.println("Collinear by Slope: " + cp.checkCollinearSlope(x1, y1, x2, y2, x3, y3));
        System.out.println("Collinear by Area: " + cp.checkCollinearArea(x1, y1, x2, y2, x3, y3));
    }
}