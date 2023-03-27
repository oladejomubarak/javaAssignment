package chapter7;

public class VarargsTest {
    public static double getAverage(double... numbers){
        double total = 0.0;
        for(double num : numbers){
            total+= num;
        }
        return total / numbers.length;
    }

    public static void main(String[] args) {
        double d1 = 5.0;
        double d2 = 10.0;
        double d3 = 20.0;
        System.out.printf("The average of d1 and d2 is %.1f%n", getAverage(d1, d2));
        System.out.printf("The average of d1, d2 and d3 is %.1f", getAverage(d1, d2, d3));


    }
}
