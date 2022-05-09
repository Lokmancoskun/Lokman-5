package KODLARIM;

import static java.util.Collections.reverse;

public class reverse02 {

    public static void main(String[] args) {


        reverseString("Lokman");
    }

    private static String reverseString(String str) {
        StringBuilder reverse = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));

        }
        System.out.println(reverse);
        return reverse.toString();

    }



}

