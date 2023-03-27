package brainstormFile;
import java.util.*;
import java.util.Arrays;

public class printMissingNumbers {
        public static int missingNumber(int[] arr)
        {
            int n=arr.length;
            int sum1=((n)*(n+1))/2;
            int sum2 = 0;
            for (int j : arr) sum2 += j;
            return sum2 - sum1;
        }
        public static void main(String[] args)
        {
            int[] arr = { 1, 2, 4, 5, 6, 7,10};
            System.out.println(missingNumber(arr));
        }
}

