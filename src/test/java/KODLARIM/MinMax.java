package KODLARIM;

import java.util.Arrays;
import java.util.Comparator;

public class MinMax {

    public static void main(String[] args) {
        int arr[] = {1, 7, 3, 5, 8, -2};

//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        int max1 = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int max2 = arr[0];
        int min2 = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (min2 > arr[i]) {

                min2 = arr[i];//-2

            }

        }
        System.out.println(min);
        System.out.println(min2);

        for (int i = 0; i < arr.length; i++) {

            if (max2 < arr[i]) {

                max2 = arr[i];//8

            }

        }
       // System.out.println(max);
        System.out.println(min2);//-2
        System.out.println(max2);

    }
}