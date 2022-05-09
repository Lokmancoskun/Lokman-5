package KODLARIM;

public class reverse4 {
    public static void main(String[] args) {
        revStr("Lokman");

    }
    public static String revStr(String str) {
        String revStr = "";

        for(int i = str.length() - 1; i >= 0; --i) {
            revStr = revStr + str.charAt(i);

        }
        System.out.println(revStr);

        return revStr;
    }

    }



