package brainstormFile;

import java.util.Scanner;

public class GuessALetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a letter ");
        String letter = input.next();
        while (true) {
            if (letter.equals("Y") || letter.equals("y")) {
                System.out.println("Yes");
                break;
            } else {
                if (letter.equals("N") || letter.equals("n")) {
                    System.out.println("No");
                    break;
                } else {
                    System.out.println("Invalid letter");
                    break;
                }

            }


        }
    }
}
