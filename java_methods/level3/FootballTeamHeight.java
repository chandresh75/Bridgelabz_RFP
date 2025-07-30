import java.util.Random;
import java.util.Arrays;

public class FootballTeamHeight {

    public static void main(String[] args) {
        int[] heights = new int[11];
        generateRandomHeights(heights);

        System.out.println("Player Heights (in cm): " + Arrays.toString(heights));
        int sum = getSum(heights);
        double mean = getMean(heights);
        int shortest = getShortest(heights);
        int tallest = getTallest(heights);

        System.out.println("Sum of Heights: " + sum + " cm");
        System.out.println("Mean Height: " + mean + " cm");
        System.out.println("Shortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
    }

    // Fill the array with random values between 150 and 250
    public static void generateRandomHeights(int[] heights) {
        Random rand = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; // random value from 150 to 250
        }
    }

    // Method to calculate sum
    public static int getSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate mean
    public static double getMean(int[] heights) {
        return (double) getSum(heights) / heights.length;
    }

    // Method to find shortest height
    public static int getShortest(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) min = height;
        }
        return min;
    }

    // Method to find tallest height
    public static int getTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) max = height;
        }
        return max;
    }
}
