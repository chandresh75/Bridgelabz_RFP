import java.util.Arrays;

public class four {

    public static void main(String[] args) {
        int number = 12021;

        System.out.println("Number: " + number);

        int[] digits = storeDigits(number);
        System.out.println("Original Digits: " + Arrays.toString(digits));

        int digitCount = countDigits(number);
        System.out.println("Digit Count: " + digitCount);

        int[] reversed = reverseDigits(digits);
        System.out.println("Reversed Digits: " + Arrays.toString(reversed));

        boolean isPalindrome = areArraysEqual(digits, reversed);
        System.out.println("Is Palindrome: " + isPalindrome);

        boolean isDuck = isDuckNumber(digits);
        System.out.println("Is Duck Number: " + isDuck);
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

    // Method to reverse a digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Method to check if it's a palindrome number
    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversed = reverseDigits(digits);
        return areArraysEqual(digits, reversed);
    }

    // Method to check if it's a duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;  // skip leading digit
        }
        return false;
    }
}
