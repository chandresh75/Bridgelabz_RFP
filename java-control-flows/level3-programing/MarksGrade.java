import java.util.Scanner;

public class MarksGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks in Physics: ");
        int p = input.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        int c = input.nextInt();
        System.out.print("Enter marks in Maths: ");
        int m = input.nextInt();

        double avg = (p + c + m) / 3.0;
        System.out.println("Average Marks: " + avg);

        if (avg >= 90) {
            System.out.println("Grade: A+");
        } else if (avg >= 75) {
            System.out.println("Grade: A");
        } else if (avg >= 60) {
            System.out.println("Grade: B");
        } else if (avg >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F - Fail");
        }

        input.close();
    }
}
