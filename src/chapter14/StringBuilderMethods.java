package chapter14;

public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder("Hello, my baby girl");
        System.out.printf("string = %s%n", string.toString());
        System.out.printf("string length is = %d%n", string.length());
        System.out.printf("capacity of the string is = %d%n", string.capacity());
        string.ensureCapacity(76);
        System.out.printf("new capacity is = %d%n", string.capacity());
        string.setLength(8);
        System.out.printf("new length is %d%nstring is: %s%n", string.length(), string.toString());
    }
}
