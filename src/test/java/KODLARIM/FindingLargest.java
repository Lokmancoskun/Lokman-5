package KODLARIM;

import java.util.Arrays;

public class FindingLargest {

    public static void main(String[] args) {
        int[] nums1 = {19, 56, 987, -100, 76};

      //  Solution First  - O(nlogn)
//        Arrays.sort(nums1);
//        System.out.println(nums1[nums1.length-1]);


        //second Solution
        int max = nums1[0];

        for (int i: nums1) {
            if(i > max){

                max = i;
            }
        }

        System.out.println("max:" +  max);


    }
}
