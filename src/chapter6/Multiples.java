package chapter6;

import java.util.Scanner;

public class Multiples {
    private static boolean isMultiple(int num1, int num2){
        if (num2 % num1 == 0) {
            System.out.printf("%d is the multiple of %d ", num2, num1);
            return true;
            }
        else {
            System.out.printf("%d is not the multiple of %d ", num2, num1);
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();
        System.out.println(isMultiple(num1, num2));

    }
}
