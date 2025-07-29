import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = new int[20]; // max 20 digits
        int index = 0;

        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
        }

        int[] freq = new int[10];
        for (int i = 0; i < index; i++) {
            freq[digits[i]]++;
        }

        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0)
                System.out.println("Digit " + i + ": " + freq[i]);
        }
    }
}
