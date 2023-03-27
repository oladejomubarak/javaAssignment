package chapter6;

import java.util.Scanner;

public class ParkingCharges {
    private static int hour;
    private static double charges;
    private static final Scanner input = new Scanner(System.in);

    public static double calculateCharges(int hour){
            double minimumCharges = 2.0;
        if (hour <= 3){
            charges = minimumCharges;
        } else {
            charges = minimumCharges;
            int exceededHour = hour - 3;
            charges += exceededHour * 0.5;
        }
        if(charges > 10.00) charges = 10.00;

    return charges;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of hours the car was parked: ");
        hour = input.nextInt();
        if(hour <= 1){
        System.out.printf("The charges for the %d hour that the car was parked is $%.2f%n", hour, calculateCharges(hour));
        } else {
            System.out.printf("The charges for the %d hours that the car was parked is $%.2f%n", hour, calculateCharges(hour));
        }
    }

}
