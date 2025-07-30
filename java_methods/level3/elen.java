import java.util.Random;

public class elen {

    public static void main(String[] args) {
        double[][] employeeData = generateEmployeeData(10); // [][0] = Salary, [][1] = Years
        double[][] bonusData = calculateBonuses(employeeData); // [][0] = Bonus, [][1] = New Salary

        displayReport(employeeData, bonusData);
    }

    // Generate 10 employees' salary and years of service
    public static double[][] generateEmployeeData(int count) {
        double[][] data = new double[count][2];
        Random rand = new Random();

        for (int i = 0; i < count; i++) {
            // Salary between 10000 to 99999
            int salary = rand.nextInt(90000) + 10000;

            // Years of service between 0 to 10
            int years = rand.nextInt(11);

            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    // Calculate bonus and new salary
    public static double[][] calculateBonuses(double[][] data) {
        int n = data.length;
        double[][] bonusData = new double[n][2]; // bonus, new salary

        for (int i = 0; i < n; i++) {
            double salary = data[i][0];
            int years = (int) data[i][1];

            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;

            bonusData[i][0] = bonus;
            bonusData[i][1] = newSalary;
        }

        return bonusData;
    }

    // Display summary table
    public static void displayReport(double[][] oldData, double[][] newData) {
        double totalOld = 0, totalBonus = 0, totalNew = 0;

        System.out.printf("%-10s %-15s %-15s %-15s %-15s%n",
                "EmpID", "Old Salary", "Years of Service", "Bonus", "New Salary");

        for (int i = 0; i < oldData.length; i++) {
            double salary = oldData[i][0];
            int years = (int) oldData[i][1];
            double bonus = newData[i][0];
            double newSalary = newData[i][1];

            System.out.printf("%-10d %-15.2f %-15d %-15.2f %-15.2f%n",
                    (i + 1), salary, years, bonus, newSalary);

            totalOld += salary;
            totalBonus += bonus;
            totalNew += newSalary;
        }

        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-10s %-15.2f %-15s %-15.2f %-15.2f%n",
                "Total", totalOld, "", totalBonus, totalNew);
    }
}
