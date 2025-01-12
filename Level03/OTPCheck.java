import java.util.*;

class OTPCheck {

    public static void main(String[] args) {
        // Create an array to store OTPs.
        int[] otps = new int[10];
        boolean areOTPsUnique = true;

        // Generating 10 OTPs (6-digit numbers)
        for (int i = 0; i < otps.length; i++) {
            otps[i] = (int)(Math.random() * 900000) + 100000; // Generate a 6-digit OTP
        }

        // Checking the uniqueness of the OTPs
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    areOTPsUnique = false;
                    break; // Exit the loop early if a duplicate OTP is found
                }
            }
            if (!areOTPsUnique) {
                break; // Exit the outer loop as well once uniqueness is compromised
            }
        }

        // Printing OTPs and result of uniqueness check
        System.out.println("Generated OTPs: " + Arrays.toString(otps));
        System.out.println("Are all OTPs unique? " + areOTPsUnique);
    }
}
