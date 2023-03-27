package chapter8.time1;

public class Time1Test {
    public static void displayTime(String header, Time1 t){
        System.out.printf("%s%nUniversalTime: %s%nStandardTime: %s%n", header, t.toUniversalString(), t.toString());
    }
    public static void main(String[] args) {
        Time1 time1 = new Time1();

  displayTime("After time object is created", time1);
        System.out.println();
        time1.setTime(14, 45, 52);
        displayTime("After setting time", time1);
        System.out.println();

        try {
            time1.setTime(27, 63, 67);
        }
        catch (IllegalArgumentException e){
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }
        displayTime("After setting time with wrong values", time1);
    }

}
