package KODLARIM;

import java.util.Arrays;

public class LargestNumber02 {

    public static void main(String[] args) {
        int[] arr = {34, 56, 76, 35, 67};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("min"+arr[0]);
        System.out.println(arr[arr.length-1]);
        //  int max = arr[0];
        int max = Integer.MIN_VALUE;

        for (int w : arr) {
            if (w > max) {
                max = w;
            }}
        System.out.println(max);

    }
}
