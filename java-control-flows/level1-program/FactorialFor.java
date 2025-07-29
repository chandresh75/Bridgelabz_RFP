import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if (n < 0) {
            System.out.println("Not a valid input");
            return;
        }

        int result = 1;
        for (int i = 1; i <= n; i++) result *= i;
        System.out.println("Factorial = " + result);
    }
}
