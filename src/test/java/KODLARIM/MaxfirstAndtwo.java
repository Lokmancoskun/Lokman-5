package KODLARIM;

public class MaxfirstAndtwo {
    public static void main(String[] args) {
        int[] nums = {10, 5, 38, 9};
        int firstMax = nums[0];
        int secondMax = nums[0];


        for (int num : nums) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax) {
                secondMax = num;
            }
        }

        System.out.println(firstMax + "  ----  " + secondMax);


    }

}




