import java.util.Scanner;

public class NaturalNumberSum {
    public static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid. Enter a natural number (>0)");
            return;
        }
        int rSum = recursiveSum(n);
        int fSum = formulaSum(n);
        System.out.println("Recursive Sum: " + rSum);
        System.out.println("Formula Sum: " + fSum);
        System.out.println("Are both equal? " + (rSum == fSum));
    }
}
