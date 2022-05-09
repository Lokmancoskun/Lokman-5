package KODLARIM;

import java.lang.constant.Constable;

public class back {


    public static void main(String[] args) {

        reversedlast("Lokman");
    }

    // 1. way

//         String last = str.valueOf(str.charAt(str.length()-1));
//         return last + str + last;

    // 2.way
    private static String reversedlast(String str) {

        String last = str.substring(str.length() - 1);
        System.out.println(last);

           return last +str;


            //        // 3.way
//        char last = str.charAt(str.length()-1);
//        return last + str + last;


        }

    }
