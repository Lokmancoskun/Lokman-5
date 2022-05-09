package KODLARIM;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String str = scan.nextLine();
        StringBuilder strB = new StringBuilder();
        strB.append(str); //puts our string object into string builder container
        System.out.println(strB.reverse()); //to be able to use reverse()

        String revStr = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            revStr = revStr + str.charAt(i); //na
            //sum=0, sum=sum+... adds the sum to the new sum
        }

        System.out.println(revStr);

        System.out.println(revStr(str));
    }

    public static String revStr(String str) {
        String revStr = "";

        for(int i = str.length() - 1; i >= 0; --i) {
            revStr = revStr + str.charAt(i);
        }

        return revStr;
    }

}

