import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salaries = new double[10];
        double[] years = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary and years of service for employee " + (i + 1));
            double salary = sc.nextDouble();
            double year = sc.nextDouble();

            if (salary < 0 || year < 0) {
                System.out.println("Invalid input. Please re-enter.");
                i--; // retry this employee
                continue;
            }

            salaries[i] = salary;
            years[i] = year;
        }

        for (int i = 0; i < 10; i++) {
            if (years[i] > 5) {
                bonuses[i] = salaries[i] * 0.05;
            } else {
                bonuses[i] = salaries[i] * 0.02;
            }

            newSalaries[i] = salaries[i] + bonuses[i];
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.println("\n--- Bonus Report ---");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f\n",
                    i + 1, salaries[i], bonuses[i], newSalaries[i]);
        }

        System.out.printf("Total Bonus: %.2f\n", totalBonus);
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
    }
}
