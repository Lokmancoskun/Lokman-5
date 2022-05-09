package KODLARIM;

import java.util.Locale;

public class FindingInitials {

    public static void main(String[] args) {
        //get the initials of first name and last name of the user. Ali Can ==> AC

        String str = ("Lokman Coskun").toLowerCase(Locale.ROOT);
        char initialOfFirstname = str.charAt (0);
        char initialOfLastname = str.charAt (str.indexOf(" ") + 1);
        System.out.println("" + initialOfFirstname + initialOfLastname);

    }
}
