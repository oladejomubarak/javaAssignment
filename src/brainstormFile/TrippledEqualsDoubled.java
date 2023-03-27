package brainstormFile;

import java.util.Scanner;

public class TrippledEqualsDoubled {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a num: ");
        int num1 = input.nextInt();
        System.out.println("enter another num: ");
        int num2 = input.nextInt();
        if(num1 * 3 == num2 * 2){
            System.out.println("Triple of num1 equals double of num2");
        } else if (num1 * 3 != num2 * 2) {
            System.out.println("Triple of num1 is not equal to double of num2");
        }
    }
}
