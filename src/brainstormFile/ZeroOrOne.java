package brainstormFile;

import java.util.Scanner;

public class ZeroOrOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number: ");
        int number = input.nextInt();
        if(number == 0){
            System.out.println("1");
        }
        else if (number == 1){
            System.out.println("0");
        }
    }
}
