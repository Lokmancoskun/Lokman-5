package KODLARIM;

import java.lang.constant.Constable;
import java.util.Locale;

public class back {

    public static void main(String[] args) {

        //isimleri testen yazdirma

        stringreversed("Lokman");
        reversedString("Ayse");
        backToFront("Sungur");
        back("Ridvan");
        writingNameBack("Mustafa");

    }
    public static void stringreversed(String str) {
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println(reverse);

    }
    public static void reversedString(String str){

        String string = new StringBuilder(str).reverse().toString();
        System.out.println(string);
    }
    public static void backToFront(String str1){

        String str = new StringBuilder(str1).reverse().toString().toLowerCase(Locale.ROOT);
        System.out.println(str);
    }
    public static void back(String str2){

        String str = new StringBuilder(str2).reverse().toString().toUpperCase(Locale.ROOT);
        System.out.println(str);
    }
    public static void writingNameBack(String str3){

        String str = new StringBuilder(str3).reverse().toString();
        System.out.println(str);

    }
}

