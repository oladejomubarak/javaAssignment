package brainstormFile;

public class PrintingTwoDimentionalArray {
    public static void main(String[] args) {
        int[][] array = {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int[] i : array){
            System.out.print("| ");
            for (int j : i){
                System.out.print(j);
                System.out.print(" ");
                System.out.print("| ");
            }
            System.out.println();
        }
    }


}
