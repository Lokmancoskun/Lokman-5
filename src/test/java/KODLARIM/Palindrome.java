package KODLARIM;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        //  System.out.println(isPalindrome("abba"));
        isPalindrome("abba");

        String str1 = "abbc";
        StringBuilder sb1 = new StringBuilder(str1);
        if (str1 == null) {
            System.out.println("not palindrome");
        } else if (sb1.reverse().toString().equals(str1)) {//reversed string = original string
            //else if (sb1.reverse().equals(str1))
            System.out.println("palindrome");

        } else {
            System.out.println("not");
        }

    }

    public static boolean isPalindrome(String str) {
        if (str == null)
            return false;
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse().toString().equals(str));
        return sb.reverse().toString().equals(str);
    }
}
