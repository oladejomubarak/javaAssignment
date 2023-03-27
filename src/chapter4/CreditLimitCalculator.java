package chapter4;

import java.util.Scanner;

public class CreditLimitCalculator {
    private static final Scanner input = new Scanner(System.in);
//    private static int accountNumber;
//    private static int beginningOfTheMonthBalance;
//    private static int allItemsChargedPerMonth;
//    private static int allCreditAppliedPerMonth;
    //private static int allowedCreditLimit;

    public static void main(String[] args) {
        System.out.println("Enter balance at the beginning of the month: ");
        int beginningOfTheMonthBalance = input.nextInt();
        System.out.println("Enter total charges per month: ");
        int allItemsChargedPerMonth = input.nextInt();
        System.out.println("enter total credit applied per month: ");
        int allCreditAppliedPerMonth = input.nextInt();
        System.out.println("Enter the credit limit allowed");
        int allowedCreditLimit = input.nextInt();

        int newBalance = beginningOfTheMonthBalance + allItemsChargedPerMonth - allCreditAppliedPerMonth;
        System.out.println("new balance is: " + newBalance);
        if (newBalance > allowedCreditLimit) System.out.println("Credit limit exceeded!");
        else System.out.println("credit limit is not exceeded");

    }
//    public static int getNewBalance() {
//        int newBalance = beginningOfTheMonthBalance + allItemsChargedPerMonth - allCreditAppliedPerMonth;
//        if (getNewBalance() > allowedCreditLimit) System.out.println("Credit limit exceeded!");
//
//        return newBalance;
//    }
//     public static int getCreditLimitStatus(){
//        int creditLimitStatus =
//
//  -




}
