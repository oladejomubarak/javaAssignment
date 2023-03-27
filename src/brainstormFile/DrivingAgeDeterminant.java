package brainstormFile;

import java.util.Scanner;

public class DrivingAgeDeterminant {
    public static void main( String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = input.next();
        System.out.println("In what year were you born? ");
        int birthYear = input.nextInt();
        int currentYear = 2022;
        int age = currentYear - birthYear;
        if (age >= 16){
            System.out.println(name + ", you are " + age + " and you can drive in the US");
        }
        else
        {
            System.out.println("Sorry " + name + ", you are not allowed to drive in the US.");
        }


    }
}
