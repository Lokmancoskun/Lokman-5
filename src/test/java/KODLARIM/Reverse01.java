package KODLARIM;

public class Reverse01 {

    public static void main(String[] args) {
        reverseString1("Veli Can");//by using stringbuilder
        //	String str2="Ayse Can";
        reverseString2("Ayse Can");//by using stringbuilder
        reverseString("Ali Can");//using for loop

        //by using array
        char chr[] = {'a','b','c'};
        printReverse(chr, 3 );

    }

    public static String reverseString(String str) {
        String reverse= "";
        //str="";
        for(int i = str.length()-1; i >=0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
        return reverse;
    }

    public static String reverseString1(String str1) {
        //String name= "Alper Aslan";
        String reversed = new StringBuilder(str1).reverse().toString();
        System.out.println(reversed);

        return reversed;
    }
    public static String reverseString2(String str2) {
//	String str = "Hello World";
        StringBuilder sb = new StringBuilder(str2);
        System.out.println(sb.reverse());
        return str2;

    }
    public static void printReverse(char[] letters, int size){


        for (int i = letters.length-1; i >= 0 ; i--){
            System.out.print(letters[i]);
        }
    }
}

