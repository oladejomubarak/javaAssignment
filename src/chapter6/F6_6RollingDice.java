package chapter6;

import java.security.SecureRandom;

public class F6_6RollingDice {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        for (int count = 1; count <= 20; count++){
            int face = 1 + randomNumber.nextInt(6);
            System.out.printf("%d  ", face);

            if (count % 5 == 0){
                System.out.println();
            }
        }
    }
}
