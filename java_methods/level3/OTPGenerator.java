import java.util.Arrays;

public class OTPGenerator {

    public static void main(String[] args) {
        int[] otpArray = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
        }

        System.out.println("Generated OTPs: " + Arrays.toString(otpArray));

        boolean isUnique = checkUniqueOTPs(otpArray);
        System.out.println("Are all OTPs unique? " + isUnique);
    }

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000); // generates from 100000 to 999999
    }

    // Method to check if all OTPs are unique
    public static boolean checkUniqueOTPs(int[] otpArray) {
        for (int i = 0; i < otpArray.length - 1; i++) {
            for (int j = i + 1; j < otpArray.length; j++) {
                if (otpArray[i] == otpArray[j]) {
                    return false; // Duplicate found
                }
            }
        }
        return true; // All unique
    }
}
