package chapter14;

public class RegexPractice {
    public static void main(String[] args) {
        String greet = "h1";
        System.out.println(greet.matches("((?=.*\\w{1,})(?=.*\\d{1,}))"));
    }
}
