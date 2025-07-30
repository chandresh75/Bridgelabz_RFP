import java.util.Scanner;

public class CalendarDisplay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        printCalendar(month, year);
    }

    // Method to print the calendar
    public static void printCalendar(int month, int year) {
        String[] months = {
            "", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        int[] days = {
            0, 31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        // Adjust February days for leap year
        if (month == 2 && isLeapYear(year)) {
            days[2] = 29;
        }

        // Print header
        System.out.println("\n  " + months[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Get the first day of the month
        int firstDay = getFirstDayOfMonth(month, year);

        // Print leading spaces
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the days
        for (int day = 1; day <= days[month]; day++) {
            System.out.printf("%3d ", day);

            // Break line after Saturday
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    // Check leap year
    public static boolean isLeapYear(int year) {
        if (year % 4
