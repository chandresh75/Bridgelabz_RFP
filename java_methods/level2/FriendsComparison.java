import java.util.Scanner;

public class FriendsComparison {
    public static int findIndexOfMin(int[] arr) {
        int min = arr[0], idx = 0;
        for (int i = 1; i < arr.length; i++) if (arr[i] < min) { min = arr[i]; idx = i; }
        return idx;
    }

    public static int findIndexOfMax(int[] arr) {
        int max = arr[0], idx = 0;
        for (int i = 1; i < arr.length; i++) if (arr[i] > max) { max = arr[i]; idx = i; }
        return idx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3], heights = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }

        System.out.println("Youngest: " + names[findIndexOfMin(ages)]);
        System.out.println("Tallest: " + names[findIndexOfMax(heights)]);
    }
}
