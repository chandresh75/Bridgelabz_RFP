import java.util.Scanner;

public class OddEvenPrinter {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if (n < 1) {
            System.out.println("Not a natural number");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                System.out.println(i + " is Even");
            else
                System.out.println(i + " is Odd");
        }
    }
}
