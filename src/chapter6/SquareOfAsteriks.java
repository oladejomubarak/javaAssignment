package chapter6;

import java.util.Scanner;

public class SquareOfAsteriks {
    private static void squareOfAsteriks(int side){
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the square length: ");
        int side = input.nextInt();
        squareOfAsteriks(side);
    }
}
