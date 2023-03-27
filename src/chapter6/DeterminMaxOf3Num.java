package chapter6;

import java.util.Scanner;

public class DeterminMaxOf3Num {
    private static int maximum(int x, int y, int z){
        int maxValue = x;
        if(y > maxValue) {
            maxValue = y;
        }
        if(z > maxValue) {
            maxValue = z;
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number: ");
        int firstNum = scanner.nextInt();
        System.out.println("enter first number: ");
        int secondNum = scanner.nextInt();
        System.out.println("enter third number: ");
        int thirdNum = scanner.nextInt();

        int result = maximum(firstNum, secondNum, thirdNum);
        System.out.println("the maximum value is " + result);
    }

}

