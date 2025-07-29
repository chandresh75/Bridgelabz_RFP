import java.util.Scanner;

public class CountdownWhile {
    public static void main(String[] args) {
        int counter = new Scanner(System.in).nextInt();
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Liftoff!");
    }
}
