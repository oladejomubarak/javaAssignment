package chapter6;

import java.util.Scanner;

public class HypotenuseCalculation {
   private static final Scanner input = new Scanner(System.in);
    private static double hypotenuse (double side1, double side2){
        double sideDoubled = (Math.pow(side1, 2)) + (Math.pow(side2, 2));
        double result = Math.sqrt(sideDoubled);
     return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of the opposite side of the triangle: ");
        double oppositeSide = input.nextDouble();
        System.out.println("Enter the value of the adjacent side of the triangle: ");
        double adjacentSide = input.nextDouble();

        System.out.printf("The value of the third side(Hypotenuse) of the triangle is %.2f", hypotenuse(oppositeSide, adjacentSide));
    }
//   public static void main(String[] args) {
//      double result = Math.hypot(4, 8);
//       System.out.println(result);
//
//   }
}
