package KODLARIM;

public class AmstrongNumber {
    public static void main(String[] args) {
        int num = 155;
        int number;
        int temp;
        int total = 0;
        number=num;

        while(number!=0){
            temp = number % 10;  //153-->3//15-->5//1
            total=total+temp*temp*temp; //0+3x3x3=27//27+5x5x5//125+27//152+1x1x1=153
            number = number/10;  //153/10=15//15/10=1//1/10=0

        }if(total ==num){
            System.out.println(num +" is Amstrong Number");
        }else{
            System.out.println(num +" is not Amstrong Number");
        }
    }
}