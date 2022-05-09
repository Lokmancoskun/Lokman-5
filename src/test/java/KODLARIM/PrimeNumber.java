package KODLARIM;

public class PrimeNumber {
    public static void main(String[] args) {
        checkPrime(14);
        checkPrime(17);
        checkPrime(413);
    }


    public static boolean checkPrime(int num) {

        for (int i = 2; i < num; i++) {
            // for (int i = 2; i < num/2; i++) {
            // for (int i = 2; i < Math.sqrt(num); i++) {


            if (num % i == 0) {
                System.out.println(num + " is not a prime number");

                return false;
            }
        }
        System.out.println(num + " is a prime number");

        return true;
    }

}