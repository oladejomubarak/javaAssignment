package myPractice;

public class ReverseString {
    public static void main(String[] args) {
        String arr = "hello";
        String reverseString = "";
        for (int i = arr.length() -1; i >= 0; i--) {
            reverseString += arr.charAt(i);
        }
        System.out.println(reverseString);
    }
}
