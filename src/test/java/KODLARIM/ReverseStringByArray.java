package KODLARIM;

import java.util.Arrays;

    public class ReverseStringByArray {

                public static void main(String[] args) {
            //       public void printReverse(char[] letters, int size){
            String str = "abc";
            String [] letters = str.split("");

            System.out.println(Arrays.toString(letters));
            for (int i = letters.length-1; i >= 0 ; i--){
                System.out.print(letters[i]);
            }
        }
    }

