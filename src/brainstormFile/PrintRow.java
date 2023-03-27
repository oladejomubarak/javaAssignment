package brainstormFile;

public class PrintRow {
    public static void main(String[] args) {
        int[][] nums = {{2, 3, 5, 6,}, {5, 4, 8, 9}, {3, 5, 6, 7}, {2, 5, 0, 2}};
        for (int num = 0; num < nums.length; num++){
            System.out.printf("number %d ", num + 1);
        }
    }
}
