import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; // 0=phy, 1=chem, 2=math
        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1));
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
                if (marks[i][j] < 0) {
                    System.out.println("Invalid mark. Re-enter.");
                    j--;
                }
            }

            percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percent[i] >= 90) grade[i] = 'A';
            else if (percent[i] >= 75) grade[i] = 'B';
            else if (percent[i] >= 60) grade[i] = 'C';
            else if (percent[i] >= 40) grade[i] = 'D';
            else grade[i] = 'F';
        }

        System.out.println("\n--- Student Grades ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d: P=%d, C=%d, M=%d, %%=%.2f, Grade=%c\n",
                    i + 1, marks[i][0], marks[i][1], marks[i][2], percent[i], grade[i]);
        }
    }
}
