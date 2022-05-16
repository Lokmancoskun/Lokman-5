package KODLARIM;

import java.util.Arrays;
import java.util.Collections;

public class Max {

    public static void main(String[] args) {

        //Finding max

        int arr[] = {90,20,30,40,50};

        int max= arr[0];


        for(int i=0; i<arr.length; i++){

            if(arr[i]>max){

                max=arr[i];

           }

       }
        System.out.println("max: "+max);

       Arrays.sort(arr);
       System.out.println(Arrays.toString(arr));

    }

    }
