package chapter6;

import java.security.SecureRandom;

public class ex6_12 {
    public static void main(String[] args) {
        SecureRandom secureNumber = new SecureRandom();
//        for (int i = 0; i < 30; i++) {
//            int n = -2 + secureNumber.nextInt(12);
//            System.out.print(n + "\t");
//
//        }
        int n = 1 + secureNumber.nextInt(4);
        System.out.println( (10 * n));


    }
}
