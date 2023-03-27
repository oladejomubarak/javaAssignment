package chapter6.calculatingTheSumOfDigits;

import java.util.Scanner;

public class CalculateSumOfDigits {
    private static int sumDigits(int digits){
        String stringNumbers = Integer.toString(digits);
        int sum = 0;
        for (int i = 0; i < stringNumbers.length(); i++) {
            char stringChar = stringNumbers.charAt(i);
            int eachDigit = Integer.parseInt(String.valueOf(stringChar));
            sum += eachDigit;

        }
        return  sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter the digits to be summed: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.printf("The sum of the digits is: %d", sumDigits(userInput));
    }
}
