import java.util.Scanner;
import java.util.Random;

public class twll{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[][] pcmScores = generatePCMScores(n);
        double[][] results = calculateResults(pcmScores);
        displayScorecard(pcmScores, results);
    }

    // Generate random 2-digit PCM scores (2D array)
    public static int[][] generatePCMScores(int n) {
        int[][] scores = new int[n][3];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(41) + 60; // Physics (60-100)
            scores[i][1] = rand.nextInt(41) + 60; // Chemistry (60-100)
            scores[i][2] = rand.nextInt(41) + 60; // Math (60-100)
        }

        return scores;
    }

    // Calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        int n = scores.length;
        double[][] result = new double[n][3]; // total, avg, percent

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            result[i][0] = total;
            result
