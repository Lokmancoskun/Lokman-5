package KODLARIM;

import java.util.Locale;

public class reverse3 {

    public static void main(String[] args) {

        stringreversed("Ayse Coskun");
        reverseString("Lokman");
    }

    public static String stringreversed(String str) {
        String reversed = new StringBuilder(str).reverse().toString().toUpperCase(Locale.ROOT);
        System.out.println(reversed);

        return reversed;


    }

    public static String reverseString(String str) {
       String reverse = "";
//        str="";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse.toUpperCase(Locale.ROOT));
        return reverse;
    }
}

