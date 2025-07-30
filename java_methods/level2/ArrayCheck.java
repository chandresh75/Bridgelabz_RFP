import java.util.Scanner;

public class ArrayCheck {
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();

            if (!isPositive(numbers[i])) System.out.println("Negative");
            else {
                System.out.println("Positive");
                System.out.println(isEven(numbers[i]) ? "Even" : "Odd");
            }
        }

        int cmp = compare(numbers[0], numbers[4]);
        if (cmp == 1) System.out.println("First > Last");
        else if (cmp == 0) System.out.println("First == Last");
        else System.out.println("First < Last");
    }
}
