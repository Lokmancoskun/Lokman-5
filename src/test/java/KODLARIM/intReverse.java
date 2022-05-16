package KODLARIM;

public class intReverse {

        public static void main(String[] args) {

            //1.way***********************************************
            int num = 12345;

            String str = String.valueOf(num);
            StringBuilder sb = new StringBuilder(str).reverse();
            System.out.println(sb);
            sb.reverse();
            System.out.println(sb);

            //2.way************************************************
            int num1= 36974;
            String str1 = String.valueOf(num1);
            String str2 = new StringBuilder(str1).reverse().toString();
            System.out.println(str2);


            //3.way**************************************************
            int reversed = 0;

            while(num>0){
                int digit = num%10;  //1234-->4//3//2//1
                reversed = reversed*10+digit;  //=0*10+5 = 5  //5*10+4 =54//54*10+3=543//543*10+2=5432//5432*10+1=54321
                num = num/10;  //1234 //123//12//1//0  //23/10=2.3=2

            }
            System.out.println(reversed);


            //4.way************************************************
            String s = "";

            for(;num!=0;num/=10){
                int digit = num%10;  //1234-->4//3//2//1
                reversed = reversed*10+digit;

            }
            System.out.println("last"+ reversed);

        }
    }


