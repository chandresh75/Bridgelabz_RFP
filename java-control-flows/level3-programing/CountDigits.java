import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int count = 0;

        do {
            count++;
            number /= 10;
        } while (number != 0);

        System.out.println("Number of digits: " + count);
        input.close();
    }
}
