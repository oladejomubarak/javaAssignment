package chapter7;

import java.security.SecureRandom;

public class RollDice {
    public static void main(String[] args) {
        int[] frequency = new int[7];
        SecureRandom randomNumber = new SecureRandom();
        System.out.printf("%4s%10s%n", "Face", "Frequency");
        for (int roll = 1; roll < 60_000_000; roll++) {
            ++frequency[1 + randomNumber.nextInt(6)];
        }

        for (int face = 1; face < frequency.length; face++) {
            System.out.printf("%4d%10d%n", face, frequency[face]);

        }
    }
}
