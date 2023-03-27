package chapter4;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int moreTrip = 0;
        double miles;
        double gallon;
        double totalTrip = 0.0;
        double eachTrip;
        System.out.println("Enter miles in kilometer: ");
        miles = input.nextDouble();
        while (moreTrip != -1) {
            System.out.println("Enter gallon in litre: ");
            gallon = input.nextDouble();
            eachTrip = miles / gallon;
            System.out.println(eachTrip);
            totalTrip += eachTrip;
//            moreTrip++;
            System.out.println("Enter miles in kilometer: ");
            miles = input.nextDouble();
            if (miles == -1) moreTrip = -1;

        }
        System.out.println(totalTrip);
//        double AverageOfTotalTrip = totalTrip / moreTrip;
//        System.out.println("average of all trip is: " + AverageOfTotalTrip);
    }
}
