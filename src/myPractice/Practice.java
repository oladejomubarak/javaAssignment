package myPractice;

public class Practice {

    public static void main(String[] args) {
        int[] a = new int[10];
        int total = 0;
        for (int i = 0; i < 10; i++) {
           total += i*a.length;

        }
        System.out.println(total);
    }
}