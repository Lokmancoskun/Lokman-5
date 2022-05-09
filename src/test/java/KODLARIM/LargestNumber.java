package KODLARIM;

public class LargestNumber {
    public static void main(String[] args) {
        int a = 8, b = 99, c = 87;


        if (a > b && a > c) {
            System.out.println("max is: " + a);

        } else if (b > c) {
            System.out.println("max is: " + b);

        } else {
            System.out.println("max is: " + c);
        }
    }
}

//    int a = 99, b=99, c=87;  //if 2 numbers are equal
//     if(a>=b && a>=c){
//        System.out.println("max is: "+a);
//
//    }else if(b>=a && b>=c){
//        System.out.println("max is: "+b);
//
//    }else{
//        System.out.println("max is: "+c);
//    }



