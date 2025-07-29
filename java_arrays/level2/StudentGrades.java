import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] physics = new int[n], chemistry = new int[n], maths = new int[n];
        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + " (Physics, Chemistry, Maths): ");
            physics[i] = sc.nextInt();
            chemistry[i] = sc.nextInt();
            maths[i] = sc.nextInt();

            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid marks. Try again.");
                i--;
                continue;
            }

            percent[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            if (percent[i] >= 90) grade[i] = 'A';
            else if (percent[i] >= 75) grade[i] = 'B';
            else if (percent[i] >= 60) grade[i] = 'C';
            else if (percent[i] >= 40) grade[i] = 'D';
            else grade[i] = 'F';
        }

        System.out.println("\n--- Result ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d: P=%d, C=%d, M=%d, %%=%.2f, Grade=%c\n",
                    i + 1, physics[i], chemistry[i], maths[i], percent[i], grade[i]);
        }
    }
}
