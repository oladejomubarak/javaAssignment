package chapter5;

import java.util.Scanner;

public class ex5_11_Extremes {
    private static int count;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many numbers do you wanna input? ");
        int noOfIntegers = scanner.nextInt();
        System.out.println("enter a number");
        int userInput = scanner.nextInt();
        int maxNum = userInput;
        int minNum= userInput;
        while (count < noOfIntegers -1){
            System.out.println("enter a number: ");
            userInput = scanner.nextInt();
            if(userInput > maxNum) maxNum = userInput;
            if(userInput < minNum) minNum = userInput;
            count++;
        }

        int sum = maxNum + minNum;
        System.out.printf("minimum number is %d%n", minNum);
        System.out.printf("maximum number is %d%n", maxNum);
        System.out.printf("sum is %d%n", sum);
    }
}
