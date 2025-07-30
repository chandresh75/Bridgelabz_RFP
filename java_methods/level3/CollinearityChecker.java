import java.util.Scanner;

public class CollinearityChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for 3 points
        System.out.print("Enter x1 and y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2 and y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.print("Enter x3 and y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        // Slope method
        boolean slopeCheck = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear by Slope Method: " + slopeCheck);

        // Area method
        boolean areaCheck = areCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear by Area Method: " + areaCheck);
    }

    // Method using slope formula
    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Avoid division by zero by cross-multiplying
        int lhs = (y2 - y1) * (x3 - x2);
        int rhs = (y3 - y2) * (x2 - x1);

        return lhs == rhs;
    }

    // Method using area of triangle formula
    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) +
                             x2 * (y3 - y1) +
                             x3 * (y1 - y2));

        return area == 0.0;
    }
}
