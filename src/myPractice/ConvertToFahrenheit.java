package myPractice;

import java.util.Scanner;

public class ConvertToFahrenheit {
    public static void main( String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your temperature in Celsius: ");
        double temperatureInCelsius = input.nextInt();
        double temperatureInFahrenheit = ((9/5.0) * temperatureInCelsius) + 32;
        System.out.println(temperatureInCelsius+"C is equivalent to " + temperatureInFahrenheit+"F");


    }
}
