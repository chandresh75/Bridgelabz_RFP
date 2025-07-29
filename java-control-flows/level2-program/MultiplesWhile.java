import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number below 100: ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input.");
            return;
        }

        int i = 100;
        while (i >= 1) {
            if (i % number == 0)
                System.out.print(i + " ");
            i--;
        }
    }
}
