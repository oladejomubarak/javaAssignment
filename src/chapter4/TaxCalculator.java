package chapter4;

import java.util.Scanner;

public class TaxCalculator {
    private static String citizenName;
    private static double citizenEarnings;
    private static int counter = 0;

    private static double tax;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (counter < 3){
            counter++;
            System.out.println("Enter your name: ");
            citizenName = input.nextLine();
            System.out.println("Enter your earnings: ");
            citizenEarnings = input.nextDouble();
            input.nextLine();
            if (citizenEarnings <= 30000){
                tax = 0.15 * citizenEarnings;
                System.out.printf("The tax to be paid by %s on %.2f earnings is $%.2f%n", citizenName, citizenEarnings, tax);
            }
            else {
                tax = 0.20 * citizenEarnings;
                System.out.printf("The tax to be paid by %s on %.2f earnings is $%.2f%n", citizenName, citizenEarnings, tax);

            }
        }

        }
}
