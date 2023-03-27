package myPractice;

public class MultiArray {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 3, 2}, {4, 3, 5}};
        int[][] arr2 = {{3, 4}, {8}, {3, 5, 7}};
        System.out.println("elements in arr1 by row are:");
        outputArray(arr1);
        System.out.println("elements in arr2 by row are:");
        outputArray(arr2);
    }
        public static void outputArray(int[][] array){
            for (int row = 0; row < array.length; row++) {
                for (int column = 0; column < array[row].length; column++){
                    System.out.printf("%d ", array[row][column]);
                }
                System.out.println();
            }

        }
}
