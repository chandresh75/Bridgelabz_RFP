import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (year < 1582) {
            System.out.println("Year must be >= 1582 (Gregorian calendar).");
        } else {
            if (year % 4 == 0) {
                if (year % 100 != 0 || year % 400 == 0) {
                    System.out.println("Leap Year");
                } else {
                    System.out.println("Not a Leap Year");
                }
            } else {
                System.out.println("Not a Leap Year");
            }
        }

        // Single if version
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("Leap Year (Logical check)");
        } else if (year >= 1582) {
            System.out.println("Not a Leap Year (Logical check)");
        }

        input.close();
    }
}
