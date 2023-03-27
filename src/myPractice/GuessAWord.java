package myPractice;

import java.util.Scanner;

public class GuessAWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word in lower case letters: ");
        String word;
        while (true) {
            word = input.next();
            if (word.equals("hello")) {
                System.out.println("correct");
                break;
            } else {
                System.out.println("try again");
                continue;

            }
        }

    }
}