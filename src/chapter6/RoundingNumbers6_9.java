package chapter6;

import java.util.Scanner;

public class RoundingNumbers6_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to round up: ");
        double x = input.nextDouble();
        double y = Math.floor(x + 0.5);
        System.out.println("The value X before round up is " + x);
        System.out.println("The value X after round up is " + y);
    }
}
