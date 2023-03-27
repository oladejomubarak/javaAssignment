package myPractice;

import java.util.Random;
import java.util.Scanner;

public class GuessFrom1to10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomNumber = new Random();
        int number = 1 + randomNumber.nextInt(10);
        System.out.println(number);
        System.out.println("Guess a number: ");
        int guessedNumber = input.nextInt();
        while(guessedNumber != number) {
            if (guessedNumber > number) {
                System.out.println("the number is less than that");
            } else {
                System.out.println("the number is greater than that");
            }
            System.out.println("Guess a number: ");
            guessedNumber = input.nextInt();
            if (guessedNumber == number) {
                System.out.println("Congrats. You won");
            }
        }
    }
}
