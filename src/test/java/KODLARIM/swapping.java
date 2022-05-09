package KODLARIM;

import java.util.Scanner;

public class swapping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers to swap");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
//        System.out.println("Before swapping: " + n1 + " - " + n2);
//
//        double temp = n1;  //3
//   //     System.out.println("After swapping: " + n2 + " - " + n1);
//
//        n1 += n2;  //8=3+5
//        n2 = n1 - temp; //5 = 8-3
//        n1 -= n2;//8-5=3
//
//
//
//		n1 += n2;  //n1=n1+n2:8=3+5
//		n2 = n1-n2;//n2=8-5=3
//		n1 = n1 - n2;//n1=8-3=5
//
//		double temp = n1;
//		n1=n2;
//		n2=temp;

        double temp =n2;
        n2=n1;
        n1=temp;


        System.out.println("After swapping: " + n1 + " - " + n2);
    }

}

