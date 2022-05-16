package KODLARIM;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.LinkedList;
import java.util.List;

public class Arrayslist {


    public static void main(String[] args) {
///   arrays ekleme

        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {11, 12, 13, 14, 15};

        int arr3[] = {4, 6, 8, 10, 12};
        int arr4[] = {3, 5, 7, 9, 11};

        int arr5 [] = {17,18,19,20,21};
        int arr6 [] = {31,32,33,34,35};

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(11, 12, 13, 14, 15));
        list1.addAll(list2);
        System.out.println(list1);


        List<Integer> list3 = new ArrayList<>(Arrays.asList(4, 6, 8, 10, 12));
        List<Integer> list4 = new ArrayList<>(Arrays.asList(3, 5, 7, 9, 11));
        list3.addAll(list4);
        System.out.println(list3);


        List<Integer> list5 = new ArrayList<>(Arrays.asList(17,18,19,20,21));
        List<Integer> list6 = new ArrayList<>(Arrays.asList(31,32,33,34,35));
        list6.addAll(list5);
        System.out.println(list6);
    }
}





