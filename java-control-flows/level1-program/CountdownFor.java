import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {
        int counter = new Scanner(System.in).nextInt();
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Liftoff!");
    }
}
