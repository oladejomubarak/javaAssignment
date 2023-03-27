package chapter6;

import java.util.Scanner;

public class RoundingNumbers6_10 {
    private static  double y;
    private static  double x;

    public static double roundToInt(double x){
        y = Math.floor(x * 10 + 0.5) / 10;
        return y;
    }
    public static double roundToTenth(double x){
        y = Math.floor(x * 100 + 0.5) / 100;
        return y;
    }
    public static double roundToHundred(double x){
        y = Math.floor(x * 1000 + 0.5) / 1000;
        return y;
    }
    public static double roundToThousand(double x){
        y = Math.floor(x * 10000 + 0.5) / 10000;
        return y;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number for rounding up: ");
        x = input.nextDouble();
        System.out.println("the value of y rounded to integer is " + roundToInt(x));
        System.out.println("the value of y rounded to tenth position is " + roundToTenth(x));
        System.out.println("the value of y rounded to hundredth position is " + roundToHundred(x));
        System.out.println("the value of y rounded to thousandth position is " + roundToThousand(x));
    }
}
