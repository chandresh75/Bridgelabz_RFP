import java.util.Scanner;

public class NumberSign {
    public static int checkSign(int number) {
        if (number > 0) return 1;
        else if (number < 0) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int result = checkSign(number);
        if (result == 1)
            System.out.println("Positive");
        else if (result == -1)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
}
