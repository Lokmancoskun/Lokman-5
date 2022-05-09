package KODLARIM;

import java.util.Arrays;

public class NumberOfDigits {
    public static void main(String[] args) {
        int a = 1234567;
//1st way
        int num1 = (""+a).length(); //(a+"")
        System.out.println(num1);

//2nd way
        String str = Integer.toString(a);//converted integer to string
        System.out.println(str.length());

        //3rd way
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
//4th way
        int num = str.length();
        System.out.println(num);

        int count =0;
        while(a!=0){
            a = a/10;
            count++;

        }
        System.out.println("number of digits is: "+count);
    }
    }

