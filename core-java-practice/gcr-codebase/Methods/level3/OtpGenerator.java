import java.util.*;

class OtpGenerator {
    public int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    public boolean areOtpsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        OtpGenerator gen = new OtpGenerator();
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = gen.generateOTP();
        }
        System.out.println("Generated OTPs: " + Arrays.toString(otps));
        System.out.println("Are all OTPs unique? " + gen.areOtpsUnique(otps));
    }
}