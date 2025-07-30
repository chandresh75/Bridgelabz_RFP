import java.util.Arrays;

public class three {

    public static void main(String[] args) {
        int number = 882221;

        System.out.println("Number: " + number);

        int digitCount = countDigits(number);
        System.out.println("Digit Count: " + digitCount);

        int[] digits = storeDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        int digitSum = sumOfDigits(digits);
        System.out.println("Sum of Digits: " + digitSum);

        int squareSum = sumOfSquares(digits);
        System.out.println("Sum of Squares of Digits: " + squareSum);

        System.out.println("Is Harshad Number: " + isHarshad(number));

        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int[] row : frequency) {
            if (row[1] > 0) {
                System.out.println("Digit " + row[0] + ": " + row[1] + " time(s)");
            }
        }
    }

    // Method to count the number of digits
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Method to store the digits into an array
    public static int[] storeDigits(int num) {
        String str = String.valueOf(num);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }

    // Method to calculate the sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method to calculate the sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Method to check if a number is Harshad
    public static boolean isHarshad(int num) {
        int[] digits = storeDigits(num);
        int sum = sumOfDigits(digits);
        return num % sum == 0;
    }

    // Method to compute the frequency of each digit using a 2D array
    public static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10]; // for digits 0-9
        for (int d : digits) {
            freq[d]++;
        }

        int[][] result = new int[10][2];
        for (int i = 0; i < 10; i++) {
            result[i][0] = i;       // digit
            result[i][1] = freq[i]; // frequency
        }
        return result;
    }
}
