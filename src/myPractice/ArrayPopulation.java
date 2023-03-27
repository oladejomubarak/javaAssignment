package myPractice;

public class ArrayPopulation {
    public static void main(String[] args) {
        int populatedTotal = 0;
        int total= 0;
        int runningTotal= 0;
        int populated = 0;
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            populated = arr[i]*2;
            populatedTotal += arr[i]*2;
            System.out.println(populated);

        }
        System.out.println();
        System.out.println(populatedTotal);
        System.out.println();
        for (int j = 0; j < arr.length; j++) {
            runningTotal += arr[j];
            total += arr[j];
            System.out.println(runningTotal);

        }
        System.out.println();
        System.out.println(total);
    }
}
