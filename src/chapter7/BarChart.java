package chapter7;

public class BarChart {
    public static void main(String[] args) {
        int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
        System.out.println("Grade Distribution");
        for (int a = 0; a < array.length ; a++) {
            if (a == 10){
                System.out.printf("%5d: ", 100);
            }
            else {
                System.out.printf("%02d-%02d: ", 10 * a, 10 * a + 9 );
            }
            for (int i = 0; i < array[a]; i++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
