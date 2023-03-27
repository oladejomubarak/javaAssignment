package chapter4;

import java.util.Scanner;

public class SalesCommissionCalculator {
    private static final double salaryPerWeek = 200;
    private static final double commissionRate = 0.09;
    private static double totalPrice = 0.0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter price of item or -1 to continue: ");
        double itemPrice = input.nextDouble();
        while (itemPrice != -1){
            System.out.println("enter price of the next item: ");
            itemPrice = input.nextDouble();
            totalPrice += itemPrice;
        }
           if(totalPrice != 0){
               System.out.printf("The total price of all the item sold for the week is $%.2f %n", totalPrice);
            double totalEarnings = totalPrice * commissionRate + salaryPerWeek;
            System.out.printf("The total earnings of the week for all the item sold is $%.2f", totalEarnings);}
           else {
               System.out.println("No price of item entered");
           }

    }

}
