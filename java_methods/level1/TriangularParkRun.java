import java.util.Scanner;

public class TriangularParkRun {
    public static int calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return (int)(5000 / perimeter); // 5 km = 5000 meters
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides of triangle: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        System.out.println("Number of rounds: " + calculateRounds(a, b, c));
    }
}
