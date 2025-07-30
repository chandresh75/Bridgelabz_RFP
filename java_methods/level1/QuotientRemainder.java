import java.util.Scanner;

public class QuotientRemainder {
    public static int[] findRemainderAndQuotient(int num, int divisor) {
        int[] result = new int[2];
        result[0] = num / divisor;
        result[1] = num % divisor;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number and divisor: ");
        int num = sc.nextInt(), divisor = sc.nextInt();
        int[] res = findRemainderAndQuotient(num, divisor);
        System.out.println("Quotient: " + res[0] + ", Remainder: " + res[1]);
    }
}
