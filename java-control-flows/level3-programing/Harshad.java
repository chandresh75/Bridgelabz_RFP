import java.util.Scanner;

public class Harshad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int temp = number, sum = 0;

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if (number % sum == 0)
            System.out.println(number + " is a Harshad Number.");
        else
            System.out.println(number + " is not a Harshad Number.");

        input.close();
    }
}
