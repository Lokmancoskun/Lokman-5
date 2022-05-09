package KODLARIM;

import java.util.Arrays;

public class Converting2DimensionalArrayTo1 {
    public static void main(String[] args) {
        int arr[][] = { {1,2}, {3,4,5}, {6, 7, 8, 9} };
        //get the number of elements from array arr.
        int sum =0;

        for(int[] w:arr) {
            sum = sum+w.length;  //2//2+3=5//5+4=9

        }//create 1 dim array by using the number of elements of arr as capacity of brr
        int brr[] = new int[sum]; //creating 1 dim array
        //create an int container for the index of brr
        int idx=0;
        for(int[] w: arr) {
            for(int x:w) {
                brr[idx] = x;
                idx++;
            }

        }
        System.out.println(Arrays.toString(brr));
    }
}