import java.util.Scanner;

public class BMIMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3]; // 0=weight, 1=height, 2=bmi
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            double weight, height;

            do {
                System.out.println("Enter weight (kg) and height (m) for person " + (i + 1));
                weight = sc.nextDouble();
                height = sc.nextDouble();
            } while (weight <= 0 || height <= 0);

            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = weight / (height * height);

            if (personData[i][2] < 18.5) status[i] = "Underweight";
            else if (personData[i][2] < 25) status[i] = "Normal";
            else if (personData[i][2] < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d: Height = %.2f, Weight = %.2f, BMI = %.2f, Status = %s\n",
                    i + 1, personData[i][1], personData[i][0], personData[i][2], status[i]);
        }
    }
}
