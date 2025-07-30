import java.util.Scanner;

public class GeometryUtils {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input coordinates
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Calculate distance
        double distance = getEuclideanDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance = %.2f\n", distance);

        // Get slope and intercept
        double[] line = getLineEquation(x1, y1, x2, y2);
        if (line != null) {
            double m = line[0];
            double b = line[1];
            System.out.printf("Equation of Line: y = %.2fx + %.2f\n", m, b);
        } else {
            System.out.println("The line is vertical. Slope is undefined.");
        }
    }

    // Method to compute Euclidean distance
    public static double getEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    // Method to compute slope and y-intercept of line
    public static double[] getLineEquation(double x1, double y1, double x2, double y2) {
        if (x2 == x1) {
            return null; // Vertical line, slope undefined
        }

        double m = (y2 - y1) / (x2 - x1);        // slope
        double b = y1 - m * x1;                 // y-intercept

        return new double[]{m, b};
    }
}
