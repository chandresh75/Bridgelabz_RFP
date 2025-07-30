import java.util.Scanner;

public class ChocolateDivision {
    public static int[] findRemainderAndQuotient(int chocs, int children) {
        return new int[]{chocs / children, chocs % children};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates and children: ");
        int chocs = sc.nextInt(), children = sc.nextInt();
        int[] res = findRemainderAndQuotient(chocs, children);
        System.out.println("Each child gets: " + res[0] + ", Remaining: " + res[1]);
    }
}
