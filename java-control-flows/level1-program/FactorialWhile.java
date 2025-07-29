import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if (n < 0) {
            System.out.println("Not a valid input");
            return;
        }

        int result = 1, i = 1;
        while (i <= n) result *= i++;
        System.out.println("Factorial = " + result);
    }
}
