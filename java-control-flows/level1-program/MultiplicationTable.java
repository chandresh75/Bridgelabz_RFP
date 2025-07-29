import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
