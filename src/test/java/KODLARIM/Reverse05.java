package KODLARIM;

public class Reverse05 {
    public static void main(String[] args) {


        reverseString("ab*c%de");
    }
    private static String reverseString(String str) {

        str=str.replaceAll("[^a-zA-Z]", "");
        System.out.println(str);
        StringBuilder reverse = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--) {
            reverse.append(str.charAt(i));

        }
        System.out.println(reverse);
        return reverse.toString();

    }

}

