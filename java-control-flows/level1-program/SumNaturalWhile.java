import java.util.Scanner;

public class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Not a natural number");
            return;
        }

        int sum = 0, i = 1;
        while (i <= n) sum += i++;
        int formulaSum = n * (n + 1) / 2;

        System.out.println("While loop sum: " + sum);
        System.out.println("Formula sum: " + formulaSum);
        System.out.println("Both sums are equal? " + (sum == formulaSum));
    }
}
