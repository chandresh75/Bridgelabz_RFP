import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        if (number > 0)
            System.out.println("Positive");
        else if (number < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
}
