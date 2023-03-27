package myPractice;

import java.util.Scanner;

public class AgeDeterminant {
    public static void main( String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("how old are you? : ");
        int age = input.nextInt();
        int currentYear = 2022;
        int birthYear = currentYear - age;
        System.out.println("You were born in " + birthYear);

    }

}
